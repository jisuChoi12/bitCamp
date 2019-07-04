package kr.co.bit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		String msg = "ByteArrayOutputStreamTest"; //����
		ByteArrayOutputStream bao = null; //�ʱⰪ
		try {
			bao = new ByteArrayOutputStream();
			bao.write(msg.getBytes());
			System.out.println("bao:"+bao);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// getBytes()�޼ҵ带 �̿��� mgs�� ����� ���ڸ� �ϳ��� ������ bao�� �ְ�
// ByteArrayOutputStream�� �޸𸮿� �迭�� ����� �����͸� ���