package kr.co.bit;
// School이라는 기본 클래스 생성
public class School {
	// 상속하려면 접근제어자는 protected
	protected int kor; //국어점수
	protected int eng; //영어점수
	protected int mat; //수학점수
	protected int total; //총합
	protected double avg; //평균
	// 매개변수가 있는 생성자 함수
	public School(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	// 매개변수가 없는 생성자 함수
	public School() {
		this(0,0,0); // 생성자 함수를 재사용 해서 초기화
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
		return "School [국어=" + kor + ", 영어=" + eng + ", 수학=" + mat + "]"+"총합="+total();
	}
}
