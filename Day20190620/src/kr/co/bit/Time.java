package kr.co.bit;

public class Time {
	int hour;
	int min;
	int sec;
	
	public int set() {
		int lv=0;
		System.out.println("���");
		return 1; //ȣ���ߴ� �Լ��� �� ��ġ�� ���ư���
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
		System.out.println(time.hour+"�� "+time.min+"�� "+time.sec+"��");
		System.out.println("���:"+result);
	}
}
