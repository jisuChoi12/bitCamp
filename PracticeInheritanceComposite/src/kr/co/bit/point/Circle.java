package kr.co.bit.point;

public class Circle {
	public Point point; //포함할 부분클래스 선언
	public Circle() {
		point = new Point(); //생성자 함수 안에 부분클래스 객체생성
	}
	public static void main(String[] args) {//main
		Circle circle = new Circle(); //객체생성
		circle.point.x=10; //포함관계의 대표적인 특징 전체클래스.부분클래스.부분클래스의변수 형태로 호출
		circle.point.y=20; 
		System.out.println(circle.point.x); 
		System.out.println(circle.point.y);
	}
}
