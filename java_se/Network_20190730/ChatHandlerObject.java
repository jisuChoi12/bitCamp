import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ChatHandlerObject extends Thread {
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket socket;
	private ArrayList<ChatHandlerObject> list;

	public ChatHandlerObject(Socket socket, ArrayList<ChatHandlerObject> handlerList) {
		this.socket = socket;
		this.list = handlerList;
		try {
			ois = new ObjectInputStream((socket.getInputStream()));
			oos = new ObjectOutputStream((socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
	}

	public void broadcast(InfoDTO sendDTO) { // 리스트에 저장된 각각의 handler-client에 InfoDTO 쓰기
		for (ChatHandlerObject handler : list) {
			try {
				handler.oos.writeObject(sendDTO);
				handler.oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// 클라이언트로부터 받기
		String nickName = null;
		String message = null;
		InfoDTO infoDTO = null;
		while (true) {
			try {
				infoDTO = ((InfoDTO) ois.readObject());

				if (infoDTO.getCommand() == (Info.JOIN)) {
					nickName = infoDTO.getNickName();
					
					// 모든 클라이언트에게 입장 메세지 보내기
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage(nickName+"님이 입장하였습니다");
					broadcast(sendDTO);
					
				} else if (infoDTO.getCommand() == (Info.SEND)) {
					message = infoDTO.getMessage();
					
					// 모든 클라이언트에게 입장 메세지 보내기
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage("["+nickName+"] "+message);
					broadcast(sendDTO);
					
					
				} else if (infoDTO.getCommand() == (Info.EXIT)) {
					// 나를 제외한 나머지 클라이언트에게 퇴장 메세지 보내기
					list.remove(this);
					
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage(nickName + "님이 퇴장하였습니다");
					broadcast(sendDTO);
					
					// 나한테는 EXIT
					sendDTO.setCommand(Info.EXIT);
					oos.writeObject(sendDTO);
					oos.flush();
					
					ois.close();
					oos.close();
					socket.close();
					
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
