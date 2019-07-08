package kr.co.bit;

import java.util.Scanner;

public class Baek2920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String asc = "1 2 3 4 5 6 7 8";
		String des = "8 7 6 5 4 3 2 1";
		
		String note = scan.nextLine();
		if(note.equals(asc)) {
			System.out.println("ascending");
		}
		else if(note.equals(des)) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}
