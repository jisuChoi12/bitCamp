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
		newB = new Button("���θ����");
		exitB = new Button("����");

		Panel p = new Panel(); // FlowLayout (������ġ �߾�)
		p.setLayout(new GridLayout(1,2,5,0)); //�յ��ġ/�࿭��ġ (��,��,���ο���,���ο���) 
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
