package kr.co.bit;
//��ü(Engine�� Door�� ����)
public class Car {
	public Engine engine; //����
	public Door[] door;
	public Car() { //�������Լ�
		engine = new Engine(); //��ü����
		door = new Door[4];
		for(int i=0; i<door.length; i++) {
			door[i] = new Door();
		}
	}
}
