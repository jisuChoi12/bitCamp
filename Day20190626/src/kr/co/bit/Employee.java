package kr.co.bit;

public class Employee extends Person {
	protected String department;
	protected int x;
	
	public Employee() {
		this(null,0);
	}
	public Employee(String department, int x) {
		super();
		this.department = department;
		this.x = x;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void sleep() {
//		super.sleep();
		System.out.println("�������� ���� 7�ð� �ܴ�.");
	}
	@Override
	public void showSleepStyle() {
		System.out.println("�������� �Ͽ� �Ѱ� ���� �ð��� �����ϴ�.");
	}
	@Override
	public String toString() {
		return "Employee [�μ�=" + department + "]";
	}
	
}
