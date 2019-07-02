package kr.co.bit;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		System.out.println(t1);
//		System.out.println(t1.toString());
		System.out.println(t2);
//		System.out.println(t2.toString());
	}
}

// Object 클래스에서 제공되는 toString()메소드
// @해쉬코드 값의 형태로 메모리에서 해당 객체를 구분할 수 있는 유일한 값을 문자열로 
// EqualTest2 에서 계속