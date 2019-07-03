package kr.co.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fin = null; //�ʱⰪ�� null
		try {
			fin = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190703\\src\\kr\\co\\bit\\test.TXT"); //txt������ ���
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int var_read = -1; //�ʱⰪ�� -1
		try {
			while((var_read=fin.read())!=-1) { // �о� �� �����Ͱ� ������(-1�� �ƴҶ�) 
				System.out.print((char)var_read); // char�� ����ȯ �ϰ� ���
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close(); // ���������� �׻� �����ؾ� �ϴϱ� finally
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// File Ŭ������ �ڹ� �����̳� ���丮�� �ٷ� �� �ֵ��� �������ִ� Ŭ������.
// ����Ʈ ��� �Է� ��Ʈ���� �ֻ��� Ŭ������ InputStream
// ����Ʈ ��� ��� ��Ʈ���� �ֻ��� Ŭ������ OutputStream

