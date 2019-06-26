package kr.co.bit.obj1;

class Parent1{
	protected int age;
	//생성자함수:상속이 진행 안됨 대신 super();로  자식클래스에서 호출가능
	public Parent1() {
		
	}
	public Parent1(int a) {
		age=a;
	}
	public void parent1Mathod() {
		System.out.println("부모함수");
	}
}

class Son1 extends Parent1 {
	protected int num1;
	public Son1() {
		//부모클래스의 생성자 함수를 호출
		super();
	}
	public Son1(int n) {
		super(10);
	}
	
	public void son1Method() {
		super.age=100;
		super.parent1Mathod();
		System.out.println("자식함수");
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
