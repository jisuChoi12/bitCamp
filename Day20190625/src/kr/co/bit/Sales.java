package kr.co.bit;

public class Sales extends Sawon {
	protected int commition;

	public Sales() {
		super();
		commition = 0;
	}
	public Sales(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition=commition;
	}
	public int getCommition() {
		return commition;
	}
	public void setCommition(int commition) {
		this.commition = commition;
	}
	@Override // �θ�Ŭ�������� �Ȱ��� �޼ҵ尡 �ִ�
	public String toString() {
		return super.toString()+" Sales [commition=" + commition + "]";
	}
	public static void main(String[] args) {
		Sales sales = new Sales("����","���ߺ�",123456,123); //�������Լ��� �̿��� �ʱ�ȭ/�ʱⰪ�ֱ�
//		sales.setName("����"); 
//		sales.setDept("���ߺ�");
//		sales.setSalary(123456);
//		sales.setCommition(123);
		String str = sales.toString();
		System.out.println(str);
	}
}
