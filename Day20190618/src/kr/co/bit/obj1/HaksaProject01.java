package kr.co.bit.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject01 {

	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======메뉴선택======");
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("===================");
			System.out.println("0.종료");
			System.out.println("===================");
			System.out.println("번호를 선택해 주세요...");
			int protocol=input.nextInt();
			
			if(protocol==1) {
				System.out.println("=======메뉴선택======");
				System.out.println("1.학생");
			    System.out.println("2.교수");
			    System.out.println("3.관리자");
			    System.out.println("4.이전메뉴");
			    System.out.println("번호를 선택해 주세요...");
			    protocol=input.nextInt();
			    
			    if(protocol==1) {
			    	HashMap<String, String> haksaHash  = new HashMap<String, String>();
			    	System.out.println("학생등록");
			    	System.out.println("나이:");
			    	String age = input.next();
			    	System.out.println("이름:");
			    	String irum = input.next();
			    	System.out.println("학번:");
			    	String hakbun = input.next();
			    	haksaHash.put("age", age);
			    	haksaHash.put("irum", irum);
			    	haksaHash.put("hakbun", hakbun);
			    	haksaList.add(haksaHash);
			    	System.out.println("학생이 등록되었습니다");
			    }
			    else if(protocol==2) {
			    	HashMap<String, String> haksaHash  = new HashMap<String, String>();
			    	System.out.println("교수등록");
			    	System.out.println("나이:");
			    	String age = input.next();
			    	System.out.println("이름:");
			    	String irum = input.next();
			    	System.out.println("과목:");
			    	String subject = input.next();
			    	haksaHash.put("age", age);
			    	haksaHash.put("irum", irum);
			    	haksaHash.put("subject", subject);
			    	haksaList.add(haksaHash);
			    	System.out.println("교수님이 등록되었습니다");
			    }
			    else if(protocol==3) {
			    	HashMap<String, String> haksaHash  = new HashMap<String, String>();
			    	System.out.println("관리자등록");
			    	System.out.println("나이:");
			    	String age = input.next();
			    	System.out.println("이름:");
			    	String irum = input.next();
			    	System.out.println("부서:");
			    	String part = input.next();
			    	haksaHash.put("age", age);
			    	haksaHash.put("irum", irum);
			    	haksaHash.put("part", part);
			    	haksaList.add(haksaHash);
			    	System.out.println("관리자가 등록되었습니다");
			    }
			    else {
			    	System.out.println("이전메뉴로 돌아갑니다...");
			    	continue;
			    }
			    
			}
			else if(protocol==2) {
				System.out.println("찾기");
//				System.out.println("1.학생");
//				System.out.println("2.교수");
//				System.out.println("3.관리자");
//				System.out.println("4.이전메뉴");
//				protocol = input.nextInt();
				/*
				 * if(protocol==1) { HashMap<String, String> haksaHash = haksaList.get(0);
				 * System.out.println("찾을 이름을 입력해주세요"); String irum=input.next(); String
				 * irumFromHash= haksaHash.get("irum"); if(irum.equals(irumFromHash)) {
				 * System.out.print("이름:"+haksaHash.get("irum")+"\t");
				 * System.out.print("나이:"+haksaHash.get("age")+"\t");
				 * System.out.println("학번:"+haksaHash.get("hakbun")+"\t"); } else {
				 * System.out.println("해당 이름을 찾을 수 없습니다."); }
				 * //System.out.println("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요."); } else
				 * if(protocol==2) { HashMap<String, String> haksaHash = haksaList.get(1);
				 * System.out.println("찾을 이름을 입력해주세요"); String irum=input.next(); String
				 * irumFromHash=haksaHash.get("irum"); if(irum.equals(irumFromHash)) {
				 * System.out.print("이름:"+haksaHash.get("irum")+"\t");
				 * System.out.print("나이:"+haksaHash.get("age")+"\t");
				 * System.out.println("과목:"+haksaHash.get("subject")+"\t"); } else {
				 * System.out.println("해당 이름을 찾을 수 없습니다."); } } else if(protocol==3) {
				 * HashMap<String, String> haksaHash = haksaList.get(2);
				 * System.out.println("찾을 이름을 입력해주세요"); String irum=input.next(); String
				 * irumFromHash=haksaHash.get("irum"); if(irum.equals(irumFromHash)) {
				 * System.out.print("이름:"+haksaHash.get("irum")+"\t");
				 * System.out.print("나이:"+haksaHash.get("age")+"\t");
				 * System.out.println("부서:"+haksaHash.get("part")+"\t"); } else {
				 * System.out.println("해당 이름을 찾을 수 없습니다."); } } else {
				 * System.out.println("이전메뉴로 돌아갑니다..."); break; }
				 */
				
				
				
				  System.out.println("찾을 이름을 입력해 주세요"); 
				  String irum=input.next(); 
				  for(int i=0; i<haksaList.size(); i++) { 
					  HashMap<String, String> haksaHash = haksaList.get(i); 
					  String irumFromHash = haksaHash.get("irum");
					  while(irum.equals(irumFromHash)) {
						  System.out.print("이름:"+haksaHash.get("irum")+"\t");
						  System.out.print("나이:"+haksaHash.get("age")+"\t");
						  if(!haksaHash.get("hakbun").equals(null)) {
							  System.out.println("학번:"+haksaHash.get("hakbun")+"\t");
							  continue;
						  }
						  else if(!haksaHash.get("subject").equals(null)){
							  System.out.println("과목:"+haksaHash.get("subject")+"\t");
							  continue;
							  
						  }
						  else if(!haksaHash.get("part").equals(null)){
							  System.out.println("부서:"+haksaHash.get("part")+"\t"); 
							  continue;
						  }
						  break;
					  } 
				  }
				 
				 
			}
			else if(protocol==3) {
				System.out.println("삭제할 사람의 이름을 입력해 주세요")
				;
			}
			else if(protocol==4) {
				System.out.println("전체출력");
				System.out.println("이름\t나이\t학번\t과목\t부서\t");
				for(int i=0; i<haksaList.size(); i++) { // arrayList[학생|교수|관리자]
					HashMap<String, String> haksaHash = haksaList.get(i); // hashMap[이름|나이|,,,]
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("hakbun")+"\t");
					System.out.print(haksaHash.get("subject")+"\t");
					System.out.println(haksaHash.get("part")+"\t");
				}
			}
			else {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
		}

	}

}

