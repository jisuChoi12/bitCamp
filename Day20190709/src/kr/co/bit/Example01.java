package kr.co.bit;

import java.util.function.IntBinaryOperator;

public class Example01 {
	private static int[] scores = {92, 95, 87, 75, 84};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int i : scores) {
			result = operator.applyAsInt(result, i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin((a,b) -> (a>=b)?a:b); //(a,b) -> {if(a>b) return a; else return b;}); 
		System.out.println("�ִ밪: "+max);
		int min = maxOrMin((a,b) -> (a<=b)?a:b);
		System.out.println("�ּҰ�: "+min);
	}
}
