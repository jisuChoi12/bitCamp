package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2675 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int t = Integer.parseInt(br.readLine());
			for (int i = 0; i < t; i++) {
				String[] str = br.readLine().split(" ");
				String[] alphanumeric = str[1].split("");
				for (int j = 0; j < alphanumeric.length; j++) {
					for (int j2 = 0; j2 < Integer.parseInt(str[0]); j2++) {
						System.out.print(alphanumeric[j]);											
					}
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}