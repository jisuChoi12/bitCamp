package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10809 {

	static int findChar(int j, String s) {
		int ind = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == j) {
				if (ind == -1)
					ind = i;
				else
					break;
			} 
		}
		return ind;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			for (int j = 'a'; j <= 'z'; j++) {
				int result = findChar(j, s);
				System.out.print(result + " ");
			}
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}
}

//a-z 97-122