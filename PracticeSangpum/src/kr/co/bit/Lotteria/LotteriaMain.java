package kr.co.bit.Lotteria;

import java.util.Scanner;

public class LotteriaMain {

	public static void main(String[] args) {
		LotteriaProcess lp = new LotteriaProcess();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("��ǰ �̸��� �Է��ϼ���");
			String sangpumName = input.next();
			boolean searchResult = lp.sangpumProcess(sangpumName);
			if(searchResult) {
				break;
			}else {
				System.out.println("ã�� ��ǰ�� �����ϴ�.");
			}
		}while(true);
	}
}
