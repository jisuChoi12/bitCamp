package kr.co.bit.obj3;

public class StaticTest {
	
	// main진입점과 같은 메모리
	// static변수(=class변수)
	static int num1;
	static {
		num1=0;
	}
	
	// main진입점과 다른 메모리
	// 생성자 함수를 써서 초기화
	public int num2;
	public StaticTest() {
		num2=0;
	}
	
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
	}
}
