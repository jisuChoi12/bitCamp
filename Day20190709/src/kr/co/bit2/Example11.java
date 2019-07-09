package kr.co.bit2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Example11 {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,4,2,3,1});
		intStream.sorted().forEach(n -> System.out.print(n+","));
		
		System.out.println();
		
//		객체 요소일 경우
		List<Student> stdList = Arrays.asList(
					new Student("김김김", 30),
					new Student("이이이", 42),
					new Student("박박박", 24)
				);
		stdList.stream().sorted().forEach(s -> System.out.print(s.getScore()+",")); //오름차순
		
		System.out.println();
		
		stdList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s.getScore()+",")); //내림차순
	}
}
