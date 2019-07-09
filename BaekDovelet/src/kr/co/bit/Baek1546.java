package kr.co.bit;

import java.util.Scanner;

public class Baek1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double[] arr1 = new double[x];
		double max = 0.0;
		double total = 0.0;
		double avg=0.0;
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		for (double j : arr1) {
			if(j>max) {
				max = j;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i]/max*100;
	
		}
		for (int i = 0; i < arr1.length; i++) {
			total += arr1[i];
		}
		avg = total/(double)x;
		System.out.print(avg);
	}
}
