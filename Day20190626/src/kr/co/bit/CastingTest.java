package kr.co.bit;

public class CastingTest {
//��ü�� ������ ����<->����
	public static void main(String[] args) {
//		ù��°
//		President ��ü���� (Person+President)
		President president1 = new President();	
//		�ڽİ�ü�� �θ�ü�� ��(UpCasting-���)/�Ͻ��� ����ȯ
		Person person1 = president1;
		//�θ�ü�� �Լ��� ��밡��
		person1.setAddr("");
		person1.setAge(50);
		person1.setName("����");
		System.out.println(person1.toString());
		
//		�θ�ü�� �ڽİ�ü�� ��(DownCasting-Ȯ��)/��ü������ ���/����� ����ȯ...�����ڰ� ��� å���� ���� �ѿ���
		President president2 = (President) person1;
		//�θ�ü+�ڽā�ü�� �Լ� ��밡��
		president2.setNation("���ѹα�");
		president2.setSalary(100);
		president2.setAddr("");
		president2.setAge(60);
		president2.setName("������");
		System.out.println(president2.toString());

////		�ι�°
////		Person ��ü���� (Person) 
//		Person person2 = new Person();
////		��ü������ ��� �Ұ���/��Ÿ�ӿ���
//		President president3 = (President) person2;
//		president3.setNation("����");
//		System.out.println(president3.getNation());
		
//		ù��° (�Ѵ��� ���̰�)
		President president4 = new President();
		Person person3 = president4; //���
		president4 = (President)person3; //Ȯ��
		president4.setNation("�ʸ���");
		System.out.println(president4.getNation());
	}
}

