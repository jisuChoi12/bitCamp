package kr.co.bit;
// �θ�Ŭ������ Car�� ���
public class HyundaiCar extends Car {
	public int cnt;
	public HyundaiCar() { //�������Լ�
		cnt=1;
		engine.kind = "���뿣��";
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
