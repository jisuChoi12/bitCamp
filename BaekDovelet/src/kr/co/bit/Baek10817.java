package kr.co.bit;

import java.util.Arrays;
import java.util.Scanner;

public class Baek10817 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}
