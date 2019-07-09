package kr.co.bit;

import java.util.Scanner;

public class Baek10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int min = 1000000;
		int max = -1000000;
		int[] arr1 = new int[x];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		for(int j : arr1) {
			if(j>max) {
				max=j;
			}
			if(j<min) {
				min=j;
			}
		}
		System.out.println(min+" "+max);
	}
}
