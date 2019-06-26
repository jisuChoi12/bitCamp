package kr.co.bit.obj;
//기본클래스
public class China {
	protected int jajang; //변수선언
	protected int jjam;
	protected int tang;
	
	public China() { // 기본 생성자
	}
	public China(int jajang, int jjam, int tang) { // 매개변수가 있는 생성자
		this.jajang = jajang;
		this.jjam = jjam;
		this.tang = tang;
	}
	public int getJajang() { //getter 값을 불러오기 위한 함수
		return jajang;
	}
	public void setJajang(int jajang) { //setter 값을 입력하기 위한 함수
		this.jajang = jajang;
	}
	public int getJjam() {
		return jjam;
	}
	public void setJjam(int jjam) {
		this.jjam = jjam;
	}
	public int getTang() {
		return tang;
	}
	public void setTang(int tang) {
		this.tang = tang;
	}
	@Override
	public String toString() {
		return "China [자장면=" + jajang + ", 짬뽕=" + jjam + ", 탕수육=" + tang + "]";
	}
}
