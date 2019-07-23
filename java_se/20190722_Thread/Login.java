import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Time;
import java.util.Timer;


public class Login extends Frame implements ActionListener{
	private TextField idT, pwdT;
	private Button loginB, cancelB;
	private Label idL, pwdL;
	
	
	public Login() {
		
		idT = new TextField();
		pwdT = new TextField();
		loginB = new Button("로그인");
		cancelB = new Button("취소");
		idL = new Label("아이디");
		pwdL = new Label("비밀번호");
		
		
		
		idL.setBounds(50,80,60,30);
		idT.setBounds(120,80,100,30);
		pwdL.setBounds(50,130,60,30);
		pwdT.setBounds(120,130,100,30);
		
		add(idL); add(pwdL); add(pwdT); add(idT); 
		
		loginB.setBounds(70,200,60,30);
		cancelB.setBounds(140,200,60,30);

		add(loginB); add(cancelB);
		
		// window
		setLayout(null);
		setTitle("login");
		setBounds(200,150,280,280);
		setVisible(true);
		
		// event
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		loginB.addActionListener(this);
		cancelB.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new Login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginB){
			// id:angel pwd:1004 -> 로그인 성공
//			LoginResult lr = new LoginResult(idT.getText(), pwdT.getText());
			if(idT.getText().contentEquals("angel")&& pwdT.getText().equals("1004")) {
				dispose();
				GameStart gs = new GameStart();
			}
		}
		else if (e.getSource()==cancelB){
			idT.setText(" ");idT.setText("");
			pwdT.setText(" ");pwdT.setText("");
		}
	}

}

//-------------------------------------------------------------------------

class GameStart extends Frame implements Runnable{
	private int sel=2;
	private int x = 225;
	private int y = 225;
	private int mx, my;
	private Button upB, downB, leftB, rightB;
	private static boolean running;
	private Thread t;
	
	public GameStart() {

		running = true;
		
		upB = new Button("↑");
		downB = new Button("↓");
		leftB = new Button("←");
		rightB = new Button("→");
		
		Panel btnP = new Panel();
		btnP.add(upB);
		btnP.add(downB);
		btnP.add(leftB);
		btnP.add(rightB);
		add("South",btnP);
		
		setBackground(new Color(175,225,200));
		setTitle("animal crossing");
		setBounds(500,150,600,600);
		setVisible(true);
		
		t = new Thread(this);
		t.start();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		leftB.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(running=true){
					mx = -10; 
					my = 0;
				} else {
					running = true;
					t.start();
					mx = -10; 
					my = 0;					
				}
			}
		});
		leftB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				running = false;
				repaint();
			}
		});
		rightB.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(running=true){
					mx = 10; 
					my = 0;
				} else {
					running = true;
					t.start();
					mx = 10; 
					my = 0;					
				}
			}
		});
		rightB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				running = false;
	
			}
		});

		upB.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("?");
					running = true;
					t.resume();
					my = -10;
					mx = 0;
			}
		});
		upB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("111="+running);
				running = false;
				System.out.println("222="+running);
				t.stop();
			}
		});

		downB.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(running=true){
					my = 10;
					mx = 0;
				} else {
					running = true;
					t.start();
					my = 10;
					mx = 0;
				}
			}
		});
		downB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				running = false;
				repaint();
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("packman.jpg");
		
		g.drawImage(img,x,y,x+50,y+50,sel*50,0,sel*50+50,50,this);
	}

	@Override
	public void run() {
		System.out.println(running);
		while(running) {
			x = x+mx;
			y = y+my;
			repaint();
			try{
				Thread.sleep(80); // 1/1000단위
			} catch(InterruptedException e) { e.printStackTrace(); }
		}
	}
}