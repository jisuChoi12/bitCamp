package kr.co.bit.org4;

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
					haksaHash.put("gubun","1"); //등록하는 과정에서 학생인지 교수인지 관리자인지 "gubun"이라는 키값을 만들어 제어
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
					haksaHash.put("gubun","2");
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
					haksaHash.put("gubun","3");
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
				System.out.println("찾기");
				System.out.println("찾을 이름을 입력해 주세요.");
				String irumSearch = input.next();
				
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					
					if(irumSearch.equals(haksaHash.get("irum"))) {
						if(haksaHash.get("gubun").equals("1")) {
							System.out.println("나이\t이름\t학번");
							System.out.print(haksaHash.get("age")+"\t");
							System.out.print(haksaHash.get("irum")+"\t");
							System.out.print(haksaHash.get("hakbun")+"\n");
						}
						else if(haksaHash.get("gubun").equals("2")) {
							System.out.println("나이\t이름\t과목");
							System.out.print(haksaHash.get("age")+"\t");
							System.out.print(haksaHash.get("irum")+"\t");
							System.out.print(haksaHash.get("subject")+"\n");
						}
						else if(haksaHash.get("gubun").equals("3")) {
							System.out.println("나이\t이름\t부서");
							System.out.print(haksaHash.get("age")+"\t");
							System.out.print(haksaHash.get("irum")+"\t");
							System.out.print(haksaHash.get("part")+"\n");
						}
					}
				} 
			}
			
			/*전체메뉴->삭제******************************************************************/
			else if(protocol==3) {
				System.out.println("삭제");
				System.out.println("삭제할 이름을 입력해 주세요.");
				String irumDelete = input.next();
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					if(irumDelete.equals(haksaHash.get("irum"))) {
						if(haksaHash.get("gubun").equals("1")) {
							haksaList.remove(i);
							System.out.println("학생: "+irumDelete+"님이 삭제되었습니다.");
						}
						else if(haksaHash.get("gubun").equals("2")) {
							haksaList.remove(i);
							System.out.println("교수: "+irumDelete+"님이 삭제되었습니다.");
						}
						else if(haksaHash.get("gubun").equals("3")) {
							haksaList.remove(i);
							System.out.println("관리자: "+irumDelete+"님이 삭제되었습니다.");
						}
					}
				}
			}
			
			/*전체메뉴->전체출력******************************************************************/
			else if(protocol==4) {
				System.out.println("전체출력");
				System.out.println("나이\t이름\t학번\t과목\t부서");
				for(int i=0; i<haksaList.size(); i++) { //class에서는 size라는 method를 쓰면 몇개의 공간이 있는지 알려준다
					HashMap<String, String> haksaHash = haksaList.get(i);
					//학생출력
					if(haksaHash.get("gubun").equals("1")) {
						System.out.print(haksaHash.get("age")+"\t");
						System.out.print(haksaHash.get("irum")+"\t");
						System.out.print(haksaHash.get("hakbun")+"\t\n");
					}
					//교수출력
					else if(haksaHash.get("gubun").equals("2")) {
						System.out.print(haksaHash.get("age")+"\t");
						System.out.print(haksaHash.get("irum")+"\t\t");
						System.out.print(haksaHash.get("subject")+"\t\n");
					}
					//관리자출력
					else if(haksaHash.get("gubun").equals("3")) {
						System.out.print(haksaHash.get("age")+"\t");
						System.out.print(haksaHash.get("irum")+"\t\t\t");
						System.out.print(haksaHash.get("part")+"\t\n");
					}					
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
