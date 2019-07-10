package kr.co.bit;

import java.util.Scanner;

public class Baek2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = a*b*c;
		String[] numstr = String.valueOf(result).split("");
		for(int i=0; i<10; i++) {
			count=0;
			for(int j=0; j<numstr.length; j++) {
				if(numstr[j].equals(Integer.toString(i))) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
