package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek1712 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a; // 고정비용 : 임대료,재산세,보험료,급여
		int b; // 가변비용 : 재료비 인건비
		int c; // 노트북 가격
		
		try {
			String[] abc = br.readLine().split(" ");
			 a = Integer.parseInt(abc[0]);
			 b = Integer.parseInt(abc[1]);
			 c = Integer.parseInt(abc[2]);
			
			System.out.println(a+" "+b+" "+c);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
