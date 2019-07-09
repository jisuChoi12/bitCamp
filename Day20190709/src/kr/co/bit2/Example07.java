package kr.co.bit2;

import java.util.Arrays;
import java.util.List;

public class Example07 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
					new Member("�����", Member.FEMALE, 30),
					new Member("���°�", Member.MALE, 29),
					new Member("�����", Member.FEMALE, 32),
					new Member("�̻���", Member.FEMALE, 25),
					new Member("���ֿ�", Member.MALE, 27)
				);
		
		double ageAvg1 = list.stream().filter(
				m -> m.getGender()==Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("���� ��� ����: "+ageAvg1);
		
		double ageAvg2 = list.stream().filter(
				m -> m.getGender()==Member.FEMALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("���� ��� ����: "+ageAvg2);
	}
}
