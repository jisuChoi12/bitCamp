import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.lang.Runnable;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.lang.Math;

class Packman extends Frame implements KeyListener, Runnable {
	private int sel=2;
	private int x = 225;
	private int y = 225;
	private int mx, my;
	private int[] foodX, foodY;

	public Packman(){
		foodX = new int[5];
		foodY = new int[5];

		setBounds(200,150,500,500);
		setVisible(true);
		setResizable(false);

		for(int i=0; i<5; i++){
			foodX[i]=(int)(Math.random()*450)+25;
			foodY[i]=(int)(Math.random()*450)+25;
		}
		// event
		addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		addKeyListener(this);

		Thread t = new Thread(this); // 스레드 생성
		t.start(); // 스레드 시작
	}

	@Override
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("Packman.jpg");
		Image img2 = Toolkit.getDefaultToolkit().getImage("food.jpg");
		//              화면위치            메모리위치
		//              x1,y1,x2,y2     x1,y1,x2,y2 
		g.drawImage(img,x,y,x+50,y+50,sel*50,0,sel*50+50,50,this);
		for(int i=0; i<5; i++) {
			g.drawImage(img2,foodX[i],foodY[i],this);
		}
	}

	// Thread
	@Override
	public void run() {
		while(true){ 
			// packman
			if(sel%2==0) { sel++; }
			else { sel--; }
			x = x + mx;
			y = y + my;
				
			if(x<-50) { x=500; }
			else if(x>500) { x=-50; }
			if(y<-50) { y=500; }
			else if(y>500) { y=-50; }

			//food
			for(int i=0; i<5; i++) {
				if((x+25>foodX[i]-10 && y+25>foodY[i]-10) && (x+25<foodX[i]+30 && y+25<foodY[i]+30)){
					foodX[i]=-500; 
					foodY[i]=-500;
				}
			}
			

			repaint();
			try{
				Thread.sleep(80); // 1/1000단위
			} catch(InterruptedException e) { e.printStackTrace(); }
		}
	}

	// KeyListener
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_ESCAPE) { System.exit(0); }
		else if(e.getKeyCode()==e.VK_LEFT) { sel=0; mx=-10; my=0; }
		else if(e.getKeyCode()==e.VK_RIGHT) { sel=2; mx=10; my=0;}
		else if(e.getKeyCode()==e.VK_UP) { sel=4; my=-10; mx=0;}
		else if(e.getKeyCode()==e.VK_DOWN) { sel=6; my=10; mx=0;}
	} 

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}


	public static void main(String[] args) {
		new Packman();
	}
}

//'A' 65 'a' 97 '0' 48