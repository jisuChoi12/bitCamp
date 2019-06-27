package kr.co.bit;

//추상클래스
abstract class AbClass1{
	public abstract void abMethod1();
}

//추상클래스를 상속 받는 추상클래스
abstract class AbClass2 extends AbClass1{
	public abstract void abMethod2();
}

//추상클래스를 상속 받는 완전클래스
class GeneralClass extends AbClass2{
	// 추상클래스의 메소드 구현
	@Override
	public void abMethod1() {
		System.out.println("abMethod1 메소드 구현");
	}	
	@Override
	public void abMethod2() {
		System.out.println("abMethod2 메소드 구현");		
	}
}

public class AbstractTest2 {
	public static void main(String[] args) {
		//추상클래스를 상속한 완전클래스의 객체생성(추상클래스는 객체생성 불가능)
		GeneralClass gc = new GeneralClass();
		gc.abMethod1();
		gc.abMethod2();
	}		
}
