package kr.co.bit;

import java.util.Scanner;

//public class Baek2941 {
//	public static void main(String[] args) {
//		int count=0;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner scan = new Scanner(System.in);
//		try {
//			String str = br.readLine();
//			for (int i = 0; i < str.length(); i++) {
//				if((str.charAt(i)=='c' && str.charAt(i+1)=='=') || (str.charAt(i)=='c' && str.charAt(i+1)=='-')){
//					count +=1;
//					i +=1;
//				}
//				else if((str.charAt(i)=='d' && str.charAt(i+1)=='z' && str.charAt(i+2)=='=')) {
//					count +=1;
//					i +=2;
//				}
//				else if ((str.charAt(i)=='d' && str.charAt(i+1)=='-')) {
//					count +=1;
//					i +=1;
//				}
//				else if(str.charAt(i)=='l' && str.charAt(i+1)=='j' || (str.charAt(i)=='n' && str.charAt(i+1)=='j')) {
//					count +=1;
//					i +=1;
//				}
//				else if(str.charAt(i)=='s' && str.charAt(i+1)=='=' || (str.charAt(i)=='z' && str.charAt(i+1)=='=')) {
//					count +=1;
//					i +=1;
//				}
//				else {
//					count+=1;
//				}
//			}
//			System.out.println(count);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}

public class Baek2941 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String[] replaceStr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for (String str : replaceStr) {
			input = input.replace(str, "a");
		}
		
		System.out.println(input.length());
	}
}
