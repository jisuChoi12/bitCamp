package kr.co.bit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example02 {
	private static List<Student> list = Arrays.asList(
				new Student("채안석", "남자", 90),
				new Student("김한신", "남자", 89),
				new Student("정유미", "여자", 98),
				new Student("김인형", "남자", 87),
				new Student("사문영", "여자", 83)
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
		double maleAvg = avg(t -> t.getGender().equals("남자"));
		System.out.println("남자 평균점수: "+maleAvg);
		double femaleAvg = avg(t -> t.getGender().equals("여자"));
		System.out.println("여자 평균점수: "+femaleAvg);
	}
}
