package kr.co.bit;

public class ExceptionTest6 {

	public void exceptionMethod() throws Exception{ // ���� ������
		throw new Exception(); // ���ܰ����߻�
	}
	
	public static void main(String[] args) {
		ExceptionTest6 et6 = new ExceptionTest6(); // ��ü����
		try {
			et6.exceptionMethod(); // ���ܸ޼ҵ� ȣ��
		} catch (Exception e) {
			System.out.println("����ó��"); // ����ó��
		}

	}

}
