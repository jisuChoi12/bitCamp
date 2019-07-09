package kr.co.bit2;

import java.util.Arrays;
import java.util.OptionalInt;

public class Example14 {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).count();
		System.out.println("2�� ��� ����: "+count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).sum();
		System.out.println("2�� ����� ��: "+sum);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).max().getAsInt();
		System.out.println("2�� ����� �ִ밪: "+max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).min().getAsInt();
		System.out.println("2�� ����� �ּҰ�: "+min);
		
		int first = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%3==0).findFirst().getAsInt();
		System.out.println("ù��° 3�� ���: "+first);
	}
}
