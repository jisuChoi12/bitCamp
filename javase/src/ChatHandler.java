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
			System.out.println("클라이언트와 연결이 안되었습니다");
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
			// 입장
			String nickName = br.readLine();
			broadcast(nickName+"님이 입장하였습니다");
			
			// 받는부분
			String line = null;
			while(true) {
				line = br.readLine();
				// 퇴장
				if(line==null || line.toLowerCase().equals("exit")) {
					break;
				}
				// 대화
				broadcast("["+nickName+"] "+line);
			}
			// 퇴장일경우
			pw.println("exit"); // 해당 클라이언트에게 다시 exit메세지 돌려주기
			pw.flush();
			list.remove(this); // list에서 해당 핸들러 없애기
			broadcast(nickName+"님이 퇴장하였습니다"); // 다른 클라이언트들에게 메세지
			
			br.close(); // 닫기
			pw.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
