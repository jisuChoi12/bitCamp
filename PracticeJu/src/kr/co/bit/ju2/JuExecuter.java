package kr.co.bit.ju2;

import java.util.Scanner;

public class JuExecuter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true){// 반복문
			Ju.juSelect();
			if(Ju.juSelect().equals("yes")||Ju.juSelect().equals("YES")){
				Ju.juDisp();
				int menu = Ju.menuSelect();
		
				if(menu==1) {
					Ju.menuDisp();
					String gob = Ju.gobSelect();
					if(gob.equals("yes")||gob.equals("YES")) {
						Ju.gobDisp();
					}
					else {
						Ju.gobDisp();
					}
				}
				if(menu==2) {
					Ju.menuDisp();
					String gob = Ju.gobSelect();
					if(gob.equals("yes")||gob.equals("YES")) {
						Ju.gobDisp();
					}
					else {
						Ju.gobDisp();
					}
				}
				
				if(menu==3) {
					Ju.menuDisp();
					int tang = Ju.tangSelect();
					if(tang==1) {
						Ju.tangDisp();
					}
					if(tang==2) {
						Ju.tangDisp();
					}if(tang==3) {
						Ju.tangDisp();
					}
				}
			}else {
				Ju.juDisp();
				break;
			}
		}// 반복문
	}
	
}
