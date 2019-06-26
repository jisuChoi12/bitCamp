package kr.co.bit.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		
		// HashMap�̶�� �ڷᱸ���� ArrayList�ȿ� ž��
		ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>(); 
		// ��ĳ�� ����
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====�޴�����=====");
			System.out.println("1.���");
			System.out.println("2.ã��");
			System.out.println("3.����");
			System.out.println("4.��ü���");
			System.out.println("----------------");
			System.out.println("0.����");
			System.out.println("----------------");
			System.out.println("��ȣ�� ������ �ּ���...");
			int protocol = input.nextInt();
			
			/*��ü�޴�->���****************************************************************/
			if(protocol==1) {
				System.out.println("���");
				System.out.println("=====�޴�����=====");
				System.out.println("1.�л�");
				System.out.println("2.����");
				System.out.println("3.������");
				System.out.println("4.�����޴�");
				System.out.println("��ȣ�� ������ �ּ���...");
				protocol = input.nextInt();
				
				/*��ü�޴�->���->�л�******************************************************************/
				if(protocol==1) {
					HashMap<String,String> haksaHash = new HashMap<String, String>();
					System.out.println("�л����");
					System.out.println("����:");
					String age=input.next();
					System.out.println("�̸�:");
					String irum=input.next();
					System.out.println("�й�:");
					String hakbun=input.next();
					//�޸� ���� hashMap
					haksaHash.put("age", age);
					haksaHash.put("irum", irum);
					haksaHash.put("hakbun", hakbun);
					//�޸� ���� ArrayList 
					haksaList.add(haksaHash);
					System.out.println("�л��� ��ϵǾ����ϴ�");
				}
				
				/*��ü�޴�->���->����******************************************************************/
				else if(protocol==2) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();
					System.out.println("�������");
					System.out.println("����:");
					String age=input.next();
					System.out.println("�̸�");
					String irum=input.next();
					System.out.println("����");
					String subject=input.next();
					//�޸� ���� hashMap
					haksaHash.put("age", age); 
					haksaHash.put("irum", irum);
					haksaHash.put("subject", subject);
					//�޸� ���� ArrayList
					haksaList.add(haksaHash);
					System.out.println("�������� ��ϵǾ����ϴ�");
				}
				
				/*��ü�޴�->���->������******************************************************************/
				else if(protocol==3) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();
					System.out.println("�����ڵ��");
					System.out.println("����:");
					String age=input.next();
					System.out.println("�̸�");
					String irum=input.next();
					System.out.println("�μ�");
					String part=input.next();
					//�޸� ���� hashMap
					haksaHash.put("age", age);
					haksaHash.put("irum", irum);
					haksaHash.put("part", part);
					//�޸� ���� ArrayList
					haksaList.add(haksaHash);
					System.out.println("�����ڰ� ��ϵǾ����ϴ�");
				}
				
				/*��ü�޴�->���->�����޴�******************************************************************/
				else {
					System.out.println("�����޴�");
					continue; // continue�� �Ἥ ������ �ݺ������� ���ư�
				}
			}
			
			/*��ü�޴�->ã��***********************************************************************/
			else if(protocol==2) {
				HashMap<String, String> haksaHash = new HashMap<String, String>();
				System.out.println("ã��");
				System.out.println("ã�� �̸��� �Է��� �ּ���.");
				System.out.println("�̸�:");
				String irum=input.next();
			}
			
			/*��ü�޴�->����******************************************************************/
			else if(protocol==3) {
				System.out.println("����");
			}
			
			/*��ü�޴�->��ü���******************************************************************/
			else if(protocol==4) {
				System.out.println("��ü���");
				System.out.println("����\t�̸�\t�й�\t����\t�μ�\n");
				for(int i=0; i<haksaList.size(); i++) {
					//class������ size��� method�� ���� ��� ������ �ִ��� �˷��ش�
					HashMap<String, String> haksaHash = haksaList.get(i);
					System.out.print(haksaHash.get("age")+"\t");
					System.out.print(haksaHash.get("irum")+"\t");
					System.out.print(haksaHash.get("hakbun")+"\t");
					System.out.print(haksaHash.get("subject")+"\t");
					System.out.print(haksaHash.get("part")+"\t\n");
				}
			}
			
			/*��ü�޴�->����******************************************************************/
			else {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		} // while���� ��
	}
}
