package kr.co.bit;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ManSchool manSchool = new ManSchool(90,80,70,60);
		WomanSchool womanSchool = new WomanSchool(90,80,70,60);
		ManGongupSchool manGongupSchool = new ManGongupSchool(90,80,70,60,50);
		WomanSangupSchool womanSangupSchool = new WomanSangupSchool(90,80,70,60,50);
		while(true) {//�ݺ���			
			System.out.println("1.�������б� 2.�������б� 3.���ڰ�������б� 4.���ڻ������б�");
			int protocol = input.nextInt();
			if(protocol==1) {
				System.out.println("�������б�");
				System.out.println("����:"+manSchool.getKor()+" ����"+manSchool.getEng()+" ����:"+manSchool.getMat()
				+" ���:"+manSchool.getGisul()+" ����:"+manSchool.total()+" ���:"+manSchool.average());
//				System.out.println(manSchool.toString());
			}else if(protocol==2) {
				System.out.println("�������б�");
				System.out.println("����:"+womanSchool.getKor()+" ����"+womanSchool.getEng()+" ����:"+womanSchool.getMat()
				+" ����:"+womanSchool.getGajong()+" ����:"+womanSchool.total()+" ���:"+womanSchool.average());
//				System.out.println(womanSchool.toString());
			}else if(protocol==3) {
				System.out.println("���ڰ�������б�");
				System.out.println("����:"+manGongupSchool.getKor()+" ����"+manGongupSchool.getEng()+" ����:"+manGongupSchool.getMat()
				+" ���:"+manGongupSchool.getGisul()+" ����: "+manGongupSchool.getGongup()+" ����:"+manGongupSchool.total()+" ���:"+manGongupSchool.average());
//				System.out.println(manGongupSchool.toString());
			}else if(protocol==4) {
				System.out.println("���ڻ������б�");
				System.out.println("����:"+womanSangupSchool.getKor()+" ����"+womanSangupSchool.getEng()+" ����:"+womanSangupSchool.getMat()
				+" ����:"+womanSangupSchool.getGajong()+" ���: "+womanSangupSchool.getSangup()+" ����:"+womanSangupSchool.total()+" ���:"+womanSangupSchool.average());
//				System.out.println(womanSangupSchool.toString());
			}
		}//�ݺ���
	}
}
