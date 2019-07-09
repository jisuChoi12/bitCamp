package kr.co.bit2;

import java.util.Arrays;
import java.util.OptionalInt;

public class Example14 {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).count();
		System.out.println("2의 배수 개수: "+count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).sum();
		System.out.println("2의 배수의 합: "+sum);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).max().getAsInt();
		System.out.println("2의 배수중 최대값: "+max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%2==0).min().getAsInt();
		System.out.println("2의 배수중 최소값: "+min);
		
		int first = Arrays.stream(new int[] {1,2,3,4,5}).filter(a -> a%3==0).findFirst().getAsInt();
		System.out.println("첫번째 3의 배수: "+first);
	}
}
