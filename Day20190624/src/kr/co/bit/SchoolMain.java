package kr.co.bit;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ManSchool manSchool = new ManSchool(90,80,70,60);
		WomanSchool womanSchool = new WomanSchool(90,80,70,60);
		ManGongupSchool manGongupSchool = new ManGongupSchool(90,80,70,60,50);
		WomanSangupSchool womanSangupSchool = new WomanSangupSchool(90,80,70,60,50);
		while(true) {//반복문			
			System.out.println("1.남자중학교 2.여자중학교 3.남자공업고등학교 4.여자상업고등학교");
			int protocol = input.nextInt();
			if(protocol==1) {
				System.out.println("남자중학교");
				System.out.println("국어:"+manSchool.getKor()+" 영어"+manSchool.getEng()+" 수학:"+manSchool.getMat()
				+" 기술:"+manSchool.getGisul()+" 총합:"+manSchool.total()+" 평균:"+manSchool.average());
//				System.out.println(manSchool.toString());
			}else if(protocol==2) {
				System.out.println("여자중학교");
				System.out.println("국어:"+womanSchool.getKor()+" 영어"+womanSchool.getEng()+" 수학:"+womanSchool.getMat()
				+" 가정:"+womanSchool.getGajong()+" 총합:"+womanSchool.total()+" 평균:"+womanSchool.average());
//				System.out.println(womanSchool.toString());
			}else if(protocol==3) {
				System.out.println("남자공업고등학교");
				System.out.println("국어:"+manGongupSchool.getKor()+" 영어"+manGongupSchool.getEng()+" 수학:"+manGongupSchool.getMat()
				+" 기술:"+manGongupSchool.getGisul()+" 공업: "+manGongupSchool.getGongup()+" 총합:"+manGongupSchool.total()+" 평균:"+manGongupSchool.average());
//				System.out.println(manGongupSchool.toString());
			}else if(protocol==4) {
				System.out.println("여자상업고등학교");
				System.out.println("국어:"+womanSangupSchool.getKor()+" 영어"+womanSangupSchool.getEng()+" 수학:"+womanSangupSchool.getMat()
				+" 가정:"+womanSangupSchool.getGajong()+" 상업: "+womanSangupSchool.getSangup()+" 총합:"+womanSangupSchool.total()+" 평균:"+womanSangupSchool.average());
//				System.out.println(womanSangupSchool.toString());
			}
		}//반복문
	}
}
