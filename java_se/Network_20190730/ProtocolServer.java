import java.io.*;
import java.net.*;

class ProtocolServer {
	private ServerSocket ss;
	private BufferedReader br;
	private BufferedWriter bw;
	private Socket socket;

	public ProtocolServer(){
		try {
			ss = new ServerSocket(9500); // Ŭ���̾�Ʈ ��ٸ�����
			System.out.println("�����غ�Ϸ�");

			Socket socket = ss.accept();  // ���� ����

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		}

		String line = null;
		while(true){
			try { 
				// �޴� ��
				line = br.readLine();
				
				// ������ ��
				String[] ar = line.split(":");

				if(ar[0].equals(Protocol.ENTER)){
					// ddd�� ���� ��� Ŭ���̾�Ʈ���� ������ / ���� ����
					bw.write(ar[1]+"�� ����\n");
					bw.flush();
				}
				else if(ar[0].equals(Protocol.EXIT)){
					// ddd�� ���� / �ݱ�
					bw.write(ar[1]+"�� ����\n");
					bw.flush();
					br.close();
					bw.close();
					socket.close();
					System.exit(0);
				}
				else if(ar[0].equals(Protocol.SEND_MESSAGE)){
					bw.write("["+ar[1]+"] "+ar[2]+"\n");
					bw.flush();
				}
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�");
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new ProtocolServer();
	}
}
