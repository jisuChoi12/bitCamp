package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10950 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int t = Integer.parseInt(br.readLine());
			int[] arr = new int[t];
			for (int i = 0; i < arr.length; i++) {
				String ab = br.readLine();
				int spacebar = ab.indexOf(" ");
				int a = Integer.parseInt(ab.substring(0,spacebar));
				int b = Integer.parseInt(ab.substring(spacebar+1));
				arr[i] = a+b;
			}
			for (int i : arr) {
				System.out.println(i);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
