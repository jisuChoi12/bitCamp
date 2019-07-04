package kr.co.bit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadAddress {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\address");
			isr = new InputStreamReader(fis);
			bfr = new BufferedReader(isr);
			String str = null;
			while((str=bfr.readLine())!=null) {
				st = new StringTokenizer(str, ",");
				System.out.print("이름:"+st.nextToken()+" "+"주소:"+st.nextToken()+" "+"이메일:"+st.nextToken()+" "+"전화번호:"+st.nextToken()+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bfr.close();
				isr.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
