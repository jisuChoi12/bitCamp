package kr.co.bit;

import java.util.function.ToIntBiFunction;

public class Example08 {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> func;
		func = (a,b) -> a.compareToIgnoreCase(b);
		print(func.applyAsInt("java8", "JAVA8"));
		
		func = String :: compareToIgnoreCase;
		print(func.applyAsInt("java8", "JAVA8"));
		
	}
	
	public static void print(int order) {
		if(order<0) {
			System.out.println("���������� ���� �ɴϴ�.");
		} else if(order==0) {
			System.out.println("������ ���ڿ��Դϴ�.");
		} else {
			System.out.println("���������� ���߿� �ɴϴ�");
		}
	}
}
