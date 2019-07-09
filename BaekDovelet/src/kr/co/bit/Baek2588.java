package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2588 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int first=0,second=0, third=0, result=0;
		try {
			String aaa = br.readLine();
			String bbb = br.readLine();
			
			arr2[0] = Integer.parseInt(bbb.substring(0,1));
			arr2[1] = Integer.parseInt(bbb.substring(1,2));
			arr2[2] = Integer.parseInt(bbb.substring(2,3));
			
			first = Integer.parseInt(aaa)*arr2[2];
			second = Integer.parseInt(aaa)*arr2[1];
			third = Integer.parseInt(aaa)*arr2[0];
			result = Integer.parseInt(aaa)*Integer.parseInt(bbb);
			System.out.println(first);
			System.out.println(second);
			System.out.println(third);
			System.out.println(result);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
