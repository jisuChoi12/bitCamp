/*
주차관리 프로그램
주차되어있으면 true 주차안되어있으면 false
[실행결과]
**************
	1.입차
	2.출차
	3.리스트 보기
	4.끝
**************
번호:4
프로그램을 종료합니다

번호:1
위치 입력:3 true /false
이미 주차되어 있습니다
3번 위치 입차

번호:2
위치 입력:3
주차되어 있는 차가 없습니다
3번 위치 출차

입력:3
1위치: true
2위치: false
1위치: true
1위치: true
1위치: true

*/
import java.util.Scanner;

class Car {
	public static void main(String[] args) {
		int location = 0;
		boolean[] ar = new boolean[5];
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("**************");
			System.out.println("1:입차 2:출차 3:리스트 4:끝");
			System.out.println("**************");
			int select = scan.nextInt();
			if(select==1){ //입차
				System.out.println("몇 번 자리에 주차하시겠습니까? ");
				location = scan.nextInt();
				if(ar[location-1]){
					System.out.println("해당 자리에는 이미 주차된 차량이 있습니다.");
				} 
				else {
					ar[location-1] = true;
					System.out.println(location+"번 자리에 주차 완료!");
				}
			}
			else if(select==2){ //출차
				System.out.println("몇 번 자리에서 출차 하시겠습니까?");
				location = scan.nextInt();
				if(ar[location-1]) {
					ar[location-1] = false;
					System.out.println(location+"번 자리에서 출차 완료!");
				}
				else{
					System.out.println("해당 자리에는 주차된 차량이 없습니다.");
				}
			}
			else if(select==3){ //리스트
				for(int i=0; i<ar.length; i++){
					System.out.println((i+1)+"번 자리: "+ar[i]);
				}
			}
			else if(select==4){ //끝
				System.out.println("종료합니다...");
				break;
			}
		}
	}
}
