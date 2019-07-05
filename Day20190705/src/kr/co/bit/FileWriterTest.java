package kr.co.bit;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "FileWriter ¾å¾å";
		try {
			fw = new FileWriter("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\fileWriter.TXT", true);
			fw.write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
