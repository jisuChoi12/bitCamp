package kr.co.bit;

import java.util.Scanner;

public class Baek1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 테스트 케이스
		int answer = n;  // 그룹단어 개수 (초기값은 테스트 케이스 n)
		for (int i = 0; i < n; i++) { // 테스트 케이스만큼 반복
			String word = scan.next(); // 단어입력
			boolean[] check = new boolean[26]; // 알파벳 배열방(boolean)                   j      j          j
			for (int j = 1; j < word.length(); j++) { // 단어의 길이만큼 반복 (1부터 시작 -> [0][1],[1][2]...[n-1][n])
				if (word.charAt(j-1) != word.charAt(j)) { // 앞뒤의 알파벳이 같지않을때
					if (check[word.charAt(j) - 97] == true) { // 이미 나온 알파벳인지 확인
						--answer; // 그룹단어 개수 -1
						break;  // 더 이상 확인 할 필요 없음
					} 
					check[word.charAt(j-1) - 97] = true; // 아직 나오지 않은 알파벳이면 해당 알파벳의 배열방에 true
				}
			}
		}
		System.out.println(answer); // 그룹단에 개수 출력
	}
}


// a-z 97-122
