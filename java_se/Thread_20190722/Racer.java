import java.awt.Canvas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.lang.Thread;

class Racer extends Canvas implements Runnable { // canvas는 component -> container 필요
	private int pos;
	private String name;
	private static int rank=1;

	public Racer(String name){
		//setBackground(new Color((int)(Math.random()*256),120,120));
		this.name = name;
	}

	public void run(){
		for(int i=0; i<600; i+=((int)(Math.random()*10)+1)){
			pos=i;
			repaint();
			try{
				Thread.sleep(100);
			} catch(InterruptedException e) { e.printStackTrace(); }
	
		}
		// 등수체크
		System.out.println(rank+"등: "+name);
		rank++;
	}

	public void paint(Graphics g){
		Image img = Toolkit.getDefaultToolkit().getImage("horse.gif");
		g.drawImage(img,pos,0,(this.getSize().height*2),this.getSize().height,this); // x좌표,y좌표,너비,높이
	}
}
