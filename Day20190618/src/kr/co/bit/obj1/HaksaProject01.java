package kr.co.bit.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject01 {

	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======�޴�����======");
			System.out.println("1.���");
			System.out.println("2.ã��");
			System.out.println("3.����");
			System.out.println("4.��ü���");
			System.out.println("===================");
			System.out.println("0.����");
			System.out.println("===================");
			System.out.println("��ȣ�� ������ �ּ���...");
			int protocol=input.nextInt();
			
			if(protocol==1) {
				System.out.println("=======�޴�����======");
				System.out.println("1.�л�");
			    System.out.println("2.����");
			    System.out.println("3.������");
			    System.out.println("4.�����޴�");
			    System.out.println("��ȣ�� ������ �ּ���...");
			    protocol=input.nextInt();
			    
			    if(protocol==1) {
			    	HashMap<String, String> haksaHash  = new HashMap<String, String>();
			    	System.out.println("�л����");
			    	System.out.println("����:");
			    	String age = input.next();
			    	System.out.println("�̸�:");
			    	String irum = input.next();
			    	System.out.println("�й�:");
			    	String hakbun = input.next();
			    	haksaHash.put("age", age);
			    	haksaHash.put("irum", irum);
			    	haksaHash.put("hakbun", hakbun);
			    	haksaList.add(haksaHash);
			    	System.out.println("�л��� ��ϵǾ����ϴ�");
			    }
			    else if(protocol==2) {
			    	HashMap<String, String> haksaHash  = new HashMap<String, String>();
			    	System.out.println("�������");
			    	System.out.println("����:");
			    	String age = input.next();
			    	System.out.println("�̸�:");
			    	String irum = input.next();
			    	System.out.println("����:");
			    	String subject = input.next();
			    	haksaHash.put("age", age);
			    	haksaHash.put("irum", irum);
			    	haksaHash.put("subject", subject);
			    	haksaList.add(haksaHash);
			    	System.out.println("�������� ��ϵǾ����ϴ�");
			    }
			    else if(protocol==3) {
			    	HashMap<String, String> haksaHash  = new HashMap<String, String>();
			    	System.out.println("�����ڵ��");
			    	System.out.println("����:");
			    	String age = input.next();
			    	System.out.println("�̸�:");
			    	String irum = input.next();
			    	System.out.println("�μ�:");
			    	String part = input.next();
			    	haksaHash.put("age", age);
			    	haksaHash.put("irum", irum);
			    	haksaHash.put("part", part);
			    	haksaList.add(haksaHash);
			    	System.out.println("�����ڰ� ��ϵǾ����ϴ�");
			    }
			    else {
			    	System.out.println("�����޴��� ���ư��ϴ�...");
			    	continue;
			    }
			    
			}
			else if(protocol==2) {
				System.out.println("ã��");
//				System.out.println("1.�л�");
//				System.out.println("2.����");
//				System.out.println("3.������");
//				System.out.println("4.�����޴�");
//				protocol = input.nextInt();
				/*
				 * if(protocol==1) { HashMap<String, String> haksaHash = haksaList.get(0);
				 * System.out.println("ã�� �̸��� �Է����ּ���"); String irum=input.next(); String
				 * irumFromHash= haksaHash.get("irum"); if(irum.equals(irumFromHash)) {
				 * System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
				 * System.out.print("����:"+haksaHash.get("age")+"\t");
				 * System.out.println("�й�:"+haksaHash.get("hakbun")+"\t"); } else {
				 * System.out.println("�ش� �̸��� ã�� �� �����ϴ�."); }
				 * //System.out.println("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ���."); } else
				 * if(protocol==2) { HashMap<String, String> haksaHash = haksaList.get(1);
				 * System.out.println("ã�� �̸��� �Է����ּ���"); String irum=input.next(); String
				 * irumFromHash=haksaHash.get("irum"); if(irum.equals(irumFromHash)) {
				 * System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
				 * System.out.print("����:"+haksaHash.get("age")+"\t");
				 * System.out.println("����:"+haksaHash.get("subject")+"\t"); } else {
				 * System.out.println("�ش� �̸��� ã�� �� �����ϴ�."); } } else if(protocol==3) {
				 * HashMap<String, String> haksaHash = haksaList.get(2);
				 * System.out.println("ã�� �̸��� �Է����ּ���"); String irum=input.next(); String
				 * irumFromHash=haksaHash.get("irum"); if(irum.equals(irumFromHash)) {
				 * System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
				 * System.out.print("����:"+haksaHash.get("age")+"\t");
				 * System.out.println("�μ�:"+haksaHash.get("part")+"\t"); } else {
				 * System.out.println("�ش� �̸��� ã�� �� �����ϴ�."); } } else {
				 * System.out.println("�����޴��� ���ư��ϴ�..."); break; }
				 */
				
				
				
				  System.out.println("ã�� �̸��� �Է��� �ּ���"); 
				  String irum=input.next(); 
				  for(int i=0; i<haksaList.size(); i++) { 
					  HashMap<String, String> haksaHash = haksaList.get(i); 
					  String irumFromHash = haksaHash.get("irum");
					  while(irum.equals(irumFromHash)) {
						  System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
						  System.out.print("����:"+haksaHash.get("age")+"\t");
						  if(!haksaHash.get("hakbun").equals(null)) {
							  System.out.println("�й�:"+haksaHash.get("hakbun")+"\t");
							  continue;
						  }
						  else if(!haksaHash.get("subject").equals(null)){
							  System.out.println("����:"+haksaHash.get("subject")+"\t");
							  continue;
							  
						  }
						  else if(!haksaHash.get("part").equals(null)){
							  System.out.println("�μ�:"+haksaHash.get("part")+"\t"); 
							  continue;
						  }
						  break;
					  } 
				  }
				 
				 
			}
			else if(protocol==3) {
				System.out.println("������ ����� �̸��� �Է��� �ּ���")
				;
			}
			else if(protocol==4) {
				System.out.println("��ü���");
				System.out.println("�̸�\t����\t�й�\t����\t�μ�\t");
				for(int i=0; i<haksaList.size(); i++) { // arrayList[�л�|����|������]
					HashMap<String, String> haksaHash = haksaList.get(i); // hashMap[�̸�|����|,,,]
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("hakbun")+"\t");
					System.out.print(haksaHash.get("subject")+"\t");
					System.out.println(haksaHash.get("part")+"\t");
				}
			}
			else {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
			
		}

	}

}

