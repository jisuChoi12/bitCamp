package kr.co.bit;

//인터페이스
interface Interface1{
	//언제나 public static -> 저장공간이 한번만 만들어진다.
	public static int interVar1=10;
	//추상메소드
	public abstract void interfaceMethod1(); //다형성을 위한 Override
	
	//자바8부터 인터페이스에서 static/default 메소드 허용
	public static void abcd() {
		System.out.println("왜죠...");
	}
}

interface Interface2{
	public static int interVar2=20;
	public abstract void interfaceMethod2();
	public abstract void interfaceMethos3();
}

// 인터페이스를 상속받는 완전클래스 -> Object와 Interface1 두개의 상위클래스를 상속 
class Interface1Imp1 extends Object implements Interface1, Interface2{
	// 인터페이스에 정의된 모든 추상클래스를 구현해야함 (하나라도 빼먹으면 이 클래스는 abstract클래스)
	@Override
	public void interfaceMethod1() {
		System.out.println("interdaceMethod1 구현 ");
	}
	@Override
	public void interfaceMethod2() {
		System.out.println("interfaceMethod2 구현");	
	}
	public void aaa() {
		System.out.println("aaa");
	}
	@Override
	public void interfaceMethos3() {
		// TODO Auto-generated method stub
		
	}
}

//메인클래스
public class InterfaceTest1 {
	public static void main(String[] args) {
		// 인터페이스를 상속받은 완전클래스의 객체생성
		Interface1Imp1 in1Imp1 = new Interface1Imp1();
		
		System.out.println("in1Imp1.interVar="+in1Imp1.interVar1);
		System.out.println("in1Imp2.interVar="+in1Imp1.interVar2);
		in1Imp1.interfaceMethod1();
		in1Imp1.interfaceMethod2();		
		in1Imp1.aaa();
		
		
		
		// static 변수/메소드는 클래스명으로 호출가능
		System.out.println("Interface1.interVar="+Interface1.interVar1);
		System.out.println("Interface2.interVar="+Interface2.interVar2);
		Interface1.abcd();
		
		// 메소드는 인터페이스 안에서 추상메소드니까 그걸 구현한 완전클래스를 upCasting하고 메소드 호출
		Interface1 it1 = new Interface1Imp1(); //upCasting
		it1.interfaceMethod1();
		//it1.aaa(); 에러: upCasting때문에 상위클래스의 메소드만 사용 가능
		
		Interface2 it2 = new Interface1Imp1();
		it2.interfaceMethod2();
	}
}
