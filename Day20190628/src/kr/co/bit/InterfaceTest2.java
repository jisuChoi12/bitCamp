package kr.co.bit;

//완전클래스
class Vehicle{
	//완전메소드
	void move() {
		System.out.println("움직인다.");
	}
}

//인터페이스
interface Flyable{
	//추상메소드
	public abstract void fly();
	//static 메소드
	public static void now() {
		System.out.println("자바8부터는 인터페이스 안에 static/default 메소드 가능.");
	}
}

//완전클래스-완전클래스 상속/인터페이스 구현
class InterfaceImp extends Vehicle implements Flyable{ 
	//상속받은 인터페이스의 모든 추상메소드 구현
	@Override
	public void fly() {
		System.out.println("난다.");
	}
}

//메인틀래스
public class InterfaceTest2 {
	public static void main(String[] args) {
		//하위클래스의 객체상속
		InterfaceImp interfaceImp = new InterfaceImp();
		//Vehicle클래스의 move메소드
		interfaceImp.move();
		//InterfaceImp의 fly메소드
		interfaceImp.fly();
		//upCasting 축소
		Flyable flyable = new InterfaceImp(); 
		//인터페이스의 fly메소드
		flyable.fly();
		// 인터페이스 안에 있는 static메소드를 호출
		Flyable.now();
	}
}
