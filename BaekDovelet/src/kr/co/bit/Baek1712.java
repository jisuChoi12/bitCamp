package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek1712 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a; // ������� : �Ӵ��,��꼼,�����,�޿�
		int b; // ������� : ���� �ΰǺ�
		int c; // ��Ʈ�� ����
		
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
