package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Array_Test7 {
// ������ �迭 (������)
	public static void main(String[] args) {
		/*
		 * int[][] multi = new int[2][3]; // [row][col] Scanner input = new
		 * Scanner(System.in); for(int i=0; i<multi.length; i++) { for(int j=0;
		 * j<multi[i].length; j++) { System.out.println("�����Է�:");
		 * multi[i][j]=input.nextInt(); } } for(int i=0; i<multi.length; i++) {// ù��° ��
		 * (0���� ����) for(int j=0; j<multi[i].length; j++) {
		 * System.out.print(multi[i][j]); } System.out.println(); }
		 */
		
		// ������ �迭�� ������ �迭�� ����
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		// Ŭ�����̱� ������ �ڵ������� ����/����
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("�ȳ��ϼ���", "��Ʈ�Դϴ�"); // Ű,��
		System.out.println(hash.get("�ȳ��ϼ���"));
		list.add(hash);
		
	}
}
