package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Search {
	private String irumSearch;
	private String gubun;
	
	public Search() {
		irumSearch = null;
		gubun = null;
	}
	
	public void setSearchIrum() {
		System.out.println("1.학생 2.교수 3.관리자");
		gubun = Register.input.next();
		System.out.println("찾을 이름을 입력해 주세요.");
		irumSearch = Register.input.next();
	}
	
	public void dispSearchStudent(HashMap<String, String> haksaHash) {
		System.out.print("이름:"+haksaHash.get("irum")+"\t");
		System.out.print("나이:"+haksaHash.get("age")+"\t");
		System.out.println("학번:"+haksaHash.get("hakbun")+"\t");
	}
	
	public void dispSearchProf(HashMap<String, String> haksaHash) {
		System.out.print("이름:"+haksaHash.get("irum")+"\t");
		System.out.print("나이:"+haksaHash.get("age")+"\t");
		System.out.println("과목:"+haksaHash.get("subject")+"\t");
		
	}
	
	public void dispSearchManager(HashMap<String, String> haksaHash) {
		System.out.print("이름:"+haksaHash.get("irum")+"\t");
		System.out.print("나이:"+haksaHash.get("age")+"\t");
		System.out.println("부서:"+haksaHash.get("part")+"\t");		
	}
	
	public void searchProcess() {
		System.out.println("찾기");
		setSearchIrum();
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			if(haksaHash.get("gubun").equals("1") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					dispSearchStudent(haksaHash);
				}
			}
			else if(haksaHash.get("gubun").equals("2") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					dispSearchProf(haksaHash);
				}
			}
			else if(haksaHash.get("gubun").equals("3") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					dispSearchManager(haksaHash);
				}
			}	
		} 
		
	}
	
}
