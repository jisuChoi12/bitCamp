package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Array_Test7 {
// 다차원 배열 (이차원)
	public static void main(String[] args) {
		/*
		 * int[][] multi = new int[2][3]; // [row][col] Scanner input = new
		 * Scanner(System.in); for(int i=0; i<multi.length; i++) { for(int j=0;
		 * j<multi[i].length; j++) { System.out.println("숫자입력:");
		 * multi[i][j]=input.nextInt(); } } for(int i=0; i<multi.length; i++) {// 첫번째 행
		 * (0행의 길이) for(int j=0; j<multi[i].length; j++) {
		 * System.out.print(multi[i][j]); } System.out.println(); }
		 */
		
		// 일차원 배열과 이차원 배열의 결합
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		// 클래스이기 때문에 자동적으로 증가/감소
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("안녕하세요", "비트입니다"); // 키,값
		System.out.println(hash.get("안녕하세요"));
		list.add(hash);
		
	}
}
