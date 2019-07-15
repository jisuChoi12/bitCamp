package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2622 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = 0;
		try {
			String str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i)>='A' && str.charAt(i)<='C') {
					time +=3;
				} else if (str.charAt(i) >= 'D' && str.charAt(i) <= 'F') {
					time +=4;
				} else if (str.charAt(i) >= 'G' && str.charAt(i) <= 'I') {
					time +=5;
				} else if (str.charAt(i) >= 'J' && str.charAt(i) <= 'L') {
					time +=6;
				} else if (str.charAt(i) >= 'M' && str.charAt(i) <= 'O') {
					time +=7;
				} else if (str.charAt(i) >= 'P' && str.charAt(i) <= 'S') {
					time +=8;
				} else if (str.charAt(i) >= 'T' && str.charAt(i) <= 'V') {
					time +=9;
				} else if (str.charAt(i) >= 'W' && str.charAt(i) <= 'Z') {
					time +=10;
				}
			}
			System.out.println(time);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


// 65-90 A-Z