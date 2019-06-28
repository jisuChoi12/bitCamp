package kr.co.bit;

//����Ŭ����
class Vehicle{
	//�����޼ҵ�
	void move() {
		System.out.println("�����δ�.");
	}
}

//�������̽�
interface Flyable{
	//�߻�޼ҵ�
	public abstract void fly();
	//static �޼ҵ�
	public static void now() {
		System.out.println("�ڹ�8���ʹ� �������̽� �ȿ� static/default �޼ҵ� ����.");
	}
}

//����Ŭ����-����Ŭ���� ���/�������̽� ����
class InterfaceImp extends Vehicle implements Flyable{ 
	//��ӹ��� �������̽��� ��� �߻�޼ҵ� ����
	@Override
	public void fly() {
		System.out.println("����.");
	}
}

//����Ʋ����
public class InterfaceTest2 {
	public static void main(String[] args) {
		//����Ŭ������ ��ü���
		InterfaceImp interfaceImp = new InterfaceImp();
		//VehicleŬ������ move�޼ҵ�
		interfaceImp.move();
		//InterfaceImp�� fly�޼ҵ�
		interfaceImp.fly();
		//upCasting ���
		Flyable flyable = new InterfaceImp(); 
		//�������̽��� fly�޼ҵ�
		flyable.fly();
		// �������̽� �ȿ� �ִ� static�޼ҵ带 ȣ��
		Flyable.now();
	}
}
