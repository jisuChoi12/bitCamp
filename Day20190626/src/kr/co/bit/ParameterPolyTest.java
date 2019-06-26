package kr.co.bit;

class PersonInfo{
	public void showSleepingType(Person person) { //파라미터의 다형성
		person.showSleepStyle();
	}
}

public class ParameterPolyTest {
	public static void main(String[] args) {
//		객체생성
		PersonInfo pf = new PersonInfo();
		Person person = new Person();
		Employee employee = new Employee();
		Student student = new Student();
		President president = new President();
		
		pf.showSleepingType(person);
		pf.showSleepingType(employee);
		pf.showSleepingType(student);
		pf.showSleepingType(president);
	}
}

