package kr.co.bit;

public class TypeConvertTest {

	public static void main(String[] args) {
		int num1 = 3; // ����
		String num2 = "4"; //���ڿ�
		String numStr = "3.11"; //���ڿ�
		
		System.out.println("Ÿ�Ժ�ȯ��");
		System.out.println("3+4="+(num1+num2));
		int intNum = Integer.parseInt(num2); //String->integer
		System.out.println("Ÿ�Ժ�ȯ��");
		System.out.println("3+4="+(num1+intNum));
		
		System.out.println("Ÿ�Ժ�ȯ��");
		System.out.println("3+3.11="+(num1+numStr));
		double doubleNum = Double.parseDouble(numStr); //String->double
		System.out.println("Ÿ�Ժ�ȯ��");
		System.out.println("3+3.11="+(num1+doubleNum));
	}
}
