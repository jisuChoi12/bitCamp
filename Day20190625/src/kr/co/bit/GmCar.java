package kr.co.bit;
// �θ�Ŭ���� Car�� ���
public class GmCar extends Car {
	protected int cnt;
	public GmCar() { //�������Լ�
		cnt=1; 
		for(int i=0; i<door.length; i++) {
			door[i].window = cnt++;
		}
	}
	public static void main(String[] args) { //main
		GmCar gm = new GmCar(); //��ü���� 
		gm.engine.kind="GM��쿣��"; //������ Ŭ������ ���� ���
		System.out.println(gm.engine.kind);
		for(int i=0; i<gm.door.length; i++) {
			System.out.print(gm.door[i].window);
		}
	}
}
