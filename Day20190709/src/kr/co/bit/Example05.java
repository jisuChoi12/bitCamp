package kr.co.bit;

import java.util.function.IntPredicate;

public class Example05 {
	public static void main(String[] args) {
//		2배수 검사
		IntPredicate pa = a -> a%2==0;
//		3배수 검사
		IntPredicate pb = a -> a%3==0;
		
		IntPredicate pab;
			
		pab = pa.or(pb); // 2배수거나 3배수면
		System.out.println("2나 3의 배수입니까?: "+pab.test(9));
		
		pab = pa.and(pb); // 2배수면서 3배수면
		System.out.println("2와 3의 배수입니까?: "+pab.test(9));
		
		pab = pa.negate();
		System.out.println("홀수입니까?: "+pab.test(9));
		
		
	}
}
