import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;

class AwtTest2 extends Frame{ // BorderLayout
	private Button newB, exitB;

	public void init(){
		newB = new Button("새로만들기");
		exitB = new Button("종료");

		Panel p = new Panel(); // FlowLayout (순서배치 중앙)
		p.setLayout(new GridLayout(1,2,5,0)); //균등배치/행열배치 (행,열,가로여백,세로여백) 
		p.setBackground(new Color(255,255,0));
		p.add(newB);
		p.add(exitB);
		add("North",p); 

		setBounds(800,250,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtTest2().init();
	}
}
