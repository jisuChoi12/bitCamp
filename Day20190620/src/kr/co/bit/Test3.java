package kr.co.bit;

public class Test3 {
	int iv;
	public static int cv;
	
	static {
		cv=10;
	}
	
	public Test3() {
		iv=50;
	}
	
	public void testInstance() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	public static void testStatic() {
		//System.out.println(iv); // static method에서 instance variable 사용 안됨
		System.out.println(cv);
	}
	
	public void instanceMethod() {
		testInstance();
		testStatic();
	}
	
	public static void staticMethod() {
		//testInstance(); // static method에서 instance method 호출 안됨
		testStatic();
	}
	
	public static void main(String[] args) {
		
	}
}
