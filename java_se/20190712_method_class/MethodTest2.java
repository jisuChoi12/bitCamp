/*
10���� �Է� : 13
2���� = ??
8���� = ??
16���� = ??
*/

import java.util.Scanner;

class  MethodTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("10���� �Է� : ");
		int num = scan.nextInt();

		String binary = Integer.toBinaryString(num);
		String octal = Integer.toOctalString(num);
		String hex = Integer.toHexString(num);

		System.out.println("2���� = "+binary);
		System.out.println("8���� = "+octal);
		System.out.println("16���� = "+hex);
	}
}
