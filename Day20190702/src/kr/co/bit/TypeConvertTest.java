package kr.co.bit;

public class TypeConvertTest {

	public static void main(String[] args) {
		int num1 = 3; // 정수
		String num2 = "4"; //문자열
		String numStr = "3.11"; //문자열
		
		System.out.println("타입변환전");
		System.out.println("3+4="+(num1+num2));
		int intNum = Integer.parseInt(num2); //String->integer
		System.out.println("타입변환후");
		System.out.println("3+4="+(num1+intNum));
		
		System.out.println("타입변환전");
		System.out.println("3+3.11="+(num1+numStr));
		double doubleNum = Double.parseDouble(numStr); //String->double
		System.out.println("타입변환후");
		System.out.println("3+3.11="+(num1+doubleNum));
	}
}
