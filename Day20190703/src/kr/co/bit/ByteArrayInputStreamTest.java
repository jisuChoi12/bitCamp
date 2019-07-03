package kr.co.bit;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {

	public static void main(String[] args) {
		byte[] datas = new byte[] {10,20,30,40};
		ByteArrayInputStream bai = new ByteArrayInputStream(datas);
		int var_readbyte = -1; //초기값은 -1
		while((var_readbyte=bai.read())!=-1) { // 바이트 배열 객체에서 읽어들일 데이터가 있으면 
			System.out.print(var_readbyte + " "); // 출력
		}
	}
}

// ByteArrayInputStream은 메모리에 생성되어 있는 바이트 배열 객체에서 데이터를 읽어들이는 역할을 하는 클래스다.
