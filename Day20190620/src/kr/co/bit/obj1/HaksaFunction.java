package kr.co.bit.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaFunction {
	
	public void register(Scanner input, ArrayList<HashMap<String, String>> haksaList, int protocol) {
		if(protocol==1) {
			HashMap<String,String> haksaHash = new HashMap<String, String>();
			System.out.println("�л����");
			System.out.println("����:");
			String age=input.next();
			System.out.println("�̸�:");
			String irum=input.next();
			System.out.println("�й�:");
			String hakbun=input.next();
			haksaHash.put("age", age);
			haksaHash.put("irum", irum);
			haksaHash.put("hakbun", hakbun);
			haksaHash.put("gubun","1");
			haksaList.add(haksaHash);
			System.out.println("�л��� ��ϵǾ����ϴ�");
		}
		else if(protocol==2) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("�������");
			System.out.println("����:");
			String age=input.next();
			System.out.println("�̸�");
			String irum=input.next();
			System.out.println("����");
			String subject=input.next();
			haksaHash.put("age", age); 
			haksaHash.put("irum", irum);
			haksaHash.put("subject", subject);
			haksaHash.put("gubun","2");
			haksaList.add(haksaHash);
			System.out.println("�������� ��ϵǾ����ϴ�");
		}
		else if(protocol==3) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			System.out.println("�����ڵ��");
			System.out.println("����:");
			String age=input.next();
			System.out.println("�̸�");
			String irum=input.next();
			System.out.println("�μ�");
			String part=input.next();
			haksaHash.put("age", age);
			haksaHash.put("irum", irum);
			haksaHash.put("part", part);
			haksaHash.put("gubun","3");
			haksaList.add(haksaHash);
			System.out.println("�����ڰ� ��ϵǾ����ϴ�");
		}
	}
	
	public void search(Scanner input, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("ã��");
		System.out.println("1.�л� 2.���� 3.������");
		String gubun = input.next();
		System.out.println("ã�� �̸��� �Է��� �ּ���.");
		String irumSearch = input.next();
		
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			if(haksaHash.get("gubun").equals("1") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					System.out.println("����\t�̸�\t�й�");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("hakbun")+"\n");
				}
			}
			else if(haksaHash.get("gubun").equals("2") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					System.out.println("����\t�̸�\t����");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("subject")+"\n");
				}
			}
			else if(haksaHash.get("gubun").equals("3") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumSearch)) {
					System.out.println("����\t�̸�\t�μ�");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("part")+"\n");
				}
			}
			
//			// ���������� ������ �л�/����/������ ���� ���� ��� ���
//			if(irumSearch.equals(haksaHash.get("irum"))) {
//				if(haksaHash.get("gubun").equals("1")) {
//					System.out.println("����\t�̸�\t�й�");
//					System.out.print(haksaHash.get("age")+"\t");
//					System.out.print(haksaHash.get("irum")+"\t");
//					System.out.print(haksaHash.get("hakbun")+"\n");
//				}
//				else if(haksaHash.get("gubun").equals("2")) {
//					System.out.println("����\t�̸�\t����");
//					System.out.print(haksaHash.get("age")+"\t");
//					System.out.print(haksaHash.get("irum")+"\t");
//					System.out.print(haksaHash.get("subject")+"\n");
//				}
//				else if(haksaHash.get("gubun").equals("3")) {
//					System.out.println("����\t�̸�\t�μ�");
//					System.out.print(haksaHash.get("age")+"\t");
//					System.out.print(haksaHash.get("irum")+"\t");
//					System.out.print(haksaHash.get("part")+"\n");
//				}
//			}
		} 
	}
	
	public void delete(Scanner input, ArrayList<HashMap<String, String>> haksaList) {
		System.out.println("����");
		System.out.println("1.�л� 2.���� 3.������");
		String gubun = input.next();
		System.out.println("������ �̸��� �Է����ּ���");
		String irumDelete = input.next();
		for(int i=0; i<haksaList.size(); i++) {
			HashMap<String, String> haksaHash = haksaList.get(i);
			if(haksaHash.get("gubun").equals("1") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					haksaList.remove(i);
					System.out.println("�л�: "+irumDelete+"���� �����Ǿ����ϴ�.");
				}
			}
			else if(haksaHash.get("gubun").equals("2") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					haksaList.remove(i);
					System.out.println("����: "+irumDelete+"���� �����Ǿ����ϴ�.");
				}
			}
			else if(haksaHash.get("gubun").equals("3") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					haksaList.remove(i);
					System.out.println("������: "+irumDelete+"���� �����Ǿ����ϴ�.");
				}
			}
		}
	}
	
	public void list(ArrayList<HashMap<String, String>> haksaList) {//��ü���
		System.out.println("��ü���");
		for(int i=0; i<haksaList.size(); i++) { 
			HashMap<String, String> haksaHash = haksaList.get(i);
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

