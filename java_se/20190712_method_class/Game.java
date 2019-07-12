/* 
가위 바위 보 게임
1: 가위 2: 바위 3: 보자기
컴표터가 1-3 사이의 난수를 발생한다.
기본 금액은 10,000원을 제공한다
금액이 0원이거나 마이너스이면 금액을 다시 입력
[실행결과]
가위,바위,보(1-3) : 1 (System.in.read() 사용)
배팅 금액: 3000
Enter를 치세요...
컴퓨터 : 바위(2), 나 : 가위(1)
졌다
가진 돈: 7000
Insert coin(y/n): y/n
프로그램 종료...
얼마를 충전할까요?
*/

import java.util.Scanner;

class Game {
	public static void main(String[] args) throws java.io.IOException {
		String[] str = {"가위","바위","보"};
		Scanner scan = new Scanner(System.in);
		int mny = 10000;
		int my = 0;
		int com = 0;
		int deal = 0;
		
		while(true){
			while(true){
				deal = 0;
				System.out.println("1:가위 2:바위 3:보");
				my = System.in.read()-'0'; // '0' (48) read()는 정수x 문자o
				System.in.read();
				System.in.read();
				do{
					System.out.print("배팅 금액: ");
					deal = scan.nextInt();
					if(deal<mny && deal!=0) break;
				}while(deal>mny || deal==0);
				System.out.println("ENTER를 입력해주세요... :]");
				System.in.read(); // \r
				System.in.read(); // \n
				com = (int)(Math.random()*3)+1;
				
				System.out.print("컴퓨터:"+str[com-1]+" | "+"나:"+str[my-1]+" ... ");

				if(my==com){ //가위-가위 바위-바위 보-보
					System.out.println("비겼다 :P");
				}
				else if(my>com || (my==1 && com==3)){ // 보-바위 바위-가위 || 가위-보
					System.out.println("이겼다 :D");
					mny += deal;
				}
				else{ // 가위-바위 바위-보 보-가위 
					System.out.println("졌다 :/");
					mny -= deal;
				}

				System.out.println("가진 돈: "+mny);
				System.out.println();

				if(mny<=0) break;
			}
			System.out.print("INSERT COIN (y/n): ");
			String more = scan.next();
			if(more.equalsIgnoreCase("y")){
				System.out.print("얼마를 충전할까요?: ");
					mny = scan.nextInt();
				}
			if(more.equalsIgnoreCase("n")){
				System.out.println("게임을 종료합니다... :)");
				break;
			}
		}
	}
}


/*
				if(my==1){ //가위 
					if(com==1){
						System.out.println("컴퓨터:가위 | 나:가위... 비겼다 :|");
					}
					else if(com==2){
						System.out.println("컴퓨터:바위 | 나:가위... 졌다 :(");
						mny -= deal;
					}
					else if(com==3){
						System.out.println("컴퓨터:보 | 나:가위... 이겼다 :D");
						mny += deal;
					}
				}
				else if(my==2){ //바위
					if(com==1){
						System.out.println("컴퓨터:가위 | 나:바위... 이겼다 :D");
						mny += deal;
					}
					else if(com==2){
						System.out.println("컴퓨터:바위 | 나:바위... 비겼다 :|");
					}
					else if(com==3){
						System.out.println("컴퓨터:보 | 나:바위... 졌다 :(");
						mny -= deal;
					}
					
				}
				else if(my==3){ //보
					if(com==1){
						System.out.println("컴퓨터:가위 | 나:보자기... 졌다 :(");
						mny -= deal;
					}
					else if(com==2){
						System.out.println("컴퓨터:바위 | 나:보자기... 이겼다 :D");
						mny += deal;
					}
					else if(com==3){
						System.out.println("컴퓨터:보자기 | 나:보자기... 비겼다 :|");
					}
				}
				*/