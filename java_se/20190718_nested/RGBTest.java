import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class RGBTest {
	private Frame frame;
	private Button redB;
	private Button greenB;
	private Button blueB;
	private DrCanvas canvas;

	public RGBTest(){
		frame = new Frame();

		redB = new Button("»¡°­");
		greenB = new Button("ÃÊ·Ï");
		blueB = new Button("ÆÄ¶û");

		canvas = new DrCanvas();
		// canvas.setBackground(Color.YELLOW);

		Panel panel = new Panel();
		panel.setLayout(new GridLayout(1,3,5,5));

		panel.add(redB);
		panel.add(greenB);
		panel.add(blueB);

		frame.add("North", panel);
		frame.add("Center",canvas);

		frame.setBounds(500,150,300,300);
		frame.setVisible(true);

		// event
		frame.addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		redB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				canvas.setBackground(Color.RED);
			}
		});

		greenB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				canvas.setBackground(Color.GREEN);
			}
		});

		blueB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				canvas.setBackground(Color.BLUE);
			}
		});
	}

	class DrCanvas extends Canvas{ // inner class
		DrCanvas(){
			setBackground(Color.YELLOW);
		}
	}


	public static void main(String[] args) {
		RGBTest rgb = new RGBTest();
	}
}
