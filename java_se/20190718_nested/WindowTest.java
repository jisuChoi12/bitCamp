import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class WindowTest extends Frame {

	public WindowTest(){

		// event
		// windowListener(인터페이스) -> windowAdapter(추상클래스/빈바디메소드) -> 익명이너클래스 -> 오버라이드
		this.addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		// MouseListener(인터페이스) -> MouseAdapter(추상클래스/빈바디메소드) -> 익명이너클래스 -> 오버라이드
		this.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseEntered(MouseEvent e){
				System.out.println("mouse entered");
			}
			@Override
			public void mouseExited(MouseEvent e){
				System.out.println("mouse exited");
			}
		});

		// window
		setBounds(200,150,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		WindowTest wt = new WindowTest();
	}
}
