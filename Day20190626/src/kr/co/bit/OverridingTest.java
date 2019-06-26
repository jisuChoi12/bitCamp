package kr.co.bit;

public class OverridingTest {

	public static void main(String[] args) {
		Employee employee = new Employee(); //Employee+Person(상속o)
		Person person = employee; // UpCasting-축소 (암시적 형변환)
		System.out.println("employee:"+employee.x);
		System.out.println("person.x:"+person.x);
//      부모자식 클래스에 똑같은 메소드가 있을때 자식클래스가 가지고 있는 메소드가(@Override)가 우선
		employee.sleep();
		person.sleep();
	}
}

