package kr.co.bit.china;

import java.util.Scanner;

public class ChinaMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SeongnamChina seongnam = new SeongnamChina(3000,5000,6000,20000); //�ʱ�ȭ(������ �ȿ� ���� �ٷ� �Է�)
		SeoulChina seoul = new SeoulChina(5000,6000,10000,18000);
		int protocol;
		while(true) {
			System.out.println("1.�����߱��� 2.�����߱���");
			protocol = input.nextInt();
			if(protocol==1) {
				System.out.println("�����߱��� ����");
//				seoul.setJajang(3000); 
//				seoul.setJjam(5000);
//				seoul.setTang(6000);
//				seoul.setJaengban(20000);
				System.out.println("�����:"+seoul.getJajang()+" «��:"+seoul.getJjam()
				+" ������:"+seoul.getTang()+" ���¥��:"+seoul.getJaengban());
//				System.out.println(seoul.toString());
			}else if(protocol==2){
				System.out.println("�����߱��� ����");
//				seongnam.setJajang(5000); ����(set�Լ��� �Ἥ ���� �Է�)
//				seongnam.setJjam(6000);
//				seongnam.setTang(10000);
//				seongnam.setSamsun(18000);
				System.out.println("�����:"+seongnam.getJajang()+" «��:"+seongnam.getJjam()
				+" ������:"+seongnam.getTang()+" �Ｑ«��:"+seongnam.getSamsun());
//				System.out.println(seongnam.toString());
			}
		}// �ݺ���
	}
}