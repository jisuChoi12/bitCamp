package kr.co.bit;

import java.util.Scanner;

public class Baek2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		if(m-45<0) {
			h = h-1;
			m = m+15;
		} else {
			m = m-45;
		}
		if(h<0) {
			h = 23;
		}
		System.out.println(h+" "+m);
	}
}
