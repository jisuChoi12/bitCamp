package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;

public class List {
	
	public void dispList() {
		System.out.println("��ü���");		
	}
	
	public void listProcess() {//��ü���
		dispList();
		for(int i=0; i<Register.haksaList.size(); i++) { 
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			//�л����
			if(haksaHash.get("gubun").equals("1")) {
				System.out.print("����:"+haksaHash.get("age")+"\t");
				System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
				System.out.print("�й�:"+haksaHash.get("hakbun")+"\t\n");
			}
			//�������
			else if(haksaHash.get("gubun").equals("2")) {
				System.out.print("����:"+haksaHash.get("age")+"\t");
				System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
				System.out.print("����:"+haksaHash.get("subject")+"\t\n");
			}
			//���������
			else if(haksaHash.get("gubun").equals("3")) {
				System.out.print("����:"+haksaHash.get("age")+"\t");
				System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
				System.out.print("�μ�:"+haksaHash.get("part")+"\t\n");
			}					
		}
	}//��ü���
}
