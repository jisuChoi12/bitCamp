import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login extends Frame implements WindowListener, ActionListener{
	private TextField idT, pwdT; // 이번트 발생 있으니까 필드
	private Button loginB, cancelB;

	public Login(){
		// window
		setTitle("로그인");
		setLayout(null);

		Label idL = new Label("아이디"); // 이벤트 발생 없으니까 생성자 안의 지역변수
		Label pwdL = new Label("비밀번호");

		idT = new TextField();
		pwdT = new TextField();

		loginB = new Button("로그인");
		cancelB = new Button("취소");

		idL.setBounds(50,80,60,30);
		idT.setBounds(120,80,100,30);
		pwdL.setBounds(50,130,60,30);
		pwdT.setBounds(120,130,100,30);

		add(idL);
		add(pwdT);
		add(idT);
		add(pwdL);

		loginB.setBounds(70,200,60,30);
		cancelB.setBounds(140,200,60,30);

		add(loginB);
		add(cancelB);

		setBounds(200,150,280,280);
		setVisible(true);

		// event
		this.addWindowListener(this);
		loginB.addActionListener(this);
		cancelB.addActionListener(this);
	}

	// ActionListener
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==loginB){
			// id:angel pwd:1004 -> 로그인 성공
			LoginResult lr = new LoginResult(idT.getText(), pwdT.getText());
		}
		else if (e.getSource()==cancelB){
			idT.setText(" ");idT.setText("");
			pwdT.setText(" ");pwdT.setText("");
		}
	}

	//WindowListener
	public void	windowActivated(WindowEvent e){}

	public void	windowClosed(WindowEvent e){}

	public void	windowClosing(WindowEvent e){ System.exit(0); }

	public void	windowDeactivated(WindowEvent e){}

	public void	windowDeiconified(WindowEvent e){}

	public void	windowIconified(WindowEvent e){}

	public void	windowOpened(WindowEvent e){}

	public static void main(String[] args) {
		new Login();
	}
}
