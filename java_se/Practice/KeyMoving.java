import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.Toolkit;
import java.lang.Runnable;

class KeyMoving extends JFrame implements KeyListener, Runnable {
	private int x = 150;
	private int y = 150;
	private int sel = 2;
	private int mx, my;
	private Canvas canvas;
	private static boolean running;
	private int sw = 0;

	public KeyMoving() {

		running = true;

		setBounds(300,200,500,500);
		setVisible(true);

		Container container = this.getContentPane();

		canvas = new Canvas(){
			@Override
			public void paint(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage("packman.jpg");
				g.drawImage(img,x,y,x+50,y+50,sel*50,0,sel*50+50,50,this);
			}
		};
		canvas.setBackground(Color.WHITE);
		container.add("Center",canvas);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		addKeyListener(this);
	}

	// KeyListener
	@Override
	public void keyPressed(KeyEvent e) {
		if(sw==0){ new Thread(this).start(); }

		if(e.getKeyCode()==e.VK_ESCAPE) { System.exit(0); }
		else if(e.getKeyCode()==e.VK_LEFT) { 
			sel=0; 
			running = true;
			mx = -10; 
			my = 0;	
			sw = 1;
		}
		else if(e.getKeyCode()==e.VK_RIGHT) {
			sel=2;
			running = true;
			mx = 10; 
			my = 0;	
			sw = 1;
		}
		else if(e.getKeyCode()==e.VK_UP) {
			sel=4;
			running = true;
			mx = 0; 
			my = -10;	
			sw = 1;
		}
		else if(e.getKeyCode()==e.VK_DOWN) {
			sel=6;
			running = true;
			mx = 0; 
			my = 10;
			sw = 1;
		}
	} 

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==e.VK_ESCAPE) { System.exit(0); }
		else if(e.getKeyCode()==e.VK_LEFT) {  
			mx = 0;
			my = 0;
			sel = 0;
		}
		else if(e.getKeyCode()==e.VK_RIGHT) {
			mx = 0;
			my = 0;
			sel = 2;
		}
		else if(e.getKeyCode()==e.VK_UP) {
			mx = 0;
			my = 0;
			sel = 4;
		}
		else if(e.getKeyCode()==e.VK_DOWN) {
			mx = 0;
			my = 0;
			sel = 6;
		}
		running = false; 

	}

	@Override
	public void keyTyped(KeyEvent e) {}

	
	@Override
	public void run() {
		while(true){ 
			if(sel%2==0) { sel++; }
			else { sel--; }
			x = x + mx;
			y = y + my;
			canvas.repaint();
			try{
				Thread.sleep(80); // 1/1000¥‹¿ß
			} catch(InterruptedException e) { e.printStackTrace(); }
		}
	}
	
	
	
	public static void main(String[] args) {
		new KeyMoving();
	}
}
