package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest1 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열입력:");

		try {
			String str=bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 한줄을 통채로 읽음
		
	
//		int num = Integer.parseInt(args[0]);
//		int result = 10/num;
//		System.out.println("result="+result);
	}
}
