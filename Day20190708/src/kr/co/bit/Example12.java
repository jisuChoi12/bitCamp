package kr.co.bit;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Example12 {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿",80,92),
			new Student("���",90,75)
		);
	
	public static int avg(ToIntFunction<Student> func) {
		int sum = 0;
		for (Student student : list) {
			sum += func.applyAsInt(student);
		}
		return sum/list.size();
	}
	
	public static void main(String[] args) {
		System.out.println("�����������: "+ avg(s->s.getEng()));
		System.out.println("�����������: "+ avg(s->s.getMath()));
		
	}
}
