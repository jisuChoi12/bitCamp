package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1152 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] strArr = str.split(" ");
			if(str.isEmpty() || str.length()==1 && str.startsWith(" ")) {
				System.out.println(0);
			}
			else {
				if(str.startsWith(" ")) {
					System.out.println(strArr.length-1);
				}
				else {
					System.out.println(strArr.length);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
