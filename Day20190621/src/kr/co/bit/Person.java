package kr.co.bit;

public class Person {
	public String name;
	public int age;
	public int height;
	public int weight;
	@Override
	public String toString() {
		return "Person [이름=" + name + ", 나이=" + age + ", 키=" + height + ", 몸무게=" + weight + "]";
	}
	public Person(){// 디폴트 생성자
		this.name=null;
		this.age=0;
		this.height=0;
		this.weight=0;
	}	
	public Person(String name) {
		this.name=name;
	}
	public Person(int age) {
		this.age=age;
	}
}
