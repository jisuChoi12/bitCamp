package kr.co.bit.haksa2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
	public static Scanner input;
	public static ArrayList<HashMap<String, String>> haksaList;
	private int protocol;
	private String irum;
	private String age;
	private String hakbun;
	private String subject;
	private String part;
	
	static{
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String,String>>();
	}
	
	public Register() {
		protocol=0;
		irum=null;
		age=null;
		hakbun=null;
		subject=null;
		part=null;
	}
	
	public void setStudent() {
		System.out.println("�̸�:");
		irum = input.next();
		System.out.println("����:");
		age = input.next();
		System.out.println("�й�:");
		hakbun = input.next();
	}
	
	public void setProf() {
		System.out.println("�̸�:");
		irum = input.next();
		System.out.println("����:");
		age = input.next();
		System.out.println("����:");
		subject = input.next();
	}
	
	public void setManager() {
		System.out.println("�̸�:");
		irum = input.next();
		System.out.println("����:");
		age = input.next();
		System.out.println("�μ�:");
		part = input.next();
	}
	
	public void registerProcess(int protocol) {
		//�л����
		if(protocol==1) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();	
			setStudent();
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
			setProf();
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
			setManager();
			haksaHash.put("irum",irum);
			haksaHash.put("age",age);
			haksaHash.put("part",part);
			haksaHash.put("gubun","3");
			haksaList.add(haksaHash);
			System.out.println("������ ��� �Ϸ�");
		}//�����ڵ��
	}
}
