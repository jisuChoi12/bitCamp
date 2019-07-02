package kr.co.bit;

class Student1{
	private int num;
	private String name;
	public Student1(int num, String name) {
		this.num=num;
		this.name=name;
	}
	//Object클래스의 equals 메소드를 문자열과 정수를 비교하는 equals메소드로 오버라이드 
	@Override
	public boolean equals(Object obj) { // (Object obj = (Object)st2) upCasting 축소
		Student1 st = null;
		if(obj instanceof Student1) { //Casting 가능한지 체크
			st = (Student1) obj; //downCasting 확장
		}
		return (st!=null && st.name.equals(name) && st.num==num);
	}
	
	//Object클래스의 toString 메소드를 오버라이드
	@Override
	public String toString() {
		return "Student1 [num=" + num + ", name=" + name + "]";
	}
}

public class EqualsTest1 {

	public static void main(String[] args) {
		Student1 st1 = new Student1(1, "최지수");
		Student1 st2 = new Student1(1, "최지수");
		System.out.println("==로 비교");
		System.out.println("st1==st2:"+(st1==st2)); 
		System.out.println("equals로 비교"); //원래대로라면 false -> 오버라이드 해서 true
		System.out.println("st1.equals(st2)"+st1.equals(st2));
		System.out.println(st1); // System.out.println(st1.toString());
		System.out.println(st2);
	}
}

// ==로 비교
// st1 ---> 1, "최지수"
// st2 ---> 1, "최지수"
// 내용은 같지만 "객체의 주소"가 다르기 때문에 false (Object클래스의 equals 메소드 호출)

// equals로 비교
// 문자열만 비교하고 정수형은 비교가 불가능
// 오버라이드해서 기존의 equals메소드를 수정해서 사용하면 비교가능

// 오버라이드 하지 않고 Object의 toString()메소드를 사용하면 @해쉬코드 값의 형태가 출력된다.