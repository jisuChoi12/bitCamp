package kr.co.bit;

public class ConstructorTest {
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.toString());
		Person person2 = new Person("aaa");
		System.out.println(person2.toString());
		Person person3 = new Person(20);
		System.out.println(person3.toString());
	}
}
