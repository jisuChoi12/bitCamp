import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerObject {
	private ServerSocket ss;
	private ArrayList<ChatHandlerObject> list;

	public ChatServerObject() {
		try {
			ss = new ServerSocket(9500); // �������� - Ŭ���̾�Ʈ�� �����ϱ⸦ ��ٸ���
			System.out.println("�����غ�Ϸ�");

			list = new ArrayList<ChatHandlerObject>(); // ������ handler(socket)�� ������� ArrayList ����

			while (true) { // ������ �����ִ� ���� ��� �ݺ�
				Socket socket = ss.accept(); // Ŭ���̾�Ʈ�� �����ϸ� socket����
				
				ChatHandlerObject handler = new ChatHandlerObject(socket, list); 
				handler.start();
				list.add(handler);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChatServerObject();
	}
}
