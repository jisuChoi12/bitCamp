package kr.co.bit;

import java.util.Scanner;

public class Baek2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		if(m<45 && h>=1) {
			h = h-1;
			m = 60+(m-45);
		}
		else if(h<=0 && m<45 && m>0) {
			h = 24+h;
			m = 60+(m-45);
		}
		else if(h>=0 && m>=45) {
			m = m-45;
		}
		else if(h==0 && m==0) {
			h = 23;
			m = 60+(m-45);
		}
		System.out.println(h+" "+m);
	}
}
