package kr.co.bit;

public class WomanSangupSchool extends WomanSchool {
	protected int sangup;
	
	public WomanSangupSchool() {
		super();
	}
	public WomanSangupSchool(int kor, int eng, int mat, int gajong, int sangup) {
		super(kor,eng,mat,gajong);
		this.sangup = sangup;
	}
	public int getSangup() {
		return sangup;
	}
	public void setSangup(int sangup) {
		this.sangup = sangup;
	}
	@Override
	public int total() {
		return super.total()+sangup;
	}
	@Override
	public double average() {
		return this.total()/5.0;
	}
	@Override
	public String toString() {
		return super.toString()+" WomanSangupSchool [»ó¾÷=" + sangup + "]"+"ÃÑÇÕ="+total();
	}
	
//	public static void main(String[] args) {
//		WomanSangupSchool womanSangupSchool = new WomanSangupSchool();
//		womanSangupSchool.setKor(90);
//		womanSangupSchool.setEng(80);
//		womanSangupSchool.setMat(70);
//		womanSangupSchool.setGajong(60);
//		womanSangupSchool.setSangup(50);
//		System.out.println(womanSangupSchool.toString());
//	}
}
