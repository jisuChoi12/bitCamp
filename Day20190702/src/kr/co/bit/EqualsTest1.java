package kr.co.bit;

class Student1{
	private int num;
	private String name;
	public Student1(int num, String name) {
		this.num=num;
		this.name=name;
	}
	//ObjectŬ������ equals �޼ҵ带 ���ڿ��� ������ ���ϴ� equals�޼ҵ�� �������̵� 
	@Override
	public boolean equals(Object obj) { // (Object obj = (Object)st2) upCasting ���
		Student1 st = null;
		if(obj instanceof Student1) { //Casting �������� üũ
			st = (Student1) obj; //downCasting Ȯ��
		}
		return (st!=null && st.name.equals(name) && st.num==num);
	}
	
	//ObjectŬ������ toString �޼ҵ带 �������̵�
	@Override
	public String toString() {
		return "Student1 [num=" + num + ", name=" + name + "]";
	}
}

public class EqualsTest1 {

	public static void main(String[] args) {
		Student1 st1 = new Student1(1, "������");
		Student1 st2 = new Student1(1, "������");
		System.out.println("==�� ��");
		System.out.println("st1==st2:"+(st1==st2)); 
		System.out.println("equals�� ��"); //������ζ�� false -> �������̵� �ؼ� true
		System.out.println("st1.equals(st2)"+st1.equals(st2));
		System.out.println(st1); // System.out.println(st1.toString());
		System.out.println(st2);
	}
}

// ==�� ��
// st1 ---> 1, "������"
// st2 ---> 1, "������"
// ������ ������ "��ü�� �ּ�"�� �ٸ��� ������ false (ObjectŬ������ equals �޼ҵ� ȣ��)

// equals�� ��
// ���ڿ��� ���ϰ� �������� �񱳰� �Ұ���
// �������̵��ؼ� ������ equals�޼ҵ带 �����ؼ� ����ϸ� �񱳰���

// �������̵� ���� �ʰ� Object�� toString()�޼ҵ带 ����ϸ� @�ؽ��ڵ� ���� ���°� ��µȴ�.