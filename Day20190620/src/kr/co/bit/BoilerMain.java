package kr.co.bit;


// private 변수를 외부 클래스에서 사용할때는 public인 메소드를 이용하면 가능하다
// package가 다르면 import

public class BoilerMain {

	public static void main(String[] args) {
		Boiler boiler = new Boiler();
		boiler.set();
	}
}
