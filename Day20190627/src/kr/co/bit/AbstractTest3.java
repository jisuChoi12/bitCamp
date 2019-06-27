package kr.co.bit;

abstract class Vehicle {
	abstract void move();
}
class Car extends Vehicle{
	@Override
	void move() {
		System.out.println("차도로 다닌다.");
	}
}
class Plane extends Vehicle{
	@Override
	void move() {
		System.out.println("하늘로 다닌다.");
	}
}
class Ship extends Vehicle{
	@Override
	void move() {
		System.out.println("수로로 다닌다.");
	}
}
class VehicleUse{
	void getMoveStyle(Vehicle vehicle) { //최상위클래스를 파라미터로 던짐
		vehicle.move(); //호출
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