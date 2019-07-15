package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek1157 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] cnt = new int[26];
		int max = 0;
		char answer = '?';
		
		String str = scan.next().toUpperCase();
		
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)-65]++;
			if(max<cnt[str.charAt(i)-65]) {
				max = cnt[str.charAt(i)-65];
				answer = str.charAt(i);
			}
			else if(max == cnt[str.charAt(i)-65]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}


//public class Baek1157 {
//	
//	public static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L",
//				"M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//
//	public static int[] cnt = new int[26];
//
//	public static void countAlphabet(String[] str) {
//		int count=0;
//		for (int i = 0; i < alphabet.length; i++) {
//			for (int j = 0; j < str.length; j++) {
//				if (str[j].equalsIgnoreCase(alphabet[i])) {
//					cnt[i]+=1;
//				}
//			}
//		}
//	}
//
//	public static void findMax() {
//		int max = -1;
//		for (int j = 0; j < cnt.length; j++) {
//			max = Math.max(max, cnt[j]);
//		}
//		String maxString = null;
//		for (int i = 0; i < cnt.length; i++) {
//			if(cnt[i]==max) {
//				if(maxString==null) {
//					maxString = alphabet[i];					
//				}
//				else if(maxString!=null) {
//					maxString = "?";
//				}
//			}
//		}
//		System.out.println(maxString);
//	}
//
//	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String[] str = br.readLine().split("");
//			countAlphabet(str);
//			findMax();
//		} catch (
//		IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
