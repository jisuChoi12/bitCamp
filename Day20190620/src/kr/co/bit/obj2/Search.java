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
		System.out.println("1.�л� 2.���� 3.������");
		gubun = Register.input.next();
		System.out.println("ã�� �̸��� �Է��� �ּ���.");
		irumSearch = Register.input.next();
	}
	
	public void dispSearchStudent(HashMap<String, String> haksaHash) {
		System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
		System.out.print("����:"+haksaHash.get("age")+"\t");
		System.out.println("�й�:"+haksaHash.get("hakbun")+"\t");
	}
	
	public void dispSearchProf(HashMap<String, String> haksaHash) {
		System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
		System.out.print("����:"+haksaHash.get("age")+"\t");
		System.out.println("����:"+haksaHash.get("subject")+"\t");
		
	}
	
	public void dispSearchManager(HashMap<String, String> haksaHash) {
		System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
		System.out.print("����:"+haksaHash.get("age")+"\t");
		System.out.println("�μ�:"+haksaHash.get("part")+"\t");		
	}
	
	public void searchProcess() {
		System.out.println("ã��");
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
