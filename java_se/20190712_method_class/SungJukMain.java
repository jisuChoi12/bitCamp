/*
필드: name, kor, eng, math, tot, avg
입력: setData(name, kor, eng, math)
계산: calc()
출력: getName(), getKor(), getEng(), getMath(), getTot(), getAvg()

[실행결과]
이름		국어  영어  수학  총점	평균
aaa		95	 91	 100  xxx	xx.xx
*/

import java.util.Scanner;

class SungJuk{
	// 속성(데이터)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	// 기능(메소드)
	SungJuk(){
		name = null;
		kor = 0;
		eng = 0;
		math = 0;
		tot = 0;
		avg = 0;
	}
	public void setData(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	public int getTot(){
		return tot;
	}
	public double getAvg(){
		return avg;
	}
	public void calc(){
		tot = kor+eng+math;
		avg = (double)tot/3;
	}

	//어노테이션
	@Override
	public String toString(){
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f",avg);
	}
}

//----------------------------------------------------------------------
class SungJukMain {
	public static void main(String[] args) {

		SungJuk[] sJ = new SungJuk[3]; // 객체배열

		for(int i=0; i<sJ.length; i++){
			sJ[i] = new SungJuk();
		}

		sJ[0].setData("aaa",95,92,100);
		sJ[1].setData("bbb",85,82,63);
		sJ[2].setData("ccc",75,89,90);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJuk data : sJ){
			data.calc();
			System.out.println(data);
		}
	}
}

// 정수 %d
// 실수 %f
// 문자 %c
// 문자열 %s