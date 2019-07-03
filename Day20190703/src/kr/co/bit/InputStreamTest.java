package kr.co.bit;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		int var_byte = -1; //초기값은 -1
		System.out.println("문자를 하나 입력하세요.");
		do {
			try {
				var_byte = System.in.read(); //문자를 읽어들임
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(var_byte==10 || var_byte==13) continue; // 받은 데이터가 있으면 계속
			if(var_byte==-1) break; // (ctrl+z) 
			System.out.println("읽은값:"+(char)var_byte); // 받은 데이터를 형변환해서 출력
		}while(true);
	}
}
