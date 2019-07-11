package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10809 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
//			String[] s = br.readLine().split("");
//			for (int i = 0; i < s.length; i++) {
//				for (int j = 65; j <= 122; j++) {
//					System.out.println();
//				}
//			}
			String s = br.readLine();
			for (int j = 'a'; j <= 'z'; j++) {
				for (int i = 0; i < s.length(); i++) {
					if(s.charAt(i)==j) {
						int ind = i;
						System.out.println((char)j+"ÀÇ ÀÎµ¦½º: "+ind);
					}
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}

//a-z 97-122