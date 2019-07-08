package kr.co.bit;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = a*b*c;
		String numStr = String.valueOf(result);
		for(int i=0; i<numStr.length(); i++) {
			System.out.println(numStr.substring(i, i+1));
		}
	}
}
