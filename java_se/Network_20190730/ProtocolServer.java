import java.io.*;
import java.net.*;

class ProtocolServer {
	private ServerSocket ss;
	private BufferedReader br;
	private BufferedWriter bw;
	private Socket socket;

	public ProtocolServer(){
		try {
			ss = new ServerSocket(9500); // 클라이언트 기다리는중
			System.out.println("서버준비완료");

			Socket socket = ss.accept();  // 소켓 생성

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}

		String line = null;
		while(true){
			try { 
				// 받는 쪽
				line = br.readLine();
				
				// 보내는 쪽
				String[] ar = line.split(":");

				if(ar[0].equals(Protocol.ENTER)){
					// ddd님 입장 라고 클라이언트에세 보내기 / 버퍼 비우기
					bw.write(ar[1]+"님 입장\n");
					bw.flush();
				}
				else if(ar[0].equals(Protocol.EXIT)){
					// ddd님 퇴장 / 닫기
					bw.write(ar[1]+"님 퇴장\n");
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
				System.out.println("클라이언트와 연결이 안되었습니다");
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new ProtocolServer();
	}
}
