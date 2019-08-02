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
			System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		}
	}

	public void broadcast(InfoDTO sendDTO) { // ����Ʈ�� ����� ������ handler-client�� InfoDTO ����
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
		// Ŭ���̾�Ʈ�κ��� �ޱ�
		String nickName = null;
		String message = null;
		InfoDTO infoDTO = null;
		while (true) {
			try {
				infoDTO = ((InfoDTO) ois.readObject());

				if (infoDTO.getCommand() == (Info.JOIN)) {
					nickName = infoDTO.getNickName();
					
					// ��� Ŭ���̾�Ʈ���� ���� �޼��� ������
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage(nickName+"���� �����Ͽ����ϴ�");
					broadcast(sendDTO);
					
				} else if (infoDTO.getCommand() == (Info.SEND)) {
					message = infoDTO.getMessage();
					
					// ��� Ŭ���̾�Ʈ���� ���� �޼��� ������
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage("["+nickName+"] "+message);
					broadcast(sendDTO);
					
					
				} else if (infoDTO.getCommand() == (Info.EXIT)) {
					// ���� ������ ������ Ŭ���̾�Ʈ���� ���� �޼��� ������
					list.remove(this);
					
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMessage(nickName + "���� �����Ͽ����ϴ�");
					broadcast(sendDTO);
					
					// �����״� EXIT
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
