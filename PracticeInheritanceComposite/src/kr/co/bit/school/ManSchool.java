package kr.co.bit.school;

public class ManSchool extends School {
	protected int gisul; //�������
	
	public ManSchool() {
		super(); // �θ�Ŭ������ �Ű������� ���� ������ �Լ� ȣ��/����/�ʱ�ȭ
	}
	public ManSchool(int kor, int eng, int mat, int gisul) {
		super(kor,eng,mat); // �θ�Ŭ������ �Ű������� �ִ� ������ �Լ� ȣ��/����/�ʱ�ȭ
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
		return super.toString()+" ManSchool [���=" + gisul + "]"+"����="+total();
	} //super.toString() �θ� Ŭ������ �ִ� toString�Լ� ȣ��. total�� �ڽ�Ŭ������ �ִ� total�Լ� ȣ��
	
//	public static void main(String[] args) {
//		ManSchool manSchool = new ManSchool();
//		manSchool.setKor(90);
//		manSchool.setEng(80);
//		manSchool.setMat(70);
//		manSchool.setGisul(60);
//		System.out.println(manSchool.toString());
//	}
}
