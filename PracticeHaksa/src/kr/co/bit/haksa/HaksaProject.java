package kr.co.bit.haksa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();
		Scanner input = new Scanner(System.in);
		//while�ݺ���
		while(true) {
			System.out.println("=======�޴�����======");
			System.out.println("1.���");
			System.out.println("2.ã��");
			System.out.println("3.����");
			System.out.println("4.��ü���");
			System.out.println("-------------");
			System.out.println("0.����");
			System.out.println("-------------");
			System.out.println("��ȣ�� ������ �ּ���.");
			int protocol = input.nextInt();
			//���
			if(protocol==1) {
				System.out.println("=======�޴�����======");
				System.out.println("1.�л�");
				System.out.println("2.����");
				System.out.println("3.������");
				System.out.println("4.�����޴�");
				System.out.println("��ȣ�� ������ �ּ���.");
				protocol = input.nextInt();
				//�л����
				if(protocol==1) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();	
					System.out.println("�̸�:");
					String irum = input.next();
					System.out.println("����:");
					String age = input.next();
					System.out.println("�й�:");
					String hakbun = input.next();
					haksaHash.put("irum",irum);
					haksaHash.put("age",age);
					haksaHash.put("hakbun",hakbun);
					haksaHash.put("gubun","1");
					haksaList.add(haksaHash);
					System.out.println("�л� ��� �Ϸ�");
				}//�л����
				//�������
				else if(protocol==2) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();	
					System.out.println("�̸�:");
					String irum = input.next();
					System.out.println("����:");
					String age = input.next();
					System.out.println("����:");
					String subject = input.next();
					haksaHash.put("irum",irum);
					haksaHash.put("age",age);
					haksaHash.put("subject",subject);
					haksaHash.put("gubun","2");
					haksaList.add(haksaHash);
					System.out.println("���� ��� �Ϸ�");
				}//�������
				//�����ڵ��
				else if(protocol==3) {
					HashMap<String, String> haksaHash = new HashMap<String, String>();	
					System.out.println("�̸�:");
					String irum = input.next();
					System.out.println("����:");
					String age = input.next();
					System.out.println("�μ�:");
					String part = input.next();
					haksaHash.put("irum",irum);
					haksaHash.put("age",age);
					haksaHash.put("part",part);
					haksaHash.put("gubun","3");
					haksaList.add(haksaHash);
					System.out.println("������ ��� �Ϸ�");
				}//�����ڵ��
				//�����޴�
				else if(protocol==4){
					System.out.println("�����޴��� �̵�");
					continue;
				}//�����޴�
			}//���
			
			//ã��
			else if(protocol==2) {
				System.out.println("ã��");
				System.out.println("1.�л� 2.���� 3.������");
				String gubunSearch = input.next();
				System.out.println("�˻��� ����� �̸��� �Է��� �ּ���.");
				System.out.println("�̸�: ");
				String irumSearch = input.next();
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					//�л�ã��
					if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
						if(irumSearch.equals(haksaHash.get("irum"))) {
							System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
							System.out.print("����:"+haksaHash.get("age")+"\t");
							System.out.println("�й�:"+haksaHash.get("hakbun")+"\t");
						}
					}//�л�ã��
					//����ã��
					else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
						if(irumSearch.equals(haksaHash.get("irum"))) {
							System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
							System.out.print("����:"+haksaHash.get("age")+"\t");
							System.out.println("����:"+haksaHash.get("subject")+"\t");
						}
					}//����ã��
					//������ã��
					else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
						if(irumSearch.equals(haksaHash.get("irum"))) {
							System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
							System.out.print("����:"+haksaHash.get("age")+"\t");
							System.out.println("�μ�:"+haksaHash.get("part")+"\t");			
						}
					}//������ã��
				}
			}//ã��
			
			//����
			else if(protocol==3) {
				System.out.println("����");
				System.out.println("1.�л� 2.���� 3.������");
				String gubunDelete = input.next();
				System.out.println("������ ����� �̸��� �Է��� �ּ���.");
				System.out.println("�̸�: ");
				String irumDelete = input.next();
				
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					//�л�����
					if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
						if(irumDelete.equals(haksaHash.get("irum"))) {
							haksaList.remove(i);
							System.out.println("�л�:"+irumDelete+"�� �����Ǿ����ϴ�.");
						}
					}//�л�����
					//��������
					else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
						if(irumDelete.equals(haksaHash.get("irum"))) {
							haksaList.remove(i);
							System.out.println("����:"+irumDelete+"�� �����Ǿ����ϴ�.");	
						}
					}//��������
					//�����ڻ���
					else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
						if(irumDelete.equals(haksaHash.get("irum"))) {
							haksaList.remove(i);
							System.out.println("������:"+irumDelete+"�� �����Ǿ����ϴ�.");							
						}
					}//�����ڻ���
				}
			}//����
			
			//��ü���
			else if(protocol==4) {
				System.out.println("��ü���");
				for(int i=0; i<haksaList.size(); i++) {
					HashMap<String, String> haksaHash = haksaList.get(i);
					//�л����
					if(haksaHash.get("gubun").equals("1")) {
						System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
						System.out.print("����:"+haksaHash.get("age")+"\t");
						System.out.println("�й�:"+haksaHash.get("hakbun")+"\t");
					}//�л����
					//�������
					else if(haksaHash.get("gubun").equals("2")) {
						System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
						System.out.print("����:"+haksaHash.get("age")+"\t");
						System.out.println("����:"+haksaHash.get("subject")+"\t");
					}//�������
					//���������
					else if(haksaHash.get("gubun").equals("3")) {
						System.out.print("�̸�:"+haksaHash.get("irum")+"\t");
						System.out.print("����:"+haksaHash.get("age")+"\t");
						System.out.println("�μ�:"+haksaHash.get("part")+"\t");
					}//���������
				}
			}//��ü���
			//����
			else {
				System.exit(0);
			}//����
		}//while�ݺ���
	}
}
