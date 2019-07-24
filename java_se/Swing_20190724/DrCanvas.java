import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;
import java.util.ArrayList;

class DrCanvas extends Canvas{
	private MsPaint mp;
	ArrayList<Integer> al1 = new ArrayList<Integer>(); // x2
	ArrayList<Integer> al2 = new ArrayList<Integer>(); // y2
	

	public DrCanvas(MsPaint mp) {
		setBackground(new Color(255,255,255));
		this.mp = mp;
	}

	@Override
	public void paint(Graphics g) {
		// 좌표 - x1T, y1T, x2T, y2T, z1T, z2T
		int x1 = Integer.parseInt(mp.getX1T().getText());
		int y1 = Integer.parseInt(mp.getY1T().getText());
		int x2 = Integer.parseInt(mp.getX2T().getText());
		int y2 = Integer.parseInt(mp.getY2T().getText());
		int z1 = Integer.parseInt(mp.getZ1T().getText());
		int z2 = Integer.parseInt(mp.getZ2T().getText());

		// 색
		switch(mp.getCombo().getSelectedIndex()){ // getSelectedItem()
			case 0 : setForeground(Color.RED); break;
			case 1 : setForeground(Color.GREEN); break;
			case 2 : setForeground(Color.BLUE); break;
			case 3 : setForeground(Color.MAGENTA); break;
			case 4 : setForeground(Color.CYAN); break;
		}

		// 연필
		if(mp.getPen().isSelected()){
			al1.add(x2);
			al2.add(y2);
			for(int i=1; i<al1.size(); i++){
				g.drawLine(al1.get(i-1),al2.get(i-1),al1.get(i),al2.get(i));
			}
		}

		// 도형
		if(mp.getFill().isSelected()) {
			if(mp.getLine().isSelected()){ 
				g.drawLine(x1, y1, x2, y2);
			}
			else if(mp.getCircle().isSelected()) {
				g.fillOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}
			else if(mp.getRect().isSelected()) {
				g.fillRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}
			else if(mp.getRoundRect().isSelected()) { 
				g.fillRoundRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			}
		}
		else{ 
			if(mp.getLine().isSelected()){ 
				g.drawLine(x1, y1, x2, y2); 
			}
			else if(mp.getCircle().isSelected()) { 
				g.drawOval(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}
			else if(mp.getRect().isSelected()) { 
				g.drawRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}
			else if(mp.getRoundRect().isSelected()) { 
				g.drawRoundRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			}
		}
	}
}
