package kr.co.bit.obj;

class VarClass {
	final int x; //인스턴변수 공유x
	static final int y; //클래스변수 공유ㅇ
	final double PI;
	
	static {
		y=100;
	}
	public VarClass(int x) {
		this.x=x;
		PI=3.14;
	}
}

public class FinalVar{
	public static void main(String[] args) {
//		VarClass.y=30; 에러: 초기값이 이미 final로 정해짐/변수의 기능 상실/문자상수
		VarClass vc1 = new VarClass(10);
//		vc1.y=50;
//		vc1.x=40;
		System.out.println(vc1.x+5);
		VarClass vc2 = new VarClass(20);
		System.out.println(vc2.x+5);
		System.out.println(VarClass.y+5);
	}
}
