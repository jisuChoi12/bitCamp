package kr.co.bit;

class Student{
	SchoolType school; 
		public Student(SchoolType school) { 
			this.school = school;
		}
}

enum SchoolType{ 
	ELEMENTARY,MIDDLE,HIGH,UNIVERSITY // ������� 1,2,3,,,n
}

public class EnumTest2 {
	public static void main(String[] args) {
		Student st = new Student(SchoolType.ELEMENTARY);
		System.out.println("����� ����� ���");
		System.out.println("st.school:"+st.school);
		if(st.school==SchoolType.ELEMENTARY) {
			System.out.println("st.school==Student.ELEMENTARY�� ��������");
			System.out.println("����� �ʵ��л��Դϴ�.");
		}
//		if(st.school==1) { //������ ���� ��x
//			System.out.println("st.school==1�� ��������");
//			System.out.println("����� �ʵ��л��Դϴ�.");
//		}
	}
}


// enum�� ���ü��� �ִ� �����͵��� ���ó�� �����ؼ� ����� �� �ִ� ������.
// ������ ���
