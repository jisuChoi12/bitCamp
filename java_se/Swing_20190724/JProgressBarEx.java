import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JProgressBarEx extends JFrame implements ActionListener, Runnable {
	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL,0,100);
	private JButton jbt1 = new JButton("Ω√¿€");
	private JButton jbt2 = new JButton("∏ÿ√„");
	private Boolean bb = true;
	private static int ii;

	public JProgressBarEx(){
		super("JProgressBar Test");
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", new JLabel("Progress Bar"));
		con.add("Center", jpb);
		jpb.setStringPainted(true);
		jpb.setString("0%");
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(jbt1);
		jp.add(jbt2);
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		con.add("South", jp);
		setBounds(300,200,300,150);
		setVisible(true);
	}

	public void run(){
		if(ii==100) { ii=0; }
		for(int i=ii; i<=100; i++) {
			if(!bb) { break; }
			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {}
				jpb.setValue(i);
				ii = i;
				jpb.setString(i+"%");
		}
		jbt1.setEnabled(true);
		jbt2.setEnabled(false);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbt1) {
			bb = true;
			new Thread(this).start();
			jbt1.setEnabled(false);
			jbt2.setEnabled(true);
		}
		else if(e.getSource()==jbt2) {
			bb = false;
			jbt1.setEnabled(true);
			jbt2.setEnabled(false);
		}
	}

	public static void main(String[] args) {
		new JProgressBarEx();
	}
}
