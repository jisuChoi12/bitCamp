package kr.co.bit.obj1;

public class Circle {
	public Point point;
	// ������ �Լ� �ȿ� "�κ�"�� ��ü����
	public Circle() {
		point = new Point();
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.point.x=10;
		circle.point.y=20;
		System.out.println(circle.point.x); //���԰����� ��ǥ���� Ư¡ ����.����.���� ������ �̾���
		System.out.println(circle.point.y);
	}
}
