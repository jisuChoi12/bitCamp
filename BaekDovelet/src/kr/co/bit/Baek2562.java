package kr.co.bit;

import java.util.Scanner;

public class Baek2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = -100000;
		int a = 0;
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				a = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(a);
	}
}
