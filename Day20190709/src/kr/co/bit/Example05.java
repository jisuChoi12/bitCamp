package kr.co.bit;

import java.util.function.IntPredicate;

public class Example05 {
	public static void main(String[] args) {
//		2��� �˻�
		IntPredicate pa = a -> a%2==0;
//		3��� �˻�
		IntPredicate pb = a -> a%3==0;
		
		IntPredicate pab;
			
		pab = pa.or(pb); // 2����ų� 3�����
		System.out.println("2�� 3�� ����Դϱ�?: "+pab.test(9));
		
		pab = pa.and(pb); // 2����鼭 3�����
		System.out.println("2�� 3�� ����Դϱ�?: "+pab.test(9));
		
		pab = pa.negate();
		System.out.println("Ȧ���Դϱ�?: "+pab.test(9));
		
		
	}
}
