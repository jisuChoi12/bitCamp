package kr.co.bit;

public class Time {
	int hour;
	int min;
	int sec;
	
	public int set() {
		int lv=0;
		System.out.println("출력");
		return 1; //호출했던 함수의 원 위치로 돌아간다
	}
	
	public int add(int x, int y, String opt) {
		int result=0;
		if(opt.equals("+")) {
			result=x+y;
		}
		return result;
	}	
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Time time = new Time();
		time.hour=8;
		time.min=30;
		time.sec=23;
		time.set();
		String opt= "+";
//		int result = time.add(10, 20);
		int result = time.add(10, 20, opt);
		System.out.println(time.hour+"시 "+time.min+"분 "+time.sec+"초");
		System.out.println("결과:"+result);
	}
}
