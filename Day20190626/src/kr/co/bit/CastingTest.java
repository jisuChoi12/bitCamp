package kr.co.bit;

public class CastingTest {
//객체의 다형성 상위<->하위
	public static void main(String[] args) {
//		첫번째
//		President 객체생성 (Person+President)
		President president1 = new President();	
//		자식객체가 부모객체에 들어감(UpCasting-축소)/암시적 형변환
		Person person1 = president1;
		//부모객체의 함수만 사용가능
		person1.setAddr("");
		person1.setAge(50);
		person1.setName("김김김");
		System.out.println(person1.toString());
		
//		부모객체가 자식객체에 들어감(DownCasting-확장)/객체끼리의 상속/명시적 형변환...개발자가 모든 책임을 지는 한에서
		President president2 = (President) person1;
		//부모객체+자식겍체의 함수 사용가능
		president2.setNation("대한민국");
		president2.setSalary(100);
		president2.setAddr("");
		president2.setAge(60);
		president2.setName("이이이");
		System.out.println(president2.toString());

////		두번째
////		Person 객체생성 (Person) 
//		Person person2 = new Person();
////		객체끼리의 상속 불가능/런타임에러
//		President president3 = (President) person2;
//		president3.setNation("영국");
//		System.out.println(president3.getNation());
		
//		첫번째 (한눈에 보이게)
		President president4 = new President();
		Person person3 = president4; //축소
		president4 = (President)person3; //확장
		president4.setNation("필리핀");
		System.out.println(president4.getNation());
	}
}

