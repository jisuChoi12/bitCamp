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
		sendB = new JButton("������");
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
		
		setTitle("ä��â");
		setBounds(700, 300, 300, 300);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() { // ������â �ݱ��ư
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
		// IP (�����Ҷ�)
		String serverIP = JOptionPane.showInputDialog(this, "����IP�� �Է��ϼ���", "192.168.0.26");
		if(serverIP == null || serverIP.length()==0) {
			JOptionPane.showMessageDialog(this, "����IP�� �Էµ��� �ʾҽ��ϴ�");
			System.exit(0);
		}
		
		// �г��� (�����Ҷ�)
		String nickName = JOptionPane.showInputDialog(this, "�г����� �Է��ϼ���", "�г���", JOptionPane.INFORMATION_MESSAGE);
		if (nickName == null || nickName.length() == 0) {
			nickName = "guest"; // �г����� �Է����� ������ guest�� ����
		}
		
		// ����
		try {
			socket = new Socket(serverIP,9500);
			
			// Ŭ���̾�Ʈ���� ���� �� �г����� ���� �����ִϱ� ��� ��Ʈ���� ���� ��������� �Ѵ�
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			// ������ ������
			InfoDTO infoDTO = new InfoDTO(); 
			infoDTO.setCommand(Info.JOIN); // command - join
			infoDTO.setNickName(nickName); 
			
			oos.writeObject(infoDTO);
			oos.flush();
			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		}
		
		// send �̺�Ʈ
		sendB.addActionListener(this);
		input.addActionListener(this);
		
		// ������ ����/����
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ ������
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
		// ������ ���� �ޱ�
		while (true) {
			try {
				InfoDTO infoDTO = ((InfoDTO) ois.readObject()); 
				
				if (infoDTO.getCommand()==null || infoDTO.getCommand()==(Info.EXIT)) { // TCP(�����) - �����κ��� EXIT command�� ������ ����
					ois.close();
					oos.close();
					socket.close();
					System.exit(0);
				} else {
					output.append(infoDTO.getMessage() + "\n");
				}
				int pos = output.getText().length(); // ��ũ�� �ڵ�
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
