import java.io.Serializable;

enum Info {
	JOIN, EXIT, SEND
}

public class InfoDTO implements Serializable {
	private String nickName;
	private String message;
	private Info command;

	public InfoDTO() {
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setCommand(Info command) {
		this.command = command;
	}

	public String getNickName() {
		return nickName;
	}

	public String getMessage() {
		return message;
	}

	public Info getCommand() {
		return command;
	}
}

// �����ʹ� InfoDTO �Ѱ��ְ� �ް�
// BufferedReader, PrintWriter X
// ��� ObjectInputStream ObjectOutputStream