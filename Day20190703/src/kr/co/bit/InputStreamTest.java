package kr.co.bit;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		int var_byte = -1; //�ʱⰪ�� -1
		System.out.println("���ڸ� �ϳ� �Է��ϼ���.");
		do {
			try {
				var_byte = System.in.read(); //���ڸ� �о����
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(var_byte==10 || var_byte==13) continue; // ���� �����Ͱ� ������ ���
			if(var_byte==-1) break; // (ctrl+z) 
			System.out.println("������:"+(char)var_byte); // ���� �����͸� ����ȯ�ؼ� ���
		}while(true);
	}
}
