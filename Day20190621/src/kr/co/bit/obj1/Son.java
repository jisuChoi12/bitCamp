package kr.co.bit.obj1;

public class Son extends Parent {
	protected int num1;
	public Son() {
		
	}
	public void sonMethod1() {
		System.out.println("자식함수");
	}	
	public static void main(String[] args) {
		Son son = new Son();
		son.age=100; 
		son.parentMethod1();
		System.out.println("부모의 나이는"+son.age);
		son.num1=10;
		son.sonMethod1();
		System.out.println("자식의 나이는"+son.num1);
	}
}
