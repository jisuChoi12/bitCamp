package kr.co.bit.obj3;

public class AirCon {
	
//  인스턴스변수정의
	String company; //제조사
	String color; //색
	int price; //가격
	int size; //에어컨 크키
	int temp; //온도

//	생성자 함수(=constructor) 컴파일러가 스스로 만든다. 초기화
	public AirCon() {
		company=null;
		color=null;
		price=0;
		size=0;
		temp=0;
	}

//  인스턴스메소드정의
	public void powerOn() {
		System.out.println("전원 킴"); // 전원 켜짐 상태
	}
	public void powerOff() {
		System.out.println("전원 끔"); // 전원 꺼짐 상태
	}
	public void tempUp() {
		temp++; // 온도 1 증가
	}
	public void tempDown() {
		temp--; // 온도 1 감소
	}
	
	
//	
//	//static변수정의
//	static String company; //제조사
//	static String color; //색
//	static int price; //가격
//	static int size; //에어컨 크키
//	static int temp; //온도
//	
//	//static메소드정의
//	public static void powerOn() {
//		System.out.println("전원 킴"); // 전원 켜짐 상태
//	}
//	public static void powerOff() {
//		System.out.println("전원 끔"); // 전원 꺼짐 상태
//	}
//	public static void tempUp() {
//		temp++; // 온도 1 증가
//	}
//	public static void tempDown() {
//		temp--; // 온도 1 감소
//	}
}
