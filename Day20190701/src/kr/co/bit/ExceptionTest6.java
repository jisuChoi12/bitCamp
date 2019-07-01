package kr.co.bit;

public class ExceptionTest6 {

	public void exceptionMethod() throws Exception{ // 예외 던지기
		throw new Exception(); // 예외강제발생
	}
	
	public static void main(String[] args) {
		ExceptionTest6 et6 = new ExceptionTest6(); // 객체생성
		try {
			et6.exceptionMethod(); // 예외메소드 호출
		} catch (Exception e) {
			System.out.println("예외처리"); // 예외처리
		}

	}

}
