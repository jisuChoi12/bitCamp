package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total;
		int count;
		double avg;
		int n;
		
		try {
			int c = Integer.parseInt(br.readLine());
			for (int i = 0; i < c; i++) {
				String[] std = br.readLine().split(" ");
				
				total = 0;
				avg = 0;
				count = 0;
				n = Integer.parseInt(std[0]);
				
				for (int j = 0; j < Integer.parseInt(std[0]); j++) {
					total = total + Integer.parseInt(std[j + 1]);
					avg = (double) total / Integer.parseInt(std[0]);
				}
				
				for (int j = 0; j < Integer.parseInt(std[0]); j++) {
					if(Double.parseDouble(std[j+1])>avg) {
						count++;
					}
				}
				System.out.printf("%.3f", 100.0 * count / n);
				System.out.println("%");

			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
