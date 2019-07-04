package kr.co.bit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			fis = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\bufferedReaderTest.TXT");
			isr = new InputStreamReader(fis);
			bfr = new BufferedReader(isr);
			String str = null;
			while((str=bfr.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bfr.close();
				isr.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
