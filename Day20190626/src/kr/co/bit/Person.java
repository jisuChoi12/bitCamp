package kr.co.bit;

public class Person {
	protected int age;
	protected String name;
	protected String addr;
	int x;
	
	public Person() {
		this(0,null,null,0);
	}
	public Person(int age, String name, String addr, int x) {
		this.age = age;
		this.name = name;
		this.addr = addr;
		this.x=x;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void sleep() {
		System.out.println("사람은 보통 10시간 잔다.");
	}
	public void showSleepStyle() {
		System.out.println("사람들의 수면 스타일은 다양히다.");
	}
	@Override
	public String toString() {
		return "Person [나이=" + age + ", 이름=" + name + ", 주소=" + addr + "]";
	}
}
