//package kr.co.bit;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Baek1157 {
//	
//	public static int countAlphabet(String s) { 
//		
//		int count = 0;
//		for (int i = 'a'; i < 'z'; i++) { //97-122
//			
//		}
//		for (int i = 'A'; i < 'Z'; i++) { //65-90
//			
//		}
//		return count;
//	}
//	
//	public static void main(String[] args) {
//		String[] alphebet = {"A","B","C","D","E","G","H","I","J","K","L",
//				"M","N","O","P", "Q"};
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String[] str = br.readLine().split("");
//			for (int i = 0; i < str.length; i++) {
//				countAlphabet(str[i]);
//			}
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
