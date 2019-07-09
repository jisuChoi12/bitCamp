package kr.co.bit;

import java.util.Arrays;
import java.util.Scanner;

public class Baek10989 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		n = scan.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
