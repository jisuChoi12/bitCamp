enum Figure{
	LINE,CIRCLE,RECT,ROUNDRECT,PEN
}

class ShapeDTO {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int z1;
	private int z2;
	private boolean fill;
	private Figure shape;
	private int color;

	public ShapeDTO(int x1, int y1, int x2, int y2, int z1, int z2, boolean fill, Figure shape, int color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.z1 = z1;
		this.z2 = z2;
		this.fill = fill;
		this.shape = shape;
		this.color = color;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public int getZ1() {
		return z1;
	}

	public int getZ2() {
		return z2;
	}

	public boolean getFill() {
		return fill;
	}

	public Figure getShape() {
		return shape;
	}

	public int getColor() {
		return color;
	}
}
