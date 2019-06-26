package kr.co.bit.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		
		// HashMap이라는 자료구조를 ArrayList안에 탑재
		ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>(); 
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====메뉴선택=====");
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("----------------");
			System.out.println("0.종료");
			System.out.println("----------------");
			System.out.println("번호를 선택해 주세요...");
			int protocol = input.nextInt();
			
			/*전체메뉴->등록****************************************************************/
			if(protocol==1) {
				System.out.println("등록");
				System.out.println("=====메뉴선택=====");
				System.out.println("1.학생");
				System.out.println("2.교수");
				System.out.println("3.관리자");
				System.out.println("4.이전메뉴");
				System.out.println("번호를 선택해 주세요...");
				protocol = input.nextInt();
				
				/*전체메뉴->등록->학생******************************************************************/
				if(protocol==1) {
					HashMap<String,String> haksaHash = new HashMap<String, String>();
					System.out.println("학생등록");
					System.out.println("나이:");
					String age=input.next();
					System.out.println("이름:");
					String irum=input.next();
					System.out.println("학번:");
					String hakbun=input.next();
					//메모리 관리 hashMap
					haksaHash.put("age", age);
					haksaHash.put("irum", irum);
					haksaHash.put("hakbun", hakbun);
					//메모리 관리 ArrayList 
					haksaList.add(haksaHash);
					System.out.println("학생이 등록되었습니다");
				}
				
				/*전체메뉴->등록->교수******************************************************************/
				else if(protocol==2) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();
					System.out.println("교수등록");
					System.out.println("나이:");
					String age=input.next();
					System.out.println("이름");
					String irum=input.next();
					System.out.println("과목");
					String subject=input.next();
					//메모리 관리 hashMap
					haksaHash.put("age", age); 
					haksaHash.put("irum", irum);
					haksaHash.put("subject", subject);
					//메모리 관리 ArrayList
					haksaList.add(haksaHash);
					System.out.println("교수님이 등록되었습니다");
				}
				
				/*전체메뉴->등록->관리자******************************************************************/
				else if(protocol==3) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();
					System.out.println("관리자등록");
					System.out.println("나이:");
					String age=input.next();
					System.out.println("이름");
					String irum=input.next();
					System.out.println("부서");
					String part=input.next();
					//메모리 관리 hashMap
					haksaHash.put("age", age);
					haksaHash.put("irum", irum);
					haksaHash.put("part", part);
					//메모리 관리 ArrayList
					haksaList.add(haksaHash);
					System.out.println("관리자가 등록되었습니다");
				}
				
				/*전체메뉴->등록->이전메뉴******************************************************************/
				else {
					System.out.println("이전메뉴");
					continue; // continue를 써서 이전의 반복문으로 돌아감
				}
			}
			
			/*전체메뉴->찾기***********************************************************************/
			else if(protocol==2) {
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("찾기");
				System.out.println("찾을 이름을 입력해 주세요.");
				System.out.println("이름:");
				String irum=input.next();
			}
			
			/*전체메뉴->삭제******************************************************************/
			else if(protocol==3) {
				System.out.println("삭제");
			}
			
			/*전체메뉴->전체출력******************************************************************/
			else if(protocol==4) {
				System.out.println("전체출력");
				System.out.println("나이\t이름\t학번\t과목\t부서\n");
				for(int i=0; i<haksaList.size(); i++) {
					//class에서는 size라는 method를 쓰면 몇개의 공간이 있는지 알려준다
					HashMap<String, String> haksaHash = haksaList.get(i);
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("hakbun")+"\t");
					System.out.print(haksaHash.get("subject")+"\t");
					System.out.print(haksaHash.get("part")+"\t\n");
				}
			}
			
			/*전체메뉴->종료******************************************************************/
			else {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		} // while문의 끝
	}
}
