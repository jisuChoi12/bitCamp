package kr.co.bit;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Graphics;
import java.lang.Math;
import java.util.ArrayList;

class DrCanvas extends Canvas {
	private MsPaint mp;
	private Image bufferImage;
	private Graphics bufferG; // buffer 안에서 그려질 그래픽
	ArrayList<Integer> al1 = new ArrayList<Integer>(); // x2
	ArrayList<Integer> al2 = new ArrayList<Integer>(); // y2

	public DrCanvas(MsPaint mp) {
		setBackground(new Color(255, 255, 255));
		this.mp = mp;
	}

	@Override
	public void update(Graphics g) { // 메모리에 그림
		Dimension d = this.getSize(); // 캔버스의 사각 영역
		if (bufferG == null) {
			bufferImage = this.createImage(d.width, d.height);
			bufferG = bufferImage.getGraphics();
		}

		bufferG.setColor(this.getBackground());
		bufferG.fillRect(0, 0, d.width, d.height);

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// arrayList에 담아놓은 드형을 다시 그려주기
		for (int i = 0; i < mp.getList().size(); i++) {
			int x1 = mp.getList().get(i).getX1();
			int y1 = mp.getList().get(i).getY1();
			int x2 = mp.getList().get(i).getX2();
			int y2 = mp.getList().get(i).getY2();
			int z1 = mp.getList().get(i).getZ1();
			int z2 = mp.getList().get(i).getZ2();

			// 색
			switch (mp.getList().get(i).getColor()) { // getSelectedItem()
			case 0:
				bufferG.setColor(Color.RED);
				break;
			case 1:
				bufferG.setColor(Color.GREEN);
				break;
			case 2:
				bufferG.setColor(Color.BLUE);
				break;
			case 3:
				bufferG.setColor(Color.MAGENTA);
				break;
			case 4:
				bufferG.setColor(Color.CYAN);
				break;
			}

			// 도형
			if (mp.getList().get(i).getFill()) {
				if (mp.getList().get(i).getShape() == 0) {
					bufferG.drawLine(x1, y1, x2, y2);
				} else if (mp.getList().get(i).getShape() == 1) {
					bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (mp.getList().get(i).getShape() == 2) {
					bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (mp.getList().get(i).getShape() == 3) {
					bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1,
							z2);
				} else if (mp.getList().get(i).getShape() == 4) {
					bufferG.drawLine(x1, y1, x2, y2);
				}
			} else {
				if (mp.getList().get(i).getShape() == 0) {
					bufferG.drawLine(x1, y1, x2, y2);
				} else if (mp.getList().get(i).getShape() == 1) {
					bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (mp.getList().get(i).getShape() == 2) {
					bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (mp.getList().get(i).getShape() == 3) {
					bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1,
							z2);
				} else if (mp.getList().get(i).getShape() == 4) {
					bufferG.drawLine(x1, y1, x2, y2);
				}
			}
		}

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// 좌표 - x1T, y1T, x2T, y2T, z1T, z2T
		int x1 = Integer.parseInt(mp.getX1T().getText());
		int y1 = Integer.parseInt(mp.getY1T().getText());
		int x2 = Integer.parseInt(mp.getX2T().getText());
		int y2 = Integer.parseInt(mp.getY2T().getText());
		int z1 = Integer.parseInt(mp.getZ1T().getText());
		int z2 = Integer.parseInt(mp.getZ2T().getText());

		// 색
		switch (mp.getCombo().getSelectedIndex()) { // getSelectedItem()
		case 0:
			bufferG.setColor(Color.RED);
			break;
		case 1:
			bufferG.setColor(Color.GREEN);
			break;
		case 2:
			bufferG.setColor(Color.BLUE);
			break;
		case 3:
			bufferG.setColor(Color.MAGENTA);
			break;
		case 4:
			bufferG.setColor(Color.CYAN);
			break;
		}

		// 도형
		if (mp.getFill().isSelected()) {
			if (mp.getLine().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);

			} else if (mp.getCircle().isSelected()) {
				bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			} else if (mp.getRect().isSelected()) {
				bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			} else if (mp.getRoundRect().isSelected()) {
				bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);

			} else if (mp.getPen().isSelected()) { // 연필
				bufferG.drawLine(x1, y1, x2, y2);
			}
		} else {
			if (mp.getLine().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);

			} else if (mp.getCircle().isSelected()) {
				bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			} else if (mp.getRect().isSelected()) {
				bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			} else if (mp.getRoundRect().isSelected()) {
				bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);

			} else if (mp.getPen().isSelected()) { // 연필
				bufferG.drawLine(x1, y1, x2, y2);
			}
		}
		paint(g);
	}

	@Override
	public void paint(Graphics g) { // 화면에 그림
		g.drawImage(bufferImage, 0, 0, this);
	}
}
