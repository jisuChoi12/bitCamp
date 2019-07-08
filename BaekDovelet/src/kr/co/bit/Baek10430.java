package kr.co.bit;

import java.util.Scanner;

public class Baek10430 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int calc1 =0;
		int calc2=0;
		int calc3=0;
		int calc4=0;
		calc1 = (a+b)%c;
		calc2 = ((a%b)+(b%c))%c;
		calc3 = (a*b)%c;
		calc4 = ((a%b)*(b%c))%c;
		System.out.println(calc1);
		System.out.println(calc2);
		System.out.println(calc3);
		System.out.println(calc4);		
	}
}
