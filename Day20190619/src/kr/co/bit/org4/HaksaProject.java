package kr.co.bit.org4;

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
					haksaHash.put("gubun","1"); //����ϴ� �������� �л����� �������� ���������� "gubun"�̶�� Ű���� ����� ����
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
					haksaHash.put("gubun","2");
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
					haksaHash.put("gubun","3");
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
				System.out.println("ã��");
				System.out.println("ã�� �̸��� �Է��� �ּ���.");
				String irumSearch = input.next();
				
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					
					if(irumSearch.equals(haksaHash.get("irum"))) {
						if(haksaHash.get("gubun").equals("1")) {
							System.out.println("����\t�̸�\t�й�");
							System.out.print(haksaHash.get("age")+"\t");
							System.out.print(haksaHash.get("irum")+"\t");
							System.out.print(haksaHash.get("hakbun")+"\n");
						}
						else if(haksaHash.get("gubun").equals("2")) {
							System.out.println("����\t�̸�\t����");
							System.out.print(haksaHash.get("age")+"\t");
							System.out.print(haksaHash.get("irum")+"\t");
							System.out.print(haksaHash.get("subject")+"\n");
						}
						else if(haksaHash.get("gubun").equals("3")) {
							System.out.println("����\t�̸�\t�μ�");
							System.out.print(haksaHash.get("age")+"\t");
							System.out.print(haksaHash.get("irum")+"\t");
							System.out.print(haksaHash.get("part")+"\n");
						}
					}
				} 
			}
			
			/*��ü�޴�->����******************************************************************/
			else if(protocol==3) {
				System.out.println("����");
				System.out.println("������ �̸��� �Է��� �ּ���.");
				String irumDelete = input.next();
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					if(irumDelete.equals(haksaHash.get("irum"))) {
						if(haksaHash.get("gubun").equals("1")) {
							haksaList.remove(i);
							System.out.println("�л�: "+irumDelete+"���� �����Ǿ����ϴ�.");
						}
						else if(haksaHash.get("gubun").equals("2")) {
							haksaList.remove(i);
							System.out.println("����: "+irumDelete+"���� �����Ǿ����ϴ�.");
						}
						else if(haksaHash.get("gubun").equals("3")) {
							haksaList.remove(i);
							System.out.println("������: "+irumDelete+"���� �����Ǿ����ϴ�.");
						}
					}
				}
			}
			
			/*��ü�޴�->��ü���******************************************************************/
			else if(protocol==4) {
				System.out.println("��ü���");
				System.out.println("����\t�̸�\t�й�\t����\t�μ�");
				for(int i=0; i<haksaList.size(); i++) { //class������ size��� method�� ���� ��� ������ �ִ��� �˷��ش�
					HashMap<String, String> haksaHash = haksaList.get(i);
					//�л����
					if(haksaHash.get("gubun").equals("1")) {
						System.out.print(haksaHash.get("age")+"\t");
						System.out.print(haksaHash.get("irum")+"\t");
						System.out.print(haksaHash.get("hakbun")+"\t\n");
					}
					//�������
					else if(haksaHash.get("gubun").equals("2")) {
						System.out.print(haksaHash.get("age")+"\t");
						System.out.print(haksaHash.get("irum")+"\t\t");
						System.out.print(haksaHash.get("subject")+"\t\n");
					}
					//���������
					else if(haksaHash.get("gubun").equals("3")) {
						System.out.print(haksaHash.get("age")+"\t");
						System.out.print(haksaHash.get("irum")+"\t\t\t");
						System.out.print(haksaHash.get("part")+"\t\n");
					}					
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
