import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;



class ImageMove extends Frame implements ActionListener, WindowListener, MouseListener, KeyListener{
	private Button newB;
	private Button leftB;
	private Button rightB;
	private Button upB;
	private Button downB;
	private int x,y;

	public void init(){
		x=100;
		y=100;

		// button
		newB = new Button("초기화");
		leftB = new Button("←");
		rightB = new Button("→");
		upB = new Button("↑");
		downB = new Button("↓");
	
		Panel ButtonP = new Panel();
		ButtonP.setLayout(new GridLayout(1,5,3,0));
		ButtonP.add(newB);
		ButtonP.add(leftB);
		ButtonP.add(rightB);
		ButtonP.add(upB);
		ButtonP.add(downB);
		add("North",ButtonP);

		// window
		setTitle("이미지이동");
		setBounds(200,150,500,500);
		setVisible(true);

		

		// event
		this.addWindowListener(this);

		newB.addActionListener(this);
		leftB.addActionListener(this);
		rightB.addActionListener(this);
		upB.addActionListener(this);
		downB.addActionListener(this);
	

	}

	// image
	@Override
	public void paint(Graphics g){
		//Toolkit t = Toolkit.getDefaultToolkit();
		//Image img = t.getImage("jordy.jpg");
		Image img = Toolkit.getDefaultToolkit().getImage("jordy.jpg");
		g.drawImage(img,x,y,this);
	}

	// ActionListener
	public void actionPerformed(ActionEvent e){
		/*
		if(e.getSource()==newB){
			x=100;
			y=100;
			repaint();
		}
		*/
		// 문자열비교(String extends Object -> equals())가 아니라 참조값비교(Object -> equals())
		if(e.getActionCommand()=="초기화"){ 
			x=100;
			y=100;
			repaint();
		}
		else if(e.getSource()==leftB){
			if(x==-130) x=490;
			else x-=10;
		}
		else if(e.getSource()==rightB){
			if(x==490) x=-130;
			else x+=10;
		}
		else if(e.getSource()==upB){
			if(y==-60) y=490;
			else y-=10;
		}
		else if(e.getSource()==downB){
			if(y==490) y=-60;
			else y+=10;
		}
		//System.out.println(x+","+y);
		repaint();
	}

	//WindowListener
	public void	windowActivated(WindowEvent e){}

	public void	windowClosed(WindowEvent e){}

	public void	windowClosing(WindowEvent e){ System.exit(0); }

	public void	windowDeactivated(WindowEvent e){}

	public void	windowDeiconified(WindowEvent e){}

	public void	windowIconified(WindowEvent e){}

	public void	windowOpened(WindowEvent e){}

	// MouseListener
	public void	mouseClicked(MouseEvent e){}

	public void	mouseEntered(MouseEvent e){}

	public void	mouseExited(MouseEvent e){}

	public void	mousePressed(MouseEvent e){}

	public void	mouseReleased(MouseEvent e){}

	// KeyListener 
	public void	keyPressed(KeyEvent e){}

	public void	keyReleased(KeyEvent e){}

	public void	keyTyped(KeyEvent e){}


	public static void main(String[] args) {
		new ImageMove().init();
	}
}
