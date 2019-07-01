package kr.co.bit.obj1;

public class Test {

	public static void main(String[] args) {
//		                  0123456789 배열방
		String string1 = "testString";
		String string2 = "testString";
		System.out.println("string1==string2:"+(string1==string2)); //string1과 string2가 하나의 같은 메모리공간을 가리킴
		System.out.println("string1.equals(string2)"+(string1.equals(string2))); //같은 문자열의 내용
		String string3 = new String("testString");
		String string4 = new String("testString");
		System.out.println("string3==string4:"+(string3==string4)); // 다른 메모리 공간 (new연산자로 객체생성)
		System.out.println("string3.equals(string4)"+(string3.equals(string4))); //같은 문자열의 내용
	}
}
