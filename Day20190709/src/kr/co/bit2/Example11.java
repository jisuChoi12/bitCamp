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
		
//		��ü ����� ���
		List<Student> stdList = Arrays.asList(
					new Student("����", 30),
					new Student("������", 42),
					new Student("�ڹڹ�", 24)
				);
		stdList.stream().sorted().forEach(s -> System.out.print(s.getScore()+",")); //��������
		
		System.out.println();
		
		stdList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s.getScore()+",")); //��������
	}
}
