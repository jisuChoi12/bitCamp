package kr.co.bit;

import java.util.Scanner;


public class Scanner_Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����Է�:");
		int num = input.nextInt();
		System.out.println(num);
		System.out.println("�����Է�:");
		String str=input.next();
		System.out.println(str);
		System.out.println("�Ǽ��Է�");
		double sil=input.nextDouble();
		System.out.println(sil);
		
	}

}
