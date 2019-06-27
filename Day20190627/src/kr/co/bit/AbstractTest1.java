package kr.co.bit;

//추상클래스
abstract class AbstractClass{
	//변수
	protected int age;
	//구현된 메소드(완전메소드)
	public void generalMethod() {
		System.out.println("일반메소드");
	}
	//추상메소드(불완전메소드)
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{
	//추상메소드를 추상클래스로부터 상속받음/오버라이드
	@Override
	void abstractMethod() {
		System.out.println("자식메소드 다형성/추상메소드 구현");
	}
}

//메인클래스
public class AbstractTest1 {
	public static void main(String[] args) {
		//하위클래스의 객체생성
		AbstractChildClass acc = new AbstractChildClass();
		acc.age=100; //상속
		acc.generalMethod();//상속
		acc.abstractMethod();//다형성
	}
}
 
