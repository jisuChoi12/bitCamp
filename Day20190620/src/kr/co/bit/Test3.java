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
		//System.out.println(iv); // static method���� instance variable ��� �ȵ�
		System.out.println(cv);
	}
	
	public void instanceMethod() {
		testInstance();
		testStatic();
	}
	
	public static void staticMethod() {
		//testInstance(); // static method���� instance method ȣ�� �ȵ�
		testStatic();
	}
	
	public static void main(String[] args) {
		
	}
}
