package kr.co.bit.china;

public class SeongnamChina extends China {
	protected int samsun;

	public SeongnamChina() { //부모클래스의 생성자 함수 재사용
		super();
	}
	public SeongnamChina(int jajang, int jjam, int tang, int samsun) {
		super(jajang, jjam, tang); //부모클래스의 생성자 함수 재사용
		this.samsun = samsun; //해당클래스의 변수 초기
	}
	public int getSamsun() {
		return samsun;
	}
	public void setSamsun(int samsun) {
		this.samsun = samsun;
	}
	@Override
	public String toString() {
		return super.toString()+" SeongnamChina [삼선짬뽕=" + samsun + "]";
	}
}
