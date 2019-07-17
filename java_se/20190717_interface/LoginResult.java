import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class LoginResult extends Frame implements WindowListener{
	private String status;
	//private String id;
	//private String pwd;

	public LoginResult(String id, String pwd){
		//this.id = id;
		//this.pwd = pwd;

		setBounds(500,150,200,200);
		setVisible(true);

		if(id.equals("angel") && pwd.equals("1004")){
			status = "로그인 성공";
		} else {
			status = "로그인 실패";
		}

		this.addWindowListener(this);
	}
	
	@Override
	public void paint(Graphics g){ 
		//if(id.equals("angel") && pwd.equals("1004")){
		//	g.drawString("로그인 성공",70,100);
		//} else {
		//	g.drawString("로그인 실패",70,100);
		//}
		g.drawString(status,70,100);
	}

	//WindowListener
	public void	windowActivated(WindowEvent e){}

	public void	windowClosed(WindowEvent e){}

	public void	windowClosing(WindowEvent e){ 
		//setVisible(false);
		dispose(); 
	}

	public void	windowDeactivated(WindowEvent e){}

	public void	windowDeiconified(WindowEvent e){}

	public void	windowIconified(WindowEvent e){}

	public void	windowOpened(WindowEvent e){}
}
