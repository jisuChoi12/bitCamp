package kr.co.bit;

public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result");
		} catch (ArrayIndexOutOfBoundsException e1) { //�迭
			System.out.println("���ڸ� �ϳ� �Է��� �ּ���.");
		} catch (NumberFormatException e2) { //Ÿ��
			System.out.println("���ڸ� ����Ÿ������ �Է��� �ּ���.");
		} catch (ArithmeticException e3) { 
			System.out.println("������ 0���� ������ �ȵſ�.");
		}
		System.out.println("���α׷� ��� ����...");
	}
}
