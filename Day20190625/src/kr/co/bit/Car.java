package kr.co.bit;
//전체(Engine과 Door을 포함)
public class Car {
	public Engine engine; //선언
	public Door[] door;
	public Car() { //생성자함수
		engine = new Engine(); //객체생성
		door = new Door[4];
		for(int i=0; i<door.length; i++) {
			door[i] = new Door();
		}
	}
}
