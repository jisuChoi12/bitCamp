import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;

// Frame�� BorderLayout(��������) North, South, East, West, Center
class AwtTest extends Frame  {
	private Button newB, exitB;
	private TextArea area;

	public void init(){
		newB = new Button("���θ����");
		exitB = new Button("����");
		area = new TextArea();
		area.setForeground(new Color(255,0,255));

		this.add("North",newB); 
		this.add("South",exitB);
		this.add("Center",area);

		setBounds(200,150,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtTest().init();
	}
}
