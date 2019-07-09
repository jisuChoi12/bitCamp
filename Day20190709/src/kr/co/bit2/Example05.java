package kr.co.bit2;

import java.util.Arrays;
import java.util.List;

public class Example05 {
	public static void main(String[] args) {
		List<Student> slist = Arrays.asList(
					new Student("����",10),
					new Student("������",20),
					new Student("�ڹڹ�",30),
					new Student("������",40)
				);
		double avg = slist.stream().mapToInt(Student :: getScore).average().getAsDouble();
		System.out.println("�������: "+avg);
	}
}
