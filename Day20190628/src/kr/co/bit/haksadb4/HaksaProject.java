package kr.co.bit.haksadb4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Register register = new Register();
		Search search = new Search();
		Delete delete = new Delete();
		List list = new List();
		
		while(true) {//�ݺ���
			System.out.println("�л����");
			System.out.println("========�޴�========");
			System.out.println("1.���");
			System.out.println("2.ã��");
			System.out.println("3.����");
			System.out.println("4.��ü���");
			System.out.println("0.����");
			System.out.println("===================");
			System.out.println("��ȣ�� ������ �ּ���");
			int protocol = Register.input.nextInt();
			
			if(protocol==1){//���
				register.registerProcess();
			}//���
			
			else if(protocol==2) {//ã��
				search.searchProcess();
			}//ã��
			
			else if(protocol==3) {//����
				delete.deleteProcess();
			}//����
			
			else if(protocol==4) {//��ü���
				list.listProcess();
			}//��ü���

			else if(protocol==0) {//����
				System.out.println("����");
				System.exit(0);
			}//����
		}//�ݺ���
	}//main

}