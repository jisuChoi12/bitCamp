import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

class RGBTest extends Frame implements ActionListener, WindowListener{
		private Button redB;
		private Button greenB;
		private Button blueB;

	public void init(){
		redB = new Button("»¡°­");
		greenB = new Button("ÃÊ·Ï");
		blueB = new Button("ÆÄ¶û");


		Panel panel = new Panel();
		panel.setLayout(new GridLayout(1,3,5,5));
		panel.add(redB);
		panel.add(greenB);
		panel.add(blueB);
		add("North", panel);

		setBounds(200,150,300,300);
		setVisible(true);
		
		// ÀÌº¥Æ®
		this.addWindowListener(new WindowExit()); 
		redB.addActionListener(this);
		greenB.addActionListener(this);
		blueB.addActionListener(this);
	}
	
	// ActionListener
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==redB)
			this.setBackground(Color.RED);
		else if (e.getSource()==greenB)
			this.setBackground(Color.GREEN);
		else if (e.getSource()==blueB)
			this.setBackground(Color.BLUE);
	}

	//WindowListener
	public void	windowActivated(WindowEvent e){}

	public void	windowClosed(WindowEvent e){}

	public void	windowClosing(WindowEvent e){}

	public void	windowDeactivated(WindowEvent e){}

	public void	windowDeiconified(WindowEvent e){}

	public void	windowIconified(WindowEvent e){}

	public void	windowOpened(WindowEvent e){}

	
	public static void main(String[] args) {
		new RGBTest().init();
	}
}
