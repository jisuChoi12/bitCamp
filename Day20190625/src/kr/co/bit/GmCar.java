package kr.co.bit;
// 부모클래스 Car을 상속
public class GmCar extends Car {
	protected int cnt;
	public GmCar() { //생성자함수
		cnt=1; 
		for(int i=0; i<door.length; i++) {
			door[i].window = cnt++;
		}
	}
	public static void main(String[] args) { //main
		GmCar gm = new GmCar(); //객체생성 
		gm.engine.kind="GM대우엔진"; //포함한 클래스의 변수 사용
		System.out.println(gm.engine.kind);
		for(int i=0; i<gm.door.length; i++) {
			System.out.print(gm.door[i].window);
		}
	}
}
