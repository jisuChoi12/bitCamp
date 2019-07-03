package kr.co.bit;

import java.util.ArrayList;

public class ArrayTest1 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("A"); // 문자열 추가 가능
//		array.add(1); // 문자열 이외에는 추가 불가능
//		array.add(1.5);
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		array1.add(1); // 정수 추가 가능
//		array1.add("A"); // 정수 이외에는 추가 불가능
//		array1.add(1.5);
		
		
		
//		// 모든 데이터 타입을 추가할 수는 있지만 데이터를 꺼내올 때 문제가 됨 이걸 예방하기 위해 제네릭을 사용
//		ArrayList array = new ArrayList();
//		array2.add("A");
//		array2.add(1);
//		array2.add(1.5);
		
//		ArrayList array1 = new ArrayList();
//		
//		array1.add("A"); //[0]
//		array1.add("B"); //[1]
//		array1.add("C"); //[2]
//		array1.add("D"); //[3]
//		array1.add("E"); //[4]
//		System.out.println(array1); //[A, B, C, D, E]
//		
//		array1.remove(2); // 2번 인덱스 위치에 있는 "C" 삭제
//		System.out.println(array1); //[A, B, D, E]
//		
//		array1.add(2, "C"); // 2번 인덱스 위치에 있는 "C" 추가
//		System.out.println(array1); //[A, B, C, D, E]
//		
//		array1.add(2, "G"); // 2번 인덱스 위치에 있는 "G" 추가
//		System.out.println(array1); //[A, B, G, C, D, E]
	}

}

//제네릭으로 데이터 타입을 일반화하는것은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법
//이렇게 컴파일 시에 미리 타입검사(type check)를 수행하면 사용되는 객체의 타입 안정성이 높아지고 반환값에 대한
//타입 변환 및 타입 검사에 들어가는 노력이 줄어든다.
