package kr.co.bit.haksa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();
		Scanner input = new Scanner(System.in);
		//while반복문
		while(true) {
			System.out.println("=======메뉴선택======");
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("-------------");
			System.out.println("0.종료");
			System.out.println("-------------");
			System.out.println("번호를 선택해 주세요.");
			int protocol = input.nextInt();
			//등록
			if(protocol==1) {
				System.out.println("=======메뉴선택======");
				System.out.println("1.학생");
				System.out.println("2.교수");
				System.out.println("3.관리자");
				System.out.println("4.이전메뉴");
				System.out.println("번호를 선택해 주세요.");
				protocol = input.nextInt();
				//학생등록
				if(protocol==1) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();	
					System.out.println("이름:");
					String irum = input.next();
					System.out.println("나이:");
					String age = input.next();
					System.out.println("학번:");
					String hakbun = input.next();
					haksaHash.put("irum",irum);
					haksaHash.put("age",age);
					haksaHash.put("hakbun",hakbun);
					haksaHash.put("gubun","1");
					haksaList.add(haksaHash);
					System.out.println("학생 등록 완료");
				}//학생등록
				//교수등록
				else if(protocol==2) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();	
					System.out.println("이름:");
					String irum = input.next();
					System.out.println("나이:");
					String age = input.next();
					System.out.println("과목:");
					String subject = input.next();
					haksaHash.put("irum",irum);
					haksaHash.put("age",age);
					haksaHash.put("subject",subject);
					haksaHash.put("gubun","2");
					haksaList.add(haksaHash);
					System.out.println("교수 등록 완료");
				}//교수등록
				//관리자등록
				else if(protocol==3) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();	
					System.out.println("이름:");
					String irum = input.next();
					System.out.println("나이:");
					String age = input.next();
					System.out.println("부서:");
					String part = input.next();
					haksaHash.put("irum",irum);
					haksaHash.put("age",age);
					haksaHash.put("part",part);
					haksaHash.put("gubun","3");
					haksaList.add(haksaHash);
					System.out.println("관리자 등록 완료");
				}//관리자등록
				//이전메뉴
				else if(protocol==4){
					System.out.println("이전메뉴로 이동");
					continue;
				}//이전메뉴
			}//등록
			
			//찾기
			else if(protocol==2) {
				System.out.println("찾기");
				System.out.println("1.학생 2.교수 3.관리자");
				String gubunSearch = input.next();
				System.out.println("검색할 사람의 이름을 입력해 주세요.");
				System.out.println("이름: ");
				String irumSearch = input.next();
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					//학생찾기
					if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
						if(irumSearch.equals(haksaHash.get("irum"))) {
							System.out.print("이름:"+haksaHash.get("irum")+"\t");
							System.out.print("나이:"+haksaHash.get("age")+"\t");
							System.out.println("학번:"+haksaHash.get("hakbun")+"\t");
						}
					}//학생찾기
					//교수찾기
					else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
						if(irumSearch.equals(haksaHash.get("irum"))) {
							System.out.print("이름:"+haksaHash.get("irum")+"\t");
							System.out.print("나이:"+haksaHash.get("age")+"\t");
							System.out.println("과목:"+haksaHash.get("subject")+"\t");
						}
					}//교수찾기
					//관리자찾기
					else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
						if(irumSearch.equals(haksaHash.get("irum"))) {
							System.out.print("이름:"+haksaHash.get("irum")+"\t");
							System.out.print("나이:"+haksaHash.get("age")+"\t");
							System.out.println("부서:"+haksaHash.get("part")+"\t");			
						}
					}//관리자찾기
				}
			}//찾기
			
			//삭제
			else if(protocol==3) {
				System.out.println("삭제");
				System.out.println("1.학생 2.교수 3.관리자");
				String gubunDelete = input.next();
				System.out.println("삭제할 사람의 이름을 입력해 주세요.");
				System.out.println("이름: ");
				String irumDelete = input.next();
				
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					//학생삭제
					if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
						if(irumDelete.equals(haksaHash.get("irum"))) {
							haksaList.remove(i);
							System.out.println("학생:"+irumDelete+"이 삭제되었습니다.");
						}
					}//학생삭제
					//교수삭제
					else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
						if(irumDelete.equals(haksaHash.get("irum"))) {
							haksaList.remove(i);
							System.out.println("교수:"+irumDelete+"이 삭제되었습니다.");	
						}
					}//교수삭제
					//관리자삭제
					else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
						if(irumDelete.equals(haksaHash.get("irum"))) {
							haksaList.remove(i);
							System.out.println("관리자:"+irumDelete+"이 삭제되었습니다.");							
						}
					}//관리자삭제
				}
			}//삭제
			
			//전체출력
			else if(protocol==4) {
				System.out.println("전체출력");
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					//학생출력
					if(haksaHash.get("gubun").equals("1")) {
						System.out.print("이름:"+haksaHash.get("irum")+"\t");
						System.out.print("나이:"+haksaHash.get("age")+"\t");
						System.out.println("학번:"+haksaHash.get("hakbun")+"\t");
					}//학생출력
					//교수출력
					else if(haksaHash.get("gubun").equals("2")) {
						System.out.print("이름:"+haksaHash.get("irum")+"\t");
						System.out.print("나이:"+haksaHash.get("age")+"\t");
						System.out.println("과목:"+haksaHash.get("subject")+"\t");
					}//교수출력
					//관리자출력
					else if(haksaHash.get("gubun").equals("3")) {
						System.out.print("이름:"+haksaHash.get("irum")+"\t");
						System.out.print("나이:"+haksaHash.get("age")+"\t");
						System.out.println("부서:"+haksaHash.get("part")+"\t");
					}//관리자출력
				}
			}//전체출력
			//종료
			else {
				System.exit(0);
			}//종료
		}//while반복문
	}
}
