package kr.co.bit.obj;

public class Test1 extends Test {
	@Override
	public void set1() {
		super.set1(); //상속가능
	}
//	@Override
//	public final void set() { //에러: final예약어 때문에 부모 클래스에 있는 set()함수 상속 불가
//		System.out.println("상속불가");
//	}
	
}
