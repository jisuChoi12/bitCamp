package kr.co.bit.haksa2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();
		Scanner input = new Scanner(System.in);
		Register register = new Register();
		Search search = new Search();
		Delete delete = new Delete();
		List list = new List();
		
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
				register.registerProcess(protocol);
				//�����޴�
				if(protocol==4){
					System.out.println("�����޴��� �̵�");
					continue;
				}//�����޴�
			}//���
			
			//ã��
			else if(protocol==2) {
				search.searchProcess();
			}//ã��
			
			//����
			else if(protocol==3) {
				delete.delete();
			}//����
		
			//��ü���
			else if(protocol==4) {
				list.listProcess();
			}//��ü���
			
			//����
			else {
				System.exit(0);
			}//����
			
		}//while�ݺ���
	}
}
