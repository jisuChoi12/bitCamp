package kr.co.bit;

//�߻�Ŭ����
abstract class AbstractClass{
	//����
	protected int age;
	//������ �޼ҵ�(�����޼ҵ�)
	public void generalMethod() {
		System.out.println("�Ϲݸ޼ҵ�");
	}
	//�߻�޼ҵ�(�ҿ����޼ҵ�)
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{
	//�߻�޼ҵ带 �߻�Ŭ�����κ��� ��ӹ���/�������̵�
	@Override
	void abstractMethod() {
		System.out.println("�ڽĸ޼ҵ� ������/�߻�޼ҵ� ����");
	}
}

//����Ŭ����
public class AbstractTest1 {
	public static void main(String[] args) {
		//����Ŭ������ ��ü����
		AbstractChildClass acc = new AbstractChildClass();
		acc.age=100; //���
		acc.generalMethod();//���
		acc.abstractMethod();//������
	}
}
 
