package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;

public class List {
	
	public void dispList() {
		System.out.println("전체출력");		
	}
	
	public void listProcess() {//전체출력
		dispList();
		for(int i=0; i<Register.haksaList.size(); i++) { 
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
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
