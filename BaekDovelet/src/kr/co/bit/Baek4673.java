package kr.co.bit;

public class Baek4673 {
	
	static int[] d = new int[10036]; // 9999ÀÏ¶§ 10036
	
	public static int dn(int i) {
		int res = i;
		if (res>=10000) { // 10000,10001,10002,,,
			res = res+(res/10000)+(res%10000/1000)+(res%1000/100)+(res%100/10)+(res%10);
		}
		if (res>=1000 && res<10000) { // 1000,1001,1002,,,9999
			res = res+(res/1000)+(res%1000/100)+(res%100/10)+(res%10);
		}
		if (res>=100 && res<1000) { // 100,101,102,,999
			res = res+(res/100)+(res%100/10)+(res%10);
		}
		if (res>=10 && res<100) { // 10,11,12,,99
			res = res+(res/10)+(res%10);
		}
		if (res>0 && res<10) { // 1,2,,,,9
			res = res+(res%10);
		}
		return res;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			d[dn(i)] = 1;
			if(d[i]!=1) {
				System.out.println(i);
			}
			
		}	
	}
}
