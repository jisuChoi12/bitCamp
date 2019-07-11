package kr.co.bit;

import java.util.Scanner;

public class Baek10872 {

//	public static int factorials(int n) {
//		int facto = n;
//		if(n==0) {
//			facto = 1;
//		}
//		else {
//			for(int i=1; i<n; i++) {
//				facto = facto*(i);
//			}
//		}
//		return facto;
//	}
	
	public static int factorials(int n) {
		if(n==0) {
			return 1;
		} else {
			return n*factorials(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int factoto = factorials(n);
		System.out.println(factoto);
	}
}
