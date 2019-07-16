package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek1316 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cheak = new int[26];
		int cnt = 0;
		try {
			int n = br.read();
			for (int i = 0; i < n; i++) {
				cnt = 0;
				String word = br.readLine();
				for (int j = 0; j < word.length(); j++) {
//					if(word.charAt(i)==word.charAt(i+1)) {
//						cnt++;
//					}
				}
				System.out.println(cnt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}


// a-z 97-122


//public class Baek1157 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int[] cnt = new int[26];
//		int max = 0;
//		char answer = '?';
//		
//		String str = scan.next().toUpperCase();
//		
//		for (int i = 0; i < str.length(); i++) {
//			cnt[str.charAt(i)-65]++;
//			if(max<cnt[str.charAt(i)-65]) {
//				max = cnt[str.charAt(i)-65];
//				answer = str.charAt(i);
//			}
//			else if(max == cnt[str.charAt(i)-65]) {
//				answer = '?';
//			}
//		}
//		System.out.println(answer);
//	}
//}