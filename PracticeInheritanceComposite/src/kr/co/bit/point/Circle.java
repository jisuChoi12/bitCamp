package kr.co.bit.point;

public class Circle {
	public Point point; //������ �κ�Ŭ���� ����
	public Circle() {
		point = new Point(); //������ �Լ� �ȿ� �κ�Ŭ���� ��ü����
	}
	public static void main(String[] args) {//main
		Circle circle = new Circle(); //��ü����
		circle.point.x=10; //���԰����� ��ǥ���� Ư¡ ��üŬ����.�κ�Ŭ����.�κ�Ŭ�����Ǻ��� ���·� ȣ��
		circle.point.y=20; 
		System.out.println(circle.point.x); 
		System.out.println(circle.point.y);
	}
}
