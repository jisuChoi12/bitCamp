package kr.co.bit;

import java.util.Scanner;

public class JazzangProcess {
	//�迭����
	public Jazzang[] jazzang;
	//�������Լ�
	public JazzangProcess() {
		//�迭�����
		jazzang = new Jazzang[3]; 
		//�ʱ�ȭ
		jazzang[0] = new Jazzang("¥���", 7000, 2, 14000);
		jazzang[1] = new Jazzang("«��", 7500, 1, 7500);
		jazzang[2] = new Jazzang("������", 11000, 1, 11000);
	}
	//
	public boolean sangpumProcess(String sangpumName) { //5
		// boolean���� �ʱⰪ false
		boolean searchResult = false; //6
		// �迭 ��ü
		for(int i=0; i<jazzang.length; i++) { //7
			//[i]��° �迭�濡 �ִ� ��ǰ�̸��� �Է¹��� ��ǰ�̸��� ������
			if(jazzang[i].getSangpumName().equals(sangpumName)) { //8
				sangpumDisp(jazzang[i]);
				// ã�����ϱ� true
				searchResult = true;
			}
		}return searchResult;
	}
	//
	private void sangpumDisp(Jazzang jazzang) { //9
		System.out.println("��ǰ�̸�:"+jazzang.getSangpumName());
		System.out.println("��ǰ�ܰ�:"+jazzang.getSangpumDan());
		System.out.println("��ǰ����:"+jazzang.getSangpumSu());
		System.out.println("��ǰ����:"+jazzang.getSangpunMoney());
	}
}
