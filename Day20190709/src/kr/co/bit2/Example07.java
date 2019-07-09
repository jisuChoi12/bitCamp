package kr.co.bit2;

import java.util.Arrays;
import java.util.List;

public class Example07 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
					new Member("±è½ÅÈñ", Member.FEMALE, 30),
					new Member("·ù½Â°ï", Member.MALE, 29),
					new Member("±è»õÇØ", Member.FEMALE, 32),
					new Member("ÀÌ»õº®", Member.FEMALE, 25),
					new Member("Á¤ÁÖ¿ø", Member.MALE, 27)
				);
		
		double ageAvg1 = list.stream().filter(
				m -> m.getGender()==Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("³²ÀÚ Æò±Õ ³ªÀÌ: "+ageAvg1);
		
		double ageAvg2 = list.stream().filter(
				m -> m.getGender()==Member.FEMALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("¿©ÀÚ Æò±Õ ³ªÀÌ: "+ageAvg2);
	}
}
