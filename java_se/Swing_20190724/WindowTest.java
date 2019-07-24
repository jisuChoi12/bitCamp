import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowTest extends JFrame{
	private JButton newB, exitB;
	private JTextArea area;

	public WindowTest(){

		newB = new JButton("new");
		exitB = new JButton(new ImageIcon("cross.png"));
		area = new JTextArea();
		JPanel panel = new JPanel();
		JScrollPane scroll = new JScrollPane(area);

		Container container = this.getContentPane(); // contentPane

		panel.add(newB);
		panel.add(exitB);
		container.add("North",panel); // ���� �����̳��� JFrame�� �ٷ� �ø��� ���� contentPane�� �߰�
		container.add("Center",scroll); // �� �� ���� ������

		setBounds(300,200,300,400);
		setVisible(true);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		// event
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				// exit dialog
				int result = JOptionPane.showConfirmDialog(
					WindowTest.this, "���� ���� �Ͻðڽ��ϱ�?","����", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.YES_OPTION){ System.exit(0); }
			}
		}); 
		
	}

	public static void main(String[] args) {
		new WindowTest();
	}
}
