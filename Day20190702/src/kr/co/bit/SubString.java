package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("����|���� �Է�");
			String titleContent = br.readLine();
			int indexI = titleContent.indexOf("|");
			String title = titleContent.substring(0, indexI);
			String content = titleContent.substring(indexI+1);
			System.out.println("title:"+title);
			System.out.println("content:"+content);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e1) {
			System.out.println("'|'�� �־� ���Ŀ� �°� �Է��ϼ���.");
		}
	}
}

