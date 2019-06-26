package kr.co.bit;

public class While_Test5 {

	public static void main(String[] args) {
		
		// for문을 사용해서 2단부터 9단까지 
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+"x"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}
