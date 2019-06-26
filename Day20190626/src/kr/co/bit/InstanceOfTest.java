package kr.co.bit;

public class InstanceOfTest {
	/* instanceof 연산자 테스트 */
	public static void main(String[] args) {
		
		President president = new President(); // President+Person(상속o) 
		Person person1 = president; // (UpCasting 축소)
		if(person1 instanceof President) {
			president = (President) person1; // (DownCasting 확장)
			System.out.println("person1을 President타입으로 캐스팅 성공");
		}else {
			System.out.println("person1을  President타입으로 캐스팅 할 수 없음");
		}
		
		Person person2 = new Person(); // Person(상속x)
		if(person2 instanceof President) {
			president = (President)person2;
			System.out.println("person2를 President타입으로 캐스팅 성공");
		}else {
			System.out.println("preson2를 President타입으로 캐스팅 할 수 없음");
		}
	}
}
