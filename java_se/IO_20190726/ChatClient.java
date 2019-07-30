
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

class ChatClient extends JFrame {
	private JTextField input;
	private JTextArea output;
	private JButton sendB;

	public ChatClient() {
		input = new JTextField();
		output = new JTextArea();
		output.setEditable(false);
		sendB = new JButton("보내기");
		
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		JPanel panel = new JPanel();
		panel.setLayout(gb);
		
		gc.fill=GridBagConstraints.BOTH;
		gc.weightx=1.0;
		panel.add(input,gc);
		gc.weightx=0.0;
		panel.add(sendB,gc);
		
		Container con = getContentPane();
		JScrollPane scroll = new JScrollPane(output);

		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		con.add("Center", scroll);
		con.add("South",panel);

		setTitle("채팅창");
		setBounds(300, 300, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
}
