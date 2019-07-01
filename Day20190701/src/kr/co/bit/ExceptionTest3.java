package kr.co.bit;

public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result");
		} catch (ArrayIndexOutOfBoundsException e1) { //배열
			System.out.println("인자를 하나 입력해 주세요.");
		} catch (NumberFormatException e2) { //타입
			System.out.println("인자를 정수타입으로 입력해 주세요.");
		} catch (ArithmeticException e3) { 
			System.out.println("정수를 0으로 나누면 안돼요.");
		}
		System.out.println("프로그램 계속 실행...");
	}
}
