package kr.co.bit.obj1;
// ����(composite)�� ����
public class Car {
	public Engine engine; //����
	public Door[] door;
	
	public Car() { //������ �Լ�
		engine = new Engine(); //��ü����
		door = new Door[4]; 
		for(int i=0; i<door.length; i++) { //door�� �迭�̴ϱ� for���� �Ἥ �ʱ�ȭ
			door[i]=new Door();
		}
	}
	
	public static void main(String[] args) { //main
		Car car = new Car(); //��ü����
		System.out.println(car.engine.kind); //����(composite)�� Ư¡: .���� �����ؼ� ����
		car.door[0].window=1; //����
		car.door[1].window=2;
		car.door[2].window=3;
		car.door[3].window=4;
		for(int i=0; i<car.door.length; i++) { // �迭�̴ϱ� for���� �Ἥ ���
			System.out.println("����:"+car.door[i].window);
		}
	}
}
