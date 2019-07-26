package kr.co.bit;

import java.awt.Container;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
import java.util.*;

class MsPaint extends JFrame {
	private JLabel x1L, x2L, y1L, y2L, z1L, z2L;
	private JTextField x1T, x2T, y1T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox<String> combo;
	private JButton drawB;
	private DrCanvas can;

	ArrayList<ShapeDTO> list = new ArrayList<ShapeDTO>();
	
	public MsPaint() {
		x1L = new JLabel("x1");
		y1L = new JLabel("y1");
		x2L = new JLabel("x2");
		y2L = new JLabel("y2");
		z1L = new JLabel("z1");
		z2L = new JLabel("z2");

		x1T = new JTextField("0", 4);
		y1T = new JTextField("0", 4);
		x2T = new JTextField("0", 4);
		y2T = new JTextField("0", 4);
		z1T = new JTextField("50", 4);
		z2T = new JTextField("50", 4);

		fill = new JCheckBox("채우기");
		line = new JRadioButton("선", true);
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형");
		roundRect = new JRadioButton("둥근사각형");
		pen = new JRadioButton("연필");
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		group.add(pen);

		String[] color = { "빨강", "초록", "파랑", "보라", "하늘" };
		combo = new JComboBox<String>(color);

		drawB = new JButton("draw");

		can = new DrCanvas(this);

		JPanel p1 = new JPanel();
		p1.add(x1L);
		p1.add(x1T);
		p1.add(y1L);
		p1.add(y1T);
		p1.add(x2L);
		p1.add(x2T);
		p1.add(y2L);
		p1.add(y2T);
		p1.add(z1L);
		p1.add(z1T);
		p1.add(z2L);
		p1.add(z2T);
		p1.add(fill);

		JPanel p2 = new JPanel();
		p2.add(line);
		p2.add(circle);
		p2.add(rect);
		p2.add(roundRect);
		p2.add(pen);
		p2.add(combo);
		p2.add(drawB);

		Container container = this.getContentPane();
		container.add("North", p1);
		container.add("Center", can);
		container.add("South", p2);

		setTitle("그림판");
		setBounds(300, 200, 700, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// event
		drawB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.repaint();
			}
		});

		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				//if(!getPen().isSelected()) {
					int x = e.getX();
					int y = e.getY();
					x1T.setText(Integer.toString(x));
					y1T.setText(Integer.toString(y));					
				//} 
					
					if(getPen().isSelected()) {
						can.al1.add(0);
						can.al2.add(0);
					}
					

			}
		});

		can.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (getPen().isSelected()) {
					list.add(new ShapeDTO(Integer.parseInt(x1T.getText()), Integer.parseInt(y1T.getText()),
							Integer.parseInt(x2T.getText()), Integer.parseInt(y2T.getText()),
							Integer.parseInt(z1T.getText()), Integer.parseInt(z2T.getText()), getFill().isSelected(), 4,
							getCombo().getSelectedIndex()));
				}
				int x = e.getX();
				int y = e.getY();
				x2T.setText(Integer.toString(x));
				y2T.setText(Integer.toString(y));
				can.repaint();
				//can.al1.add(-100);
				//can.al2.add(-100);
			}
		});

		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int shape = -100;
				int x = e.getX();
				int y = e.getY();
				x2T.setText(Integer.toString(x));
				y2T.setText(Integer.toString(y));
				can.repaint();

				if (getLine().isSelected()) {
					shape = 0;
				} else if (getCircle().isSelected()) {
					shape = 1;
				} else if (getRect().isSelected()) {
					shape = 2;
				} else if (getRoundRect().isSelected()) {
					shape = 3;
				} 
				else if (getPen().isSelected()) {
					shape = 4;
				}
				if(!getPen().isSelected()) {
				list.add(new ShapeDTO(Integer.parseInt(x1T.getText()), Integer.parseInt(y1T.getText()),
						Integer.parseInt(x2T.getText()), Integer.parseInt(y2T.getText()),
						Integer.parseInt(z1T.getText()), Integer.parseInt(z2T.getText()), getFill().isSelected(), shape,
						getCombo().getSelectedIndex()));
				}
//				can.al1.add(Integer.parseInt(x2T.getText()));
//				can.al2.add(Integer.parseInt(y2T.getText()));
//				can.al1.add(0);
//				can.al2.add(0);
			}
		});
	}

	public JTextField getX1T() {
		return x1T;
	}

	public JTextField getY1T() {
		return y1T;
	}

	public JTextField getX2T() {
		return x2T;
	}

	public JTextField getY2T() {
		return y2T;
	}

	public JTextField getZ1T() {
		return z1T;
	}

	public JTextField getZ2T() {
		return z2T;
	}

	public JComboBox<String> getCombo() {
		return combo;
	}

	public JCheckBox getFill() {
		return fill;
	}

	public JRadioButton getLine() {
		return line;
	}

	public JRadioButton getCircle() {
		return circle;
	}

	public JRadioButton getRect() {
		return rect;
	}

	public JRadioButton getRoundRect() {
		return roundRect;
	}

	public JRadioButton getPen() {
		return pen;
	}

	public ArrayList<ShapeDTO> getList() {
		return list;
	}

	public static void main(String[] args) {
		new MsPaint();
	}
}
