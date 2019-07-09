package kr.co.bit2;

import java.util.Arrays;
import java.util.List;

public class Example05 {
	public static void main(String[] args) {
		List<Student> slist = Arrays.asList(
					new Student("±è±è±è",10),
					new Student("ÀÌÀÌÀÌ",20),
					new Student("¹Ú¹Ú¹Ú",30),
					new Student("ÃÖÃÖÃÖ",40)
				);
		double avg = slist.stream().mapToInt(Student :: getScore).average().getAsDouble();
		System.out.println("Æò±ÕÁ¡¼ö: "+avg);
	}
}
