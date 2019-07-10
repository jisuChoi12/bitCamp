package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1110 {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(br.readLine());
			int count = 1;
			int check = num;
			while(true) {
				int a = num/10; // 십의 자리
				int b = num%10; // 일의 자리
				int c = a+b; 
				num = b*10+c%10; //현재 정수의 십의 자리와 이전 정수의 일의 자리를 더한값이 num
				
				if(num==check) //num이 처음 입력받은 값과 같으면
					break;
				else
					count++;
			}
			System.out.println(count);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
		