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
				int a = num/10; // ���� �ڸ�
				int b = num%10; // ���� �ڸ�
				int c = a+b; 
				num = b*10+c%10; //���� ������ ���� �ڸ��� ���� ������ ���� �ڸ��� ���Ѱ��� num
				
				if(num==check) //num�� ó�� �Է¹��� ���� ������
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
		