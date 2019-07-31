import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerObject {
	private ServerSocket ss;
	private ArrayList<ChatHandlerObject> list;

	public ChatServerObject() {
		try {
			ss = new ServerSocket(9500); // 서버소켓 - 클라이언트가 접속하기를 기다린다
			System.out.println("서버준비완료");

			list = new ArrayList<ChatHandlerObject>(); // 각각의 handler(socket)을 담기위한 ArrayList 생성

			while (true) { // 서버가 켜져있는 동안 계속 반복
				Socket socket = ss.accept(); // 클라이언트가 접속하면 socket생성
				
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
