package kr.co.bit;

import java.util.Arrays;
import java.util.Scanner;

public class Baek3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			arr[i] = arr[i] % 42;
		}
		Arrays.sort(arr);

		for (int i = 0; i < 9; i++) {
			if (arr[i] != arr[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}