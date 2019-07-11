package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek11720 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		try {
			int n = Integer.parseInt(br.readLine());
			String[] arrStr = br.readLine().split("");
			for (int i = 0; i < arrStr.length; i++) {
				sum += Integer.parseInt(arrStr[i]);
			}
			System.out.println(sum);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
