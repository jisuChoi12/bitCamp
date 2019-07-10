package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek8958 {

	public static void main(String[] args) {
		int count = 0;
		int score = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int t = Integer.parseInt(br.readLine());

			for (int i = 0; i < t; i++) {
				String[] ox = br.readLine().split("");
				score=0;
				count=0;
				for (int j = 0; j < ox.length; j++) {
					if(ox[j].equalsIgnoreCase("o")) {
						count++;
					}else if(ox[j].equalsIgnoreCase("x")) {
						count=0;
					}
					score += count;
				}
				System.out.println(score);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
