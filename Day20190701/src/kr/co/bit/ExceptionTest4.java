package kr.co.bit;

public class ExceptionTest4 {

	public void exceptionMethod(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result");
			return;
		} catch (ArrayIndexOutOfBoundsException e1) { 
			System.out.println("���ڸ� �ϳ� �Է��� �ּ���.");
		} catch (NumberFormatException e2) { //Ÿ��
			System.out.println("���ڸ� ����Ÿ������ �Է��� �ּ���.");
		} catch (ArithmeticException e3) { 
			System.out.println("������ 0���� ������ �ȵſ�.");
		} finally {			
			System.out.println("�ݵ�� �����ؾ� �ϴ� ����");
		}
	}
	
	public static void main(String[] args) {
		ExceptionTest4 et4 = new ExceptionTest4();
		et4.exceptionMethod(args);
	}
}
