package kr.co.bit;
//상속과 포함 모두 사용 
public class Triangle extends Point2D {
	protected Point2D[] point; // 삼각형은 점이 세개가 필요하니까 점 두개를 받아올땐 배열로
	public Triangle(Point2D[] p) {
		this.point=p;
	}
}
