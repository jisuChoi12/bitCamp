package kr.co.bit.obj1;
// 포함(composite)의 예시
public class Car {
	public Engine engine; //선언
	public Door[] door;
	
	public Car() { //생성자 함수
		engine = new Engine(); //객체생성
		door = new Door[4]; 
		for(int i=0; i<door.length; i++) { //door은 배열이니까 for문을 써서 초기화
			door[i]=new Door();
		}
	}
	
	public static void main(String[] args) { //main
		Car car = new Car(); //객체생성
		System.out.println(car.engine.kind); //포함(composite)의 특징: .으로 연결해서 쓴다
		car.door[0].window=1; //대입
		car.door[1].window=2;
		car.door[2].window=3;
		car.door[3].window=4;
		for(int i=0; i<car.door.length; i++) { // 배열이니까 for문을 써서 출력
			System.out.println("차문:"+car.door[i].window);
		}
	}
}
