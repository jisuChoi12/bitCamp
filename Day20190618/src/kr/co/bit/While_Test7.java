package kr.co.bit;

public class While_Test7 {

	public static void main(String[] args) {
		int num=0;
		char c='A';
		aaa:while(true) {
			while(true) {
				num++;
				System.out.print(c++ +"");
				if(num%5==0) {
					break;
				}
				if(num==26) {
					break aaa;
				}
			}
			System.out.println();
		}

	}
}

