package kr.co.bit.obj1;

class Parent1{
	protected int age;
	//�������Լ�:����� ���� �ȵ� ��� super();��  �ڽ�Ŭ�������� ȣ�Ⱑ��
	public Parent1() {
		
	}
	public Parent1(int a) {
		age=a;
	}
	public void parent1Mathod() {
		System.out.println("�θ��Լ�");
	}
}

class Son1 extends Parent1 {
	protected int num1;
	public Son1() {
		//�θ�Ŭ������ ������ �Լ��� ȣ��
		super();
	}
	public Son1(int n) {
		super(10);
	}
	
	public void son1Method() {
		super.age=100;
		super.parent1Mathod();
		System.out.println("�ڽ��Լ�");
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		Son1 son1 = new Son1();
		son1.age=100;
		System.out.println(son1.age);
		son1.parent1Mathod();
		son1.num1=10;
		System.out.println(son1.num1);
		son1.son1Method();
	
	}	
}
