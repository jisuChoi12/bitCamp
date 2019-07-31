import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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

class ChatClient extends JFrame implements ActionListener, Runnable {
	private JTextField input;
	private JTextArea output;
	private JButton sendB;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public ChatClient() {
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

		// 이벤트
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e ) {
				pw.println("exit");
				pw.flush();
			}
		});
	}

	public void service() {
		// 서버IP
		// String serverIP = JOptionPane.showInputDialog(this,"서버IP를
		// 입력하세요","서버IP",JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this, "서버IP를 입력하세요", "192.168.0.26");
		if (serverIP == null || serverIP.length() == 0) {
			JOptionPane.showMessageDialog(this, "서버IP가 입력되지 않았습니다");
			System.exit(0);
		}
		// 닉네임
		String nickName = JOptionPane.showInputDialog(this, "닉네임을 입력하세요", "닉네임", JOptionPane.INFORMATION_MESSAGE);
		if (nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}

		// socket
		try {
			socket = new Socket(serverIP, 9500);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 서버로 보내기
			pw.println(nickName);
			pw.flush();
			
		} catch(UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다");
			e.printStackTrace();
			System.exit(0);

		} catch(IOException e) {
			System.out.println("서버와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
		
		sendB.addActionListener(this);
		input.addActionListener(this);
		// 스레드 생성/시작
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 서버로 보내기
		String line = input.getText();
		pw.println(line);
		pw.flush();
		input.setText("");
	}

	@Override
	public void run() {
		// 서버로부터 받기
		String line;
		while (true) {
			try {
				line = br.readLine();
				if (line == null || line.toLowerCase().equals("exit")) {// lower() - oracle에서
					br.close();
					pw.close();
					socket.close();
					System.exit(0);
				}
				output.append(line + "\n");
				
				int pos = output.getText().length();
				output.setCaretPosition(pos);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ChatClient().service();
	}
}
