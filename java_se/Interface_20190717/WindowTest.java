import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class WindowTest extends Frame implements MouseListener, MouseMotionListener, ActionListener{
	private Button exitB;
	private int x,y;

	public WindowTest(){

		exitB = new Button("끝내기");
		add("North", exitB);

		setBounds(200,150,500,500);
		setVisible(true);

		// 이벤트
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		exitB.addActionListener(this);
	}

	@Override
	public void paint(Graphics g){ // setVisible() -> 한번호출
		g.drawString("x: "+x+" | "+"y: "+y,x,y);
	}

	public void mouseClicked(MouseEvent e){
		System.out.println("mouse clicked");
		x = e.getX();
		y = e.getY();
		System.out.println("x: "+x+" | "+"y: "+y);
		
		repaint();
	}

	public void	mouseEntered(MouseEvent e){
		System.out.println("mouse entered");
	}

	public void	mouseExited(MouseEvent e){
		System.out.println("mouse exited");
	}

	public void	mousePressed(MouseEvent e){

	}

	public void	mouseReleased(MouseEvent e){

	}
	
	public void mouseDragged(MouseEvent e){
		System.out.println("mouse dragged");

	}

	public void mouseMoved(MouseEvent e){
		
	}

	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}

	public static void main(String[] args) {
		new WindowTest();
	}
}
