package kr.co.bit;

import java.util.Scanner;

public class Baek1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // �׽�Ʈ ���̽�
		int answer = n;  // �׷�ܾ� ���� (�ʱⰪ�� �׽�Ʈ ���̽� n)
		for (int i = 0; i < n; i++) { // �׽�Ʈ ���̽���ŭ �ݺ�
			String word = scan.next(); // �ܾ��Է�
			boolean[] check = new boolean[26]; // ���ĺ� �迭��(boolean)                   j      j          j
			for (int j = 1; j < word.length(); j++) { // �ܾ��� ���̸�ŭ �ݺ� (1���� ���� -> [0][1],[1][2]...[n-1][n])
				if (word.charAt(j-1) != word.charAt(j)) { // �յ��� ���ĺ��� ����������
					if (check[word.charAt(j) - 97] == true) { // �̹� ���� ���ĺ����� Ȯ��
						--answer; // �׷�ܾ� ���� -1
						break;  // �� �̻� Ȯ�� �� �ʿ� ����
					} 
					check[word.charAt(j-1) - 97] = true; // ���� ������ ���� ���ĺ��̸� �ش� ���ĺ��� �迭�濡 true
				}
			}
		}
		System.out.println(answer); // �׷�ܿ� ���� ���
	}
}


// a-z 97-122
