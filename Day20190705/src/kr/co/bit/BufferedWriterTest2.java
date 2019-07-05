package kr.co.bit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest2 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\bufferedWriter2.TXT");
			bw = new BufferedWriter(fw,4);
			bw.write("������ ���: ����1");
			bw.newLine();
			bw.write("������ ���: ����2");
			bw.newLine();
			bw.write("������ ���: ����3");
			bw.newLine();
			bw.write("������ ���: ����4");
			bw.newLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
