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
		setFont(new Font("���ü",Font.BOLD,36));
		setVisible(true);

		// event
		addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		Thread t = new Thread(this); // ������ ���� - Runnable�� ���� Ŭ������ �����ؾ� �Ѵ�.
		t.start(); // ������ ����
	}

	@Override
	public void run() {
		while(true) {
			repaint();
			try{
				Thread.sleep(1000); // 1/1000����
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
		new Clock("�ð�");
	}
}
