package kr.co.bit.school;

public class ManSchool extends School {
	protected int gisul; //기술점수
	
	public ManSchool() {
		super(); // 부모클래스의 매개변수가 없는 생성자 함수 호출/재사용/초기화
	}
	public ManSchool(int kor, int eng, int mat, int gisul) {
		super(kor,eng,mat); // 부모클래스의 매개변수가 있는 생성자 함수 호출/재사용/초기화
		this.gisul = gisul;
	}
	public int getGisul() {
		return gisul;
	}
	public void setGisul(int gisul) {
		this.gisul = gisul;
	}
	@Override
	public int total() {
		return super.total()+gisul;
	}
	@Override
	public double average() {
		return this.total()/4.0;
	}
	@Override
	public String toString() {
		return super.toString()+" ManSchool [기술=" + gisul + "]"+"총합="+total();
	} //super.toString() 부모 클래스에 있는 toString함수 호출. total은 자식클래스에 있는 total함수 호출
	
//	public static void main(String[] args) {
//		ManSchool manSchool = new ManSchool();
//		manSchool.setKor(90);
//		manSchool.setEng(80);
//		manSchool.setMat(70);
//		manSchool.setGisul(60);
//		System.out.println(manSchool.toString());
//	}
}
