package kr.co.bit;

public class For_Test5 {
	public static void main(String[] args) {
		/*for(int i=0; i<5; i++) { //x축(행)
			for(int j=0; j<=i;j++) { //y축(열)
				System.out.print("*");
			}
			System.out.println();*/
		for(int outer=1; outer<=3; outer++) {
			for(int inner=1; inner<=3; inner++) {
				System.out.println("outer="+outer+", inner="+inner);
			}
		
		}
	}
}
