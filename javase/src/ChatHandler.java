import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ChatHandler extends Thread{
	private BufferedReader br;
	private PrintWriter pw;
	private Socket socket;
	private ArrayList<ChatHandler> list;

	public ChatHandler(Socket socket, ArrayList<ChatHandler> list) {
		this.socket = socket;
		this.list = list;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void broadcast(String msg) {
		for (ChatHandler handler : list) {
			handler.pw.println(msg);
			handler.pw.flush();
		}
	}
	
	@Override
	public void run() {
		try {
			// ����
			String nickName = br.readLine();
			broadcast(nickName+"���� �����Ͽ����ϴ�");
			
			// �޴ºκ�
			String line = null;
			while(true) {
				line = br.readLine();
				// ����
				if(line==null || line.toLowerCase().equals("exit")) {
					break;
				}
				// ��ȭ
				broadcast("["+nickName+"] "+line);
			}
			// �����ϰ��
			pw.println("exit"); // �ش� Ŭ���̾�Ʈ���� �ٽ� exit�޼��� �����ֱ�
			pw.flush();
			list.remove(this); // list���� �ش� �ڵ鷯 ���ֱ�
			broadcast(nickName+"���� �����Ͽ����ϴ�"); // �ٸ� Ŭ���̾�Ʈ�鿡�� �޼���
			
			br.close(); // �ݱ�
			pw.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
