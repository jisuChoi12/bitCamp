/*
객체배열
필드: x y sum sub mul div
메소드: 기본생성자에서 x y 값은 입력 받는다
	  calc() 합 차 곱 몫을 셰산
	  getX()
	  getY()
	  getSum()
	  getSub()
	  getMul()
	  getDiv()

[실행결과]
x : 250
y : 360

x : 128
y : 109

x : 357
y : 456

x		y		sum		sub		mul		div		
250		360	
128		109
357		456

*/

//import java.util.Scanner;

class Compute{
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;

	Compute(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getSum(){
		return sum;
	}
	public int getSub(){
		return sub;
	}
	public int getMul(){
		return mul;
	}
	public double getDiv(){
		return div;
	}
	public void calc(){
		sum = x+y;
		sub = x-y;
		mul = x*y;
		div = (double)x/y; 
	}
	@Override
	public String toString(){
		return getX()+"\t"+getY()+"\t"+getSum()+"\t"+getSub()+"\t"+getMul()+"\t"+String.format("%.2f",getDiv());
	}
}

//-------------------------------------------------------------
class ComputeMain {
	public static void main(String[] args) {
		/*
		Compute[] c = new Compute[3]; //객체배열
		c[0] = new Compute(250,360);
		c[1] = new Compute(127,109);
		c[2] = new Compute(357,456);
		*/

		//Compute[] c = new Compute[]{new Compute(250,360), new Compute(127,109), new Compute(357,456)};

		Compute[] c = {new Compute(250,360), new Compute(127,109), new Compute(357,456)};

		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");

		for(Compute data : c){
			data.calc();
			System.out.println(data);
		}
	}
}

