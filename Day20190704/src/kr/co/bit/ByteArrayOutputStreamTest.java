package kr.co.bit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		String msg = "ByteArrayOutputStreamTest"; //내용
		ByteArrayOutputStream bao = null; //초기값
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

// getBytes()메소드를 이용해 mgs에 저장된 문자를 하나씩 꺼내와 bao에 넣고
// ByteArrayOutputStream로 메모리에 배열로 저장된 데이터를 출력