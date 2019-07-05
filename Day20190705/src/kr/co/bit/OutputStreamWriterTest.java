package kr.co.bit;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		OutputStreamWriter osw= null;
		BufferedWriter bfw = null;
		try {
			fos = new FileOutputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\outputStreamWriter.txt");
			osw = new OutputStreamWriter(fos);
			bfw = new BufferedWriter(osw);
			bfw.write("OutPutStreamWriter 上上");
			bfw.newLine();
			bfw.write("OutPutStreamWriter 上上");
			bfw.newLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bfw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
