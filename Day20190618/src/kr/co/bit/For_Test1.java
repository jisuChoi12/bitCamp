package kr.co.bit;
// for loop
public class For_Test1 {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		for(int i=0; i<10; i++) {
			num++; // num=num+1;
			sum+=num; // sum=sum+num;
		}
		System.out.println("증가:"+num+" 합계:"+sum);
	}
}
