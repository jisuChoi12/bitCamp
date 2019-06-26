package kr.co.bit.Jazzang;

import java.util.Scanner;

public class JazzangProcess {
	public Jazzang[] jazzang;
	public JazzangProcess() {
		jazzang = new Jazzang[3]; 
		jazzang[0] = new Jazzang("¥���", 7000, 2, 14000);
		jazzang[1] = new Jazzang("«��", 7500, 1, 7500);
		jazzang[2] = new Jazzang("������", 11000, 1, 11000);
	}
	public boolean sangpumProcess(String sangpumName) {
		boolean searchResult = false;
		for(int i=0; i<jazzang.length; i++) {
			if(jazzang[i].getSangpumName().equals(sangpumName)) {
				sangpumDisp(jazzang[i]);
				searchResult = true;
			}
		}return searchResult;
	}
	public void sangpumDisp(Jazzang jazzang) {
		System.out.println("��ǰ�̸�:"+jazzang.getSangpumName());
		System.out.println("��ǰ�ܰ�:"+jazzang.getSangpumDan());
		System.out.println("��ǰ����:"+jazzang.getSangpumSu());
		System.out.println("��ǰ����:"+jazzang.getSangpunMoney());
	}
}
