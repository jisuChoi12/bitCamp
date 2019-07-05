package kr.co.bit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// bufferedWriterŬ�������� flush()�޼ҵ带 ȣ������ �ʾ����� ���

public class BufferedWriterTest1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\bufferedWriter1.TXT", true);
			bw = new BufferedWriter(fw, 4);
			bw.write('A');		
			bw.write('B');		
			bw.write('C');		
			bw.write('D');
			bw.write('E');
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// ���ۻ�����:n 
// �Է�<n && close()ȣ��O -> ���O
// �Է�<n && close()ȣ��X -> ���X
// �Է�>=n && close()ȣ��O -> ���O
// �Է�>=n && close()ȣ��X -> ���O

// flush ����� �����Ǿ� �ֱ� ������ ������Ʋ�� ���������� ������� ��µȴ�.
// ���ۻ������ �����͸� �� ���� ����ϸ� flush ���� �ʾƵ� �ڵ����� flushó���� �Ǹ鼭
// ��½�Ʈ���� ��µ� ������� ������� ��µ����� ���۾ȿ� ���ۻ���� �ʰ����� �ʴ� �����Ͱ�
// �� ������ ���� �ȿ� ��µǾ� �ִ� ������� �ڵ� flush���� �ʴ´�. -> close() Ȥ�� flush() ȣ���ʿ�