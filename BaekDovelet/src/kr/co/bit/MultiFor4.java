package kr.co.bit;

import java.util.Scanner;

class MultiFor4 {
	public static void main(String[] args) {

		int result = 0;
		int m = 2;
		
		for (int n = 0; n < 3; n++) {
			for (int j = 1; j < 10; j++) {
				for (int i = m; i <= m+2; i++) {
					if(i==10) break;
					System.out.print(i + "*" + j + "=" + i*j + "\t");
				}
				System.out.println();
			}
			m+=3;
			System.out.println();
		}

//		int cnt = 0;
//		for (int j = 1; j <= 3; j++) {
//			for (int i = 1; i < 10; i++) {
//				for (int dan = 2; dan < 5; dan++) {
//					if(((dan+(j-1)*3)==10)) break;
//					System.out.print((dan+(j-1)*3) + "*" + (i) + "=" + ((dan+(j-1)*3)*i) + "\t");
//					cnt++;
//					if (cnt == 3) {
//						cnt = 0;
//						break;
//					}
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
	}
}
