package kr.co.bit;

public class InstanceOfTest {
	/* instanceof ������ �׽�Ʈ */
	public static void main(String[] args) {
		
		President president = new President(); // President+Person(���o) 
		Person person1 = president; // (UpCasting ���)
		if(person1 instanceof President) {
			president = (President) person1; // (DownCasting Ȯ��)
			System.out.println("person1�� PresidentŸ������ ĳ���� ����");
		}else {
			System.out.println("person1��  PresidentŸ������ ĳ���� �� �� ����");
		}
		
		Person person2 = new Person(); // Person(���x)
		if(person2 instanceof President) {
			president = (President)person2;
			System.out.println("person2�� PresidentŸ������ ĳ���� ����");
		}else {
			System.out.println("preson2�� PresidentŸ������ ĳ���� �� �� ����");
		}
	}
}
