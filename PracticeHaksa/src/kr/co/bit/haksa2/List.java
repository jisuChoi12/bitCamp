package kr.co.bit.haksa2;

import java.util.HashMap;

public class List {
	
	public void dispStudent(HashMap<String, String> haksaHash) {
		System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
		System.out.print("����:"+haksaHash.get("age")+"\t");
		System.out.println("�й�:"+haksaHash.get("hakbun")+"\t");
	}

	public void dispProf(HashMap<String, String> haksaHash) {
		System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
		System.out.print("����:"+haksaHash.get("age")+"\t");
		System.out.println("����:"+haksaHash.get("subject")+"\t");
	}
	
	public void dispManager(HashMap<String, String> haksaHash) {
		System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
		System.out.print("����:"+haksaHash.get("age")+"\t");
		System.out.println("�μ�:"+haksaHash.get("part")+"\t");
	}
	
	public void listProcess() {
		System.out.println("��ü���");
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			//�л����
			if(haksaHash.get("gubun").equals("1")) {
				dispStudent(haksaHash);
			}//�л����
			//�������
			else if(haksaHash.get("gubun").equals("2")) {
				dispProf(haksaHash);
			}//�������
			//���������
			else if(haksaHash.get("gubun").equals("3")) {
				dispManager(haksaHash);
			}//���������
		}
	}
}
