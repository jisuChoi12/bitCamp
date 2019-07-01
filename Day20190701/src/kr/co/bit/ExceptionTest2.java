package kr.co.bit;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result="+result);
		} catch (Exception e) {
			System.out.println("정수는 0으로 나눌수 없습니다.");
		}
		System.out.println("프로그램 계속 실행됨...");
	}
}
