package kr.co.bit.obj2;

import java.util.Scanner;

public class Array_Test5 {

	public static void main(String[] args) {
		String names[] = new String[] {"a","b","c","d","e"};
		Scanner input = new Scanner(System.in);
		int index=-1;
		do {
			System.out.println("�˻��� �̸��� �Է��ϼ���.");
			System.out.println("�̸�:");
			String name = input.next();
			for(int i=0; i<names.length; i++) {
				if(name.equals(names[i])) {
					index=i;
				}
			}
			if(index!=-1) {
				System.out.println(name+"�� �迭�� "+index+"�ε��� �濡�� ã�ҽ��ϴ�.");
				break;
			}
			System.out.println("�ش��ϴ� �̸��� �������� �ʽ��ϴ�.");
		}while(true);
	}
}

