package kr.co.bit;

public class Array_Test7 {
// 외각은 1 안은 0으로 채우기
	public static void main(String[] args) {
		int[][] recArray = new int[5][5]; //5행5열인 Array 생성. 초기값은 언제나 default값인 0
		for(int i=0; i<recArray.length; i++) {
			for(int j=0; j<recArray[i].length; j++) {
				if(i==0 || i==recArray.length-1||j==0||j==recArray[i].length-1) {
					recArray[i][j]=1;		
				}
			}
		}
		for(int i=0; i<recArray.length; i++) {
			for(int j=0; j<recArray[i].length; j++) {
				System.out.print(recArray[i][j]+"");
			}
			System.out.println();
		}
	}
}
