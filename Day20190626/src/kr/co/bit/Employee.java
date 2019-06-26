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
		System.out.println("직장인은 보통 7시간 잔다.");
	}
	@Override
	public void showSleepStyle() {
		System.out.println("직장인은 일에 쫓겨 수면 시간이 부족하다.");
	}
	@Override
	public String toString() {
		return "Employee [부서=" + department + "]";
	}
	
}
