package kr.co.bit.obj1;

public class Son extends Parent {
	protected int num1;
	public Son() {
		
	}
	public void sonMethod1() {
		System.out.println("�ڽ��Լ�");
	}	
	public static void main(String[] args) {
		Son son = new Son();
		son.age=100; 
		son.parentMethod1();
		System.out.println("�θ��� ���̴�"+son.age);
		son.num1=10;
		son.sonMethod1();
		System.out.println("�ڽ��� ���̴�"+son.num1);
	}
}
