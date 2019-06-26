package kr.co.bit;

public class While_Test3 {
	public static void main(String[] args) {
		int danNum=Integer.parseInt(args[0]);
		if(danNum>=2 && danNum<=9) {
			int num=1;
			int result=0;
			while(num<=9) {
				result=danNum*num;
				System.out.println(danNum+"*"+num+"="+result);
				num++;
			}
		}
		else {
			System.out.println("단값이 잘못되었습니다.");
		}
	}
}
