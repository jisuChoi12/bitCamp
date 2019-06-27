package kr.co.bit;

abstract class Vehicle {
	abstract void move();
}
class Car extends Vehicle{
	@Override
	void move() {
		System.out.println("������ �ٴѴ�.");
	}
}
class Plane extends Vehicle{
	@Override
	void move() {
		System.out.println("�ϴ÷� �ٴѴ�.");
	}
}
class Ship extends Vehicle{
	@Override
	void move() {
		System.out.println("���η� �ٴѴ�.");
	}
}
class VehicleUse{
	void getMoveStyle(Vehicle vehicle) { //�ֻ���Ŭ������ �Ķ���ͷ� ����
		vehicle.move(); //ȣ��
	}
}
public class AbstractTest3{
	public static void main(String[] args) {
		Car car = new Car();
		Plane plane = new Plane();
		Ship ship = new Ship();
		VehicleUse vUes = new VehicleUse();
		vUes.getMoveStyle(car);
		vUes.getMoveStyle(ship);
		vUes.getMoveStyle(plane);
		
	}
}