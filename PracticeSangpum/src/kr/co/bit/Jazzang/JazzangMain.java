package kr.co.bit.Jazzang;

import java.util.Scanner;

import javax.naming.directory.SearchResult;

public class JazzangMain {
	public static void main(String[] args) {
		JazzangProcess jp = new JazzangProcess();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("��ǰ�̸��� �Է��ϼ���.");
			String sangpumName = input.next();
			boolean searchResult = jp.sangpumProcess(sangpumName);
			if(searchResult) {
				break;
			}else {
				System.out.println("�ش� ��ǰ�� �����ϴ�.");
			}
		}while(true);
	}
}
