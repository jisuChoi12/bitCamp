package kr.co.bit;
// 부모클래스인 Car을 상속
public class HyundaiCar extends Car {
	public int cnt;
	public HyundaiCar() { //생성자함수
		cnt=1;
		engine.kind = "현대엔진";
		for(int i=0; i<door.length; i++) {
			door[i].window = cnt++;
		}
	}
	public static void main(String[] args) {
		HyundaiCar hyundai = new HyundaiCar();
		System.out.println(hyundai.engine.kind);
		for(int i=0; i<hyundai.door.length; i++) {
			System.out.print(hyundai.door[i].window);			
		}
	}
}
