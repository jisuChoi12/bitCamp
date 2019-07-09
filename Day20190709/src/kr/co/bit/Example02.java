package kr.co.bit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example02 {
	private static List<Student> list = Arrays.asList(
				new Student("ä�ȼ�", "����", 90),
				new Student("���ѽ�", "����", 89),
				new Student("������", "����", 98),
				new Student("������", "����", 87),
				new Student("�繮��", "����", 83)
				);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for (Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getGender().equals("����"));
		System.out.println("���� �������: "+maleAvg);
		double femaleAvg = avg(t -> t.getGender().equals("����"));
		System.out.println("���� �������: "+femaleAvg);
	}
}
