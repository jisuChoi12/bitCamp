package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek2908 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String result;
			int[] arrInt = new int[2];
			String[] nums = br.readLine().split(" ");
			for (int i = 0; i < nums.length; i++) {
				String[] num = nums[i].split("");
				result="";
				for (int j = num.length; j > 0; j--) {
					result += num[j-1];
				}	 
				arrInt[i] = Integer.parseInt(result);
			}
			int max = Arrays.stream(arrInt).max().getAsInt();
			System.out.println(max);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
