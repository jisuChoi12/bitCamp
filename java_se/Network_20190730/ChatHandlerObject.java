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
	private InfoDTO infoDTO;

	public ChatHandlerObject(Socket socket, ArrayList<ChatHandlerObject> handlerList) {
		this.socket = socket;
		this.list = handlerList;
		try {
			ois = new ObjectInputStream((socket.getInputStream()));
			oos = new ObjectOutputStream((socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		}
	}

	public void broadcast(InfoDTO infoDTO) { // ����Ʈ�� ����� ������ handler-client�� InfoDTO ����
		for (ChatHandlerObject handler : list) {
			try {
				handler.oos.writeObject(infoDTO);
				handler.oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// Ŭ���̾�Ʈ�κ��� �ޱ�
		String nickName = null;
		String message = null;
		while (true) {
			try {
				infoDTO = ((InfoDTO) ois.readObject());

				if (infoDTO.getCommand() == (Info.JOIN)) {
					nickName = infoDTO.getNickName();
					infoDTO.setMessage(nickName + "���� �����Ͽ����ϴ�");
					broadcast(infoDTO);
				} else if (infoDTO.getCommand() == (Info.SEND)) {
					message = infoDTO.getMessage();
					infoDTO.setMessage("[" + nickName + "] " + message);
					broadcast(infoDTO);
				} else if (infoDTO.getCommand() == (Info.EXIT)) {
					infoDTO.setCommand(Info.EXIT);
					infoDTO.setMessage(nickName + "���� �����Ͽ����ϴ�");
					broadcast(infoDTO);
					list.remove(this);
					ois.close();
					oos.close();
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
