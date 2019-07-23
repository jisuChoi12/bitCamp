import java.awt.Frame;
import java.awt.Panel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Runnable;

class Clock extends Frame implements Runnable {

	public Clock(String title){
		setTitle(title);
		setBounds(200,150,400,100);
		setFont(new Font("고딕체",Font.BOLD,36));
		setVisible(true);

		// event
		addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		Thread t = new Thread(this); // 스레드 생성 - Runnable을 가진 클래스를 생성해야 한다.
		t.start(); // 스레드 시작
	}

	@Override
	public void run() {
		while(true) {
			repaint();
			try{
				Thread.sleep(1000); // 1/1000단위
			} catch(InterruptedException e) { e.printStackTrace(); }
		}
	}

	@Override
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("a hh : mm : ss");

		Date date = new Date();
		g.drawString(sdf.format(date),60,60);
	}

	public static void main(String[] args) {
		new Clock("시계");
	}
}
