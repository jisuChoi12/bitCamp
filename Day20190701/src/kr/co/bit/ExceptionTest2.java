package kr.co.bit;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result="+result);
		} catch (Exception e) {
			System.out.println("������ 0���� ������ �����ϴ�.");
		}
		System.out.println("���α׷� ��� �����...");
	}
}
