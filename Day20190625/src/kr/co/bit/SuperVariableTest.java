package kr.co.bit;

class Sawon1{
	protected String name;
	public Sawon1() {
		name = "김사원";
	}
}

class Sales1 extends Sawon1{
	protected String name;
	public Sales1() {
		name="조현정";
	}
	public String dispLocal() {
		String name="김연우";
		return name;
	}
	public String dispThis() {
		String name="사문영";
//		return name;
		return this.name;
	}
	public String dispSuper() {
		String name="김하루";
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

// return name일 경우 우선순위는 함수 안에 선언되어 있는 변수가 가장 높다
// return this.name일 경우 우선순위는 해당 클래스 안에 선언되어 있는 변수가 가장 높다.
// return super.name일 경우 우선순위는 부모 클래스 안에 선언되어 있는 변수가 가장 높다.
// 김연우 사문영 김하루 (return name)
// 김연우 조현정 김사원 (return name/ return this.name/ return super.name)