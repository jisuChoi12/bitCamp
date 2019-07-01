package kr.co.bit;

public class ExceptionTest4 {

	public void exceptionMethod(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result");
			return;
		} catch (ArrayIndexOutOfBoundsException e1) { 
			System.out.println("인자를 하나 입력해 주세요.");
		} catch (NumberFormatException e2) { //타입
			System.out.println("인자를 정수타입으로 입력해 주세요.");
		} catch (ArithmeticException e3) { 
			System.out.println("정수를 0으로 나누면 안돼요.");
		} finally {			
			System.out.println("반드시 실행해야 하는 영역");
		}
	}
	
	public static void main(String[] args) {
		ExceptionTest4 et4 = new ExceptionTest4();
		et4.exceptionMethod(args);
	}
}
