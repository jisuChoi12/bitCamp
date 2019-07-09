package kr.co.bit2;

import java.util.Arrays;

public class Example12 {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("forEach 출력"); //최종처리 단계
		Arrays.stream(intArr).filter(a -> a%2==0).forEach(n -> System.out.print(n+" "));
		System.out.println();
		
//		System.out.println("peek의 잘못된 사용법");
//		Arrays.stream(intArr).filter(a -> a%2==0).peek(n -> System.out.print(n+" ")); //출력안됨: 중간처리 단계에서 존재하기 때문
//		System.out.println();
		
		System.out.println("peek 출력"); 
		int total = Arrays.stream(intArr).filter(a -> a%2==0).peek(n -> System.out.println(n+" ")).sum();
		System.out.println("총합: "+total);
		
	}
}


// forEach 최종처리단계... 뒤에 연산함수X
// peek 중간쳐리단계... 뒤에 연산함수O