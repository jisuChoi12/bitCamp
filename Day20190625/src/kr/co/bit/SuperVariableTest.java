package kr.co.bit;

class Sawon1{
	protected String name;
	public Sawon1() {
		name = "����";
	}
}

class Sales1 extends Sawon1{
	protected String name;
	public Sales1() {
		name="������";
	}
	public String dispLocal() {
		String name="�迬��";
		return name;
	}
	public String dispThis() {
		String name="�繮��";
//		return name;
		return this.name;
	}
	public String dispSuper() {
		String name="���Ϸ�";
//		return name;
		return super.name;
	}
}

public class SuperVariableTest {

	public static void main(String[] args) {
		Sales1 sales1 = new Sales1();
		System.out.println(sales1.dispLocal()); 
		System.out.println(sales1.dispThis()); 
		System.out.println(sales1.dispSuper());
	}
}

// return name�� ��� �켱������ �Լ� �ȿ� ����Ǿ� �ִ� ������ ���� ����
// return this.name�� ��� �켱������ �ش� Ŭ���� �ȿ� ����Ǿ� �ִ� ������ ���� ����.
// return super.name�� ��� �켱������ �θ� Ŭ���� �ȿ� ����Ǿ� �ִ� ������ ���� ����.
// �迬�� �繮�� ���Ϸ� (return name)
// �迬�� ������ ���� (return name/ return this.name/ return super.name)