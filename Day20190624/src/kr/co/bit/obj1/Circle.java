package kr.co.bit.obj1;

public class Circle {
	public Point point;
	// 생성자 함수 안에 "부분"의 객체생성
	public Circle() {
		point = new Point();
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.point.x=10;
		circle.point.y=20;
		System.out.println(circle.point.x); //포함관계의 대표적인 특징 ㅇㅇ.ㅇㅇ.ㅇㅇ 점으로 이어짐
		System.out.println(circle.point.y);
	}
}
