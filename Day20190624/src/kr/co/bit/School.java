package kr.co.bit;
// School�̶�� �⺻ Ŭ���� ����
public class School {
	// ����Ϸ��� ���������ڴ� protected
	protected int kor; //��������
	protected int eng; //��������
	protected int mat; //��������
	protected int total; //����
	protected double avg; //���
	// �Ű������� �ִ� ������ �Լ�
	public School(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	// �Ű������� ���� ������ �Լ�
	public School() {
		this(0,0,0); // ������ �Լ��� ���� �ؼ� �ʱ�ȭ
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int total() {
		return total = kor+eng+mat;
	}
	public double average() {
		avg = total()/3.0;
		return avg;
	}
	@Override
	public String toString() {
		return "School [����=" + kor + ", ����=" + eng + ", ����=" + mat + "]"+"����="+total();
	}
}
