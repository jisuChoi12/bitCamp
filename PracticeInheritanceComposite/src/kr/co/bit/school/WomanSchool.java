package kr.co.bit.school;

public class WomanSchool extends School {
	protected int gajong; //가정점수
	
	public WomanSchool() {
		super();
	}
	public WomanSchool(int kor, int eng, int mat, int gajong) {
		super(kor, eng, mat);
		this.gajong = gajong;
	}
	public int getGajong() {
		return gajong;
	}
	public void setGajong(int gajong) {
		this.gajong = gajong;
	}
	@Override
	public int total() {
		return super.total()+gajong;
	}
	@Override
	public double average() {
		return this.total()/4.0;
	}
	@Override
	public String toString() {
		return super.toString()+" WomanSchool [가정=" + gajong + "]"+"총합="+total();
	}
	
//	public static void main(String[] args) {
//		WomanSchool womanSchool = new WomanSchool();
//		womanSchool.setKor(90);
//		womanSchool.setEng(80);
//		womanSchool.setMat(70);
//		womanSchool.setGajong(60);
//		System.out.println(womanSchool.toString());
//	}
}
