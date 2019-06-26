package kr.co.bit;

public class ParameterTest {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main(0):x="+d.x);
		System.out.println("After change(d.x)"); 
//		change(d.x); // 기본 
		change(d); // 참조
		System.out.println("main(0):x="+d.x); //함수를 수행하고 메인으로 돌아온 후
	}
	
//	파라미터에 기본형 : read only
//	public static void change(int x) {
//		x=10000;
//		System.out.println("change(x):x="+x); // 함수 안에서의 x값
//	}
	
//	파라미터에 클래스 타입 : read & write
	public static void change(Data d) {
		d.x=1000;
		System.out.println("change(x):x="+d.x);
	}
}