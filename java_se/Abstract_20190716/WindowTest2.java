import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

class WindowTest2 extends Frame {

	public void init(){
		setBounds(200,150,500,500);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g){
		g.drawString("�̹���",100,80);
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("niniz2.gif");// �̹��� �ҷ�����
		g.drawImage(img,70,100,this); // �̹��� �׸���
		//g.drawImage(img,70,100,430,460,70,460,430,100,this);
	}

	public static void main(String[] args) {
		//WindowTest2 wt2 = new WindowTest2();
		//wt2.init();
		new WindowTest2().init();
	}
}
