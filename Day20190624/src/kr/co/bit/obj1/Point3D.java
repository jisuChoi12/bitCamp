package kr.co.bit.obj1;

public class Point3D extends Point2D {
	protected int z;
	
	public Point3D() { //�Ű����� ���� ������... super();�� �θ�Ŭ������ �ִ� ������ �Լ� ����
		super();
	}
	public Point3D(int x, int y, int z) { //�Ű����� �ִ� ������... �θ�Ŭ������ �ִ� ������ �Լ� ���� + �ش� Ŭ���� �ȿ� �ִ� ���� �ʱ�ȭ
		super(x,y);
		this.z=z;
	}
	@Override
	public String toString() {
		return super.toString()+" Point3D [z=" + z + "]"; // �θ� Ŭ������ toString�Լ� ����
	}
	public static void main(String[] args) { // main
		Point3D point3d = new Point3D(); //��ü����
		point3d.x=10; // ��ӹ��� ������ �� �Է�
		point3d.y=20;
		point3d.z=30;
		System.out.println(point3d.toString()); // �ش� Ŭ������ toString�Լ� ���
	}
}

