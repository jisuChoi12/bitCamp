import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClientObject extends JFrame implements ActionListener, Runnable {
	private JTextField input;
	private JTextArea output;
	private JButton sendB;
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public ChatClientObject() {
		input = new JTextField();
		output = new JTextArea();
		output.setEditable(false);
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sendB = new JButton("보내기");
		GridBagLayout gb = new GridBagLayout();
		JPanel panel = new JPanel();
		panel.setLayout(gb);
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.weightx = 1.0;
		panel.add(input, gc);
		gc.weightx = 0.0;
		panel.add(sendB, gc);
		Container con = getContentPane();
		con.add("Center", scroll);
		con.add("South", panel);
		
		setTitle("채팅창");
		setBounds(700, 300, 300, 300);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() { // 윈도우창 닫기버튼
			@Override
			public void windowClosing(WindowEvent e) {
				InfoDTO infoDTO = new InfoDTO();
				infoDTO.setCommand(Info.EXIT); // command - exit
				try {
					oos.writeObject(infoDTO);
					oos.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	
	public void service() {
		// IP (시작할때)
		String serverIP = JOptionPane.showInputDialog(this, "서버IP를 입력하세요", "192.168.0.26");
		if(serverIP == null || serverIP.length()==0) {
			JOptionPane.showMessageDialog(this, "서버IP가 입력되지 않았습니다");
			System.exit(0);
		}
		
		// 닉네임 (시작할때)
		String nickName = JOptionPane.showInputDialog(this, "닉네임을 입력하세요", "닉네임", JOptionPane.INFORMATION_MESSAGE);
		if (nickName == null || nickName.length() == 0) {
			nickName = "guest"; // 닉네임을 입력하지 않으면 guest로 시작
		}
		
		// 소켓
		try {
			socket = new Socket(serverIP,9500);
			
			// 클라이언트에서 보낼 때 닉네임을 먼저 보내주니까 출력 스트림을 먼저 생성해줘야 한다
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			// 서버로 보내기
			InfoDTO infoDTO = new InfoDTO(); 
			infoDTO.setCommand(Info.JOIN); // command - join
			infoDTO.setNickName(nickName); 
			
			oos.writeObject(infoDTO);
			oos.flush();
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
		
		// send 이벤트
		sendB.addActionListener(this);
		input.addActionListener(this);
		
		// 스레드 생성/시작
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 서버로 보내기
		InfoDTO infoDTO = new InfoDTO(); 
		infoDTO.setCommand(Info.SEND); // command - send
		infoDTO.setMessage(input.getText());
		try {
			oos.writeObject(infoDTO);
			oos.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		input.setText("");
	}

	@Override
	public void run() {
		// 서버로 부터 받기
		while (true) {
			try {
				InfoDTO infoDTO = ((InfoDTO) ois.readObject()); 
				
				if (infoDTO.getCommand()==null || infoDTO.getCommand()==(Info.EXIT)) { // TCP(동기식) - 서버로부터 EXIT command를 받으면 종료
					ois.close();
					oos.close();
					socket.close();
					System.exit(0);
				} else {
					output.append(infoDTO.getMessage() + "\n");
				}
				int pos = output.getText().length(); // 스크롤 자동
				output.setCaretPosition(pos);
				
			} catch (ClassNotFoundException e) {				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ChatClientObject().service();
	}
}
