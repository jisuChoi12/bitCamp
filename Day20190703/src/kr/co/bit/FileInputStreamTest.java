package kr.co.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fin = null; //초기값은 null
		try {
			fin = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190703\\src\\kr\\co\\bit\\test.TXT"); //txt파일의 경로
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int var_read = -1; //초기값은 -1
		try {
			while((var_read=fin.read())!=-1) { // 읽어 올 데이터가 있으면(-1이 아닐때) 
				System.out.print((char)var_read); // char로 형변환 하고 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close(); // 마지막에는 항상 종료해야 하니까 finally
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// File 클래스는 자바 파일이나 디렉토리를 다룰 수 있도록 제공해주는 클래스다.
// 바이트 기반 입력 스트림의 최상위 클래스는 InputStream
// 바이트 기반 출력 스트림의 최상위 클래스는 OutputStream

