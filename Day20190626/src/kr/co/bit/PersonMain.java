package kr.co.bit;

public class PersonMain {

	public static void main(String[] args) {
//		downCasting 
		Person person1 = new Student();
		Person person2 = new Employee();
		Person person3 = new President();
		
		Person person4 = new Person();
//		Student student = person4; ����: ����Ŭ������ ��ü�� ������ �Ŀ��� downCasting �Ұ���
//		Student student = (Student) person4; //��Ÿ�ӿ���
	}

}
