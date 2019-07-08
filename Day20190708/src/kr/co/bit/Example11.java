package kr.co.bit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Example11 {
	private static List<Student> list = Arrays.asList(
				new Student("홍길동",80,92),
				new Student("김삿갓",90,75)
			);
	
	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.print(func.apply(student)+" "); // 
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.print(func.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t->t.getName()); //기능정의: t->t.getName()
		
		System.out.println("[영어점수]");
		printInt(t->t.getEng());
		
		System.out.println("[수학점수]");
		printInt(t->t.getMath());
	}
}

// apply라는 메소드가 뭘 할지는 모르겠지만 그 결과값을 출력을 할거다
// 함수에 있는 인자값을 던져서 넘김
// 순차지향X
// t가 어떻게 선언하지도 않았는데 Student객체인지 알았냐면 <>안에 Student를 넣었으니까
// 가상으로 Student안에 있는 메소드들을 잡아줌