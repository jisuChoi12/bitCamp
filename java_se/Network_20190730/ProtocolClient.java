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
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // IO설정 (socket)
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // IO설정 (socket)
			keyboard = new BufferedReader(new InputStreamReader(System.in)); // IO설정 (keyboard)

		} catch(UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다");
			e.printStackTrace();
			System.exit(0);

		} catch(IOException e) {
			System.out.println("서버와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
		
		String msg = null;
		String line = null;
		while(true){
			try {
				// 보내는 쪽
				msg = keyboard.readLine(); // 키보드로부터 입력받기
				bw.write(msg+"\n");// 서버로 보내기
				bw.flush(); // 버퍼 비우기 ... 그래야 다음 데이터가 들어오니까

				// 받는 쪽
				line = br.readLine(); // 서버로부터 읽기
				System.out.println(line);

				// 종료
				String[] ar = msg.split(":");
				if(ar[0].equals(Protocol.EXIT)){
					br.close();
					bw.close();
					keyboard.close();
					socket.close();
					System.exit(0);
				}

			} catch(IOException e) {
				System.out.println("서버와 연결이 안되었습니다");
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