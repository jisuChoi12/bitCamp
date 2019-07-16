import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;

class WindowTest extends Frame{ // Java�� �����ϴ� Frame class ��� -> Window is a Frame
	
	public WindowTest(){ // �⺻������
		super("���� ���� ������"); // Frame�� �����ڷ� Ÿ��Ʋ ���ϱ�
		//setTitle("���� ���� ������"); // setTitle()�� Ÿ��Ʋ ���ϱ�

		//System.out.println("���� �����"); // �ܼ�â�� ���

		setBackground(new Color(168,204,240)); // Color class�� ������ �Լ��� �̿��ؼ� setBackground() 
		//setBackground(Color.MAGENTA); // setBackGround()�� ������ ���� ��밡��

		setForeground(new Color(1,1,1)); // ���ڻ�

		setBounds(750,150,300,400); // java.awt.Window �� �ִ� setBounds(); 
		//setSize(300,400); // java.awt.Window �� �ִ� setSize()
		
		setVisible(true); // java.awt.Window �� �ִ� setVisible() â ���̱� -> call back method ȣ��
	
	}
	
	@Override
	public void paint(Graphics g){ // ���� (call back method)
		g.drawString("���� �����",120,100); // ������â�� ���
		g.drawLine(100,150,200,300);
		g.drawRect(50,180,50,50);
		g.drawOval(60,200,60,60);
	}

	public static void main(String[] args) {
		WindowTest wt = new WindowTest();
	}
}

// � ������ ������ �Ǹ� JVM(�ü��)�� ȣ���Ѵ� - Call Back Method ex) void main() / run()