package kr.co.bit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fo = null; //�ʱⰪ null
		String msg = "FileDoutputStreamTest"; //�Է��� ����
		byte[] byteArray = msg.getBytes(); // ���ĺ� �ϳ��� 1byte ����Ʈ �迭���� ���鿡�� ����Ʈ�� ����
		try {
			fo = new FileOutputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\fileoutput.TXT",true); // ���� (�������O)
			fo.write(byteArray); // ���� �Է�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fo.close(); //����
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// ����Ʈ��� ��½�Ʈ���� �ֻ��� Ŭ����
// Ư�� ������Ϸ� ������ ���
// ������ ��ο� ������ ������ �ڵ����� ����
// ���丮 ��ü�� ������ FileNotFoundException 