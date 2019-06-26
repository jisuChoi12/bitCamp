package kr.co.bit.obj1;

public class Point3D extends Point2D {
	protected int z;
	
	public Point3D() { //매개변수 없는 생성자... super();로 부모클래스에 있는 생성자 함수 재사용
		super();
	}
	public Point3D(int x, int y, int z) { //매개변수 있는 생성자... 부모클래스에 있는 생성자 함수 재사용 + 해당 클래스 안에 있는 변수 초기화
		super(x,y);
		this.z=z;
	}
	@Override
	public String toString() {
		return super.toString()+" Point3D [z=" + z + "]"; // 부모 클래스의 toString함수 재사용
	}
	public static void main(String[] args) { // main
		Point3D point3d = new Point3D(); //객체생성
		point3d.x=10; // 상속받은 변수에 값 입력
		point3d.y=20;
		point3d.z=30;
		System.out.println(point3d.toString()); // 해당 클래스의 toString함수 사용
	}
}

