package kr.co.bit;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {

	public static void main(String[] args) {
		byte[] datas = new byte[] {10,20,30,40};
		ByteArrayInputStream bai = new ByteArrayInputStream(datas);
		int var_readbyte = -1; //�ʱⰪ�� -1
		while((var_readbyte=bai.read())!=-1) { // ����Ʈ �迭 ��ü���� �о���� �����Ͱ� ������ 
			System.out.print(var_readbyte + " "); // ���
		}
	}
}

// ByteArrayInputStream�� �޸𸮿� �����Ǿ� �ִ� ����Ʈ �迭 ��ü���� �����͸� �о���̴� ������ �ϴ� Ŭ������.
