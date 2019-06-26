package kr.co.bit.haksa2;


import java.util.HashMap;


public class Search {
	private String gubunSearch;
	private String irumSearch;
	
	public Search() {
		gubunSearch=null;
		irumSearch=null;
	}
	
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
	
	public void searchProcess() {
		System.out.println("ã��");
		System.out.println("1.�л� 2.���� 3.������");
		gubunSearch = Register.input.next();
		System.out.println("�˻��� ����� �̸��� �Է��� �ּ���.");
		System.out.println("�̸�: ");
		irumSearch = Register.input.next();
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			//�л�ã��
			if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
				if(irumSearch.equals(haksaHash.get("irum"))) {
					dispStudent(haksaHash);
				}
			}//�л�ã��
			//����ã��
			else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
				if(irumSearch.equals(haksaHash.get("irum"))) {
					dispProf(haksaHash);
				}
			}//����ã��
			//������ã��
			else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
				if(irumSearch.equals(haksaHash.get("irum"))) {
					dispManager(haksaHash);		
				}
			}//������ã��
		}
	}
}
