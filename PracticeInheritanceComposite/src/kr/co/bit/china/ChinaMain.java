package kr.co.bit.china;

import java.util.Scanner;

public class ChinaMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SeongnamChina seongnam = new SeongnamChina(3000,5000,6000,20000); //초기화(생성자 안에 값을 바로 입력)
		SeoulChina seoul = new SeoulChina(5000,6000,10000,18000);
		int protocol;
		while(true) {
			System.out.println("1.서울중국집 2.성남중국집");
			protocol = input.nextInt();
			if(protocol==1) {
				System.out.println("서울중국집 선택");
//				seoul.setJajang(3000); 
//				seoul.setJjam(5000);
//				seoul.setTang(6000);
//				seoul.setJaengban(20000);
				System.out.println("자장면:"+seoul.getJajang()+" 짬뽕:"+seoul.getJjam()
				+" 탕수육:"+seoul.getTang()+" 쟁반짜장:"+seoul.getJaengban());
//				System.out.println(seoul.toString());
			}else if(protocol==2){
				System.out.println("성남중국집 선택");
//				seongnam.setJajang(5000); 대입(set함수를 써서 값을 입력)
//				seongnam.setJjam(6000);
//				seongnam.setTang(10000);
//				seongnam.setSamsun(18000);
				System.out.println("자장면:"+seongnam.getJajang()+" 짬뽕:"+seongnam.getJjam()
				+" 탕수육:"+seongnam.getTang()+" 삼선짬뽕:"+seongnam.getSamsun());
//				System.out.println(seongnam.toString());
			}
		}// 반복문
	}
}