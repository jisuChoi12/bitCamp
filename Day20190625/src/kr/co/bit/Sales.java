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
	@Override // 부모클래스에도 똑같은 메소드가 있다
	public String toString() {
		return super.toString()+" Sales [commition=" + commition + "]";
	}
	public static void main(String[] args) {
		Sales sales = new Sales("김사원","개발부",123456,123); //생성자함수를 이용한 초기화/초기값주기
//		sales.setName("김사원"); 
//		sales.setDept("개발부");
//		sales.setSalary(123456);
//		sales.setCommition(123);
		String str = sales.toString();
		System.out.println(str);
	}
}
