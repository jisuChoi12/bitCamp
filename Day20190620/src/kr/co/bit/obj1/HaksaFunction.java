package kr.co.bit.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaFunction {
	
	public void register(Scanner input, ArrayList<HashMap<String, String>> haksaList, int protocol) {
		if(protocol==1) {
			HashMap<String,String> haksaHash = new HashMap<String, String>();
			System.out.println("학생등록");
			System.out.println("나이:");
			String age=input.next();
			System.out.println("이름:");
			String irum=input.next();
			System.out.println("학번:");
			String hakbun=input.next();
			haksaHash.put("age", age);
			haksaHash.put("irum", irum);
			haksaHash.put("hakbun", hakbun);
			haksaHash.put("gubun","1");
			haksaList.add(haksaHash);
			System.out.println("학생이 등록되었습니다");
		}
		else if(protocol==2) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("교수등록");
			System.out.println("나이:");
			String age=input.next();
			System.out.println("이름");
			String irum=input.next();
			System.out.println("과목");
			String subject=input.next();
			haksaHash.put("age", age); 
			haksaHash.put("irum", irum);
			haksaHash.put("subject", subject);
			haksaHash.put("gubun","2");
			haksaList.add(haksaHash);
			System.out.println("교수님이 등록되었습니다");
		}
		else if(protocol==3) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("관리자등록");
			System.out.println("나이:");
			String age=input.next();
			System.out.println("이름");
			String irum=input.next();
			System.out.println("부서");
			String part=input.next();
			haksaHash.put("age", age);
			haksaHash.put("irum", irum);
			haksaHash.put("part", part);
			haksaHash.put("gubun","3");
			haksaList.add(haksaHash);
			System.out.println("관리자가 등록되었습니다");
		}
	}
	
	public void search(Scanner input, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("찾기");
		System.out.println("1.학생 2.교수 3.관리자");
		String gubun = input.next();
		System.out.println("찾을 이름을 입력해 주세요.");
		String irumSearch = input.next();
		
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			if(haksaHash.get("gubun").equals("1") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					System.out.println("나이\t이름\t학번");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("hakbun")+"\n");
				}
			}
			else if(haksaHash.get("gubun").equals("2") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					System.out.println("나이\t이름\t과목");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("subject")+"\n");
				}
			}
			else if(haksaHash.get("gubun").equals("3") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					System.out.println("나이\t이름\t부서");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("part")+"\n");
				}
			}
			
//			// 동명이인이 있을때 학생/교수/관리자 구분 없이 모두 출력
//			if(irumSearch.equals(haksaHash.get("irum"))) {
//				if(haksaHash.get("gubun").equals("1")) {
//					System.out.println("나이\t이름\t학번");
//					System.out.print(haksaHash.get("age")+"\t");
//					System.out.print(haksaHash.get("irum")+"\t");
//					System.out.print(haksaHash.get("hakbun")+"\n");
//				}
//				else if(haksaHash.get("gubun").equals("2")) {
//					System.out.println("나이\t이름\t과목");
//					System.out.print(haksaHash.get("age")+"\t");
//					System.out.print(haksaHash.get("irum")+"\t");
//					System.out.print(haksaHash.get("subject")+"\n");
//				}
//				else if(haksaHash.get("gubun").equals("3")) {
//					System.out.println("나이\t이름\t부서");
//					System.out.print(haksaHash.get("age")+"\t");
//					System.out.print(haksaHash.get("irum")+"\t");
//					System.out.print(haksaHash.get("part")+"\n");
//				}
//			}
		} 
	}
	
	public void delete(Scanner input, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("삭제");
		System.out.println("1.학생 2.교수 3.관리자");
		String gubun = input.next();
		System.out.println("삭제할 이름을 입력해주세요");
		String irumDelete = input.next();
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			if(haksaHash.get("gubun").equals("1") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					haksaList.remove(i);
					System.out.println("학생: "+irumDelete+"님이 삭제되었습니다.");
				}
			}
			else if(haksaHash.get("gubun").equals("2") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					haksaList.remove(i);
					System.out.println("교수: "+irumDelete+"님이 삭제되었습니다.");
				}
			}
			else if(haksaHash.get("gubun").equals("3") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					haksaList.remove(i);
					System.out.println("관리자: "+irumDelete+"님이 삭제되었습니다.");
				}
			}
		}
	}
	
	public void list(ArrayList<HashMap<String, String>> haksaList) {//전체출력
		System.out.println("전체출력");
		for(int i=0; i<haksaList.size(); i++) { 
			HashMap<String, String> haksaHash = haksaList.get(i);
			//학생출력
			if(haksaHash.get("gubun").equals("1")) {
				System.out.print("나이:"+haksaHash.get("age")+"\t");
				System.out.print("이름:"+haksaHash.get("irum")+"\t");
				System.out.print("학번:"+haksaHash.get("hakbun")+"\t\n");
			}
			//교수출력
			else if(haksaHash.get("gubun").equals("2")) {
				System.out.print("나이:"+haksaHash.get("age")+"\t");
				System.out.print("이름:"+haksaHash.get("irum")+"\t");
				System.out.print("과목:"+haksaHash.get("subject")+"\t\n");
			}
			//관리자출력
			else if(haksaHash.get("gubun").equals("3")) {
				System.out.print("나이:"+haksaHash.get("age")+"\t");
				System.out.print("이름:"+haksaHash.get("irum")+"\t");
				System.out.print("부서:"+haksaHash.get("part")+"\t\n");
			}					
		}
	}//전체출력
}

