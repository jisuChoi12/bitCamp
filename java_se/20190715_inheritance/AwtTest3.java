import java.awt.Button;
import java.awt.Frame;

class AwtTest3 extends Frame {
	private Button newB, exitB;

	public void init(){
		setLayout(null);

		newB = new Button("새로만들기");
		exitB = new Button("종료");

		//newB.setLocation(50,100);
		//newB.setSize(80,30);
		newB.setBounds(50,100,80,30);
		add(newB);
		exitB.setBounds(150,100,80,30);
		add(exitB);

		setBounds(800,250,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtTest3().init();
	}
}
