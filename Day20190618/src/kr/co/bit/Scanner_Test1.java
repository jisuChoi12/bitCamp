package kr.co.bit;

import java.util.Scanner;


public class Scanner_Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력:");
		int num = input.nextInt();
		System.out.println(num);
		System.out.println("문자입력:");
		String str=input.next();
		System.out.println(str);
		System.out.println("실수입력");
		double sil=input.nextDouble();
		System.out.println(sil);
		
	}

}
