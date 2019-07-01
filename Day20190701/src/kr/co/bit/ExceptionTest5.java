package kr.co.bit;

public class ExceptionTest5 {
	public void exceptionMethod1() { //��Ÿ��
		throw new NullPointerException(); // throw new ... exception ���� �߻�
	}
	
	public void exceptionMethod2() { //������
		try {
			throw new ClassNotFoundException();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException...");
		} 
	}
	
	public static void main(String[] args) {
		ExceptionTest5 et5 = new ExceptionTest5();
		try {
			et5.exceptionMethod1();
		} catch (NullPointerException e) {
			System.out.println("RuntimeException...");
		} 
		et5.exceptionMethod2();
	}
}
