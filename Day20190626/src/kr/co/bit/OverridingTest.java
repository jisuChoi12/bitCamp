package kr.co.bit;

public class OverridingTest {

	public static void main(String[] args) {
		Employee employee = new Employee(); //Employee+Person(���o)
		Person person = employee; // UpCasting-��� (�Ͻ��� ����ȯ)
		System.out.println("employee:"+employee.x);
		System.out.println("person.x:"+person.x);
//      �θ��ڽ� Ŭ������ �Ȱ��� �޼ҵ尡 ������ �ڽ�Ŭ������ ������ �ִ� �޼ҵ尡(@Override)�� �켱
		employee.sleep();
		person.sleep();
	}
}

