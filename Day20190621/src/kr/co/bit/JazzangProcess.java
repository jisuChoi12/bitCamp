package kr.co.bit;

import java.util.Scanner;

public class JazzangProcess {
	//배열선언
	public Jazzang[] jazzang;
	//생성자함수
	public JazzangProcess() {
		//배열만들기
		jazzang = new Jazzang[3]; 
		//초기화
		jazzang[0] = new Jazzang("짜장면", 7000, 2, 14000);
		jazzang[1] = new Jazzang("짬뽕", 7500, 1, 7500);
		jazzang[2] = new Jazzang("탕수육", 11000, 1, 11000);
	}
	//
	public boolean sangpumProcess(String sangpumName) { //5
		// boolean에는 초기값 false
		boolean searchResult = false; //6
		// 배열 전체
		for(int i=0; i<jazzang.length; i++) { //7
			//[i]번째 배열방에 있는 상품이름이 입력받은 상품이름과 같으면
			if(jazzang[i].getSangpumName().equals(sangpumName)) { //8
				sangpumDisp(jazzang[i]);
				// 찾았으니까 true
				searchResult = true;
			}
		}return searchResult;
	}
	//
	private void sangpumDisp(Jazzang jazzang) { //9
		System.out.println("상품이름:"+jazzang.getSangpumName());
		System.out.println("상품단가:"+jazzang.getSangpumDan());
		System.out.println("상품수량:"+jazzang.getSangpumSu());
		System.out.println("상품가격:"+jazzang.getSangpunMoney());
	}
}
