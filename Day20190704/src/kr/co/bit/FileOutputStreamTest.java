package kr.co.bit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fo = null; //초기값 null
		String msg = "FileDoutputStreamTest"; //입력할 내용
		byte[] byteArray = msg.getBytes(); // 알파벳 하나당 1byte 바이트 배열방을 만들에서 바이트로 꺼냄
		try {
			fo = new FileOutputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\fileoutput.TXT",true); // 연결 (생성기능O)
			fo.write(byteArray); // 내용 입력
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fo.close(); //종료
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// 바이트기반 출력스트림의 최상위 클래스
// 특정 대상파일로 내용을 출력
// 지정한 경로에 파일이 없으면 자동으로 생성
// 디렉토리 자체가 없으면 FileNotFoundException 