import java.io.*;
import java.net.*;

class ProtocolClient {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;

	public ProtocolClient(){
		try{
			socket = new Socket("192.168.0.26",9500);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // IO���� (socket)
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // IO���� (socket)
			keyboard = new BufferedReader(new InputStreamReader(System.in)); // IO���� (keyboard)

		} catch(UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�");
			e.printStackTrace();
			System.exit(0);

		} catch(IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		}
		
		String msg = null;
		String line = null;
		while(true){
			try {
				// ������ ��
				msg = keyboard.readLine(); // Ű����κ��� �Է¹ޱ�
				bw.write(msg+"\n");// ������ ������
				bw.flush(); // ���� ���� ... �׷��� ���� �����Ͱ� �����ϱ�

				// �޴� ��
				line = br.readLine(); // �����κ��� �б�
				System.out.println(line);

				// ����
				String[] ar = msg.split(":");
				if(ar[0].equals(Protocol.EXIT)){
					br.close();
					bw.close();
					keyboard.close();
					socket.close();
					System.exit(0);
				}

			} catch(IOException e) {
				System.out.println("������ ������ �ȵǾ����ϴ�");
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new ProtocolClient();
	}
}


//PrintWriter pw
//pw.println(msg);