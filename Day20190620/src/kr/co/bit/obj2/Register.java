package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
//	����
	public static Scanner input;
	private int protocol;
	public static ArrayList<HashMap<String, String>> haksaList;
	private String irum;
	private String age;
	private String hakbun;
	private String subject;
	private String part;
//	private String gubun;
	
//	�ʱ�ȭ
	static {
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
//		gubun=null;
	}
	
	public void setStudent() {
		System.out.println("�л����");
		System.out.println("����:");
		age=input.next();
		System.out.println("�̸�:");
		irum=input.next();
		System.out.println("�й�:");
		hakbun=input.next();
//		System.out.println("����:");
//		gubun=input.next();
	}
	
	public void setProf() {
		System.out.println("�������");
		System.out.println("����:");
		age=input.next();
		System.out.println("�̸�");
		irum=input.next();
		System.out.println("����");
		subject=input.next();
//		System.out.println("����:");
//		gubun=input.next();
	}
	
	public void setManager() {
		System.out.println("�����ڵ��");
		System.out.println("����:");
		age=input.next();
		System.out.println("�̸�");
		irum=input.next();
		System.out.println("�μ�");
		part=input.next();
//		System.out.println("����:");
//		gubun=input.next();	
	}
	
	public void registerProcess(int protocol) {
		if(protocol==1) {
			HashMap<String,String> haksaHash = new HashMap<String, String>();
			setStudent();
			haksaHash.put("age", age);
			haksaHash.put("irum", irum);
			haksaHash.put("hakbun", hakbun);
			haksaHash.put("gubun","1");
//			haksaHash.put("gubun",gubun);			
			haksaList.add(haksaHash);
			System.out.println("�л��� ��ϵǾ����ϴ�");
		}
		else if(protocol==2) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			setProf();
			haksaHash.put("age", age); 
			haksaHash.put("irum", irum);
			haksaHash.put("subject", subject);
			haksaHash.put("gubun","2");
//			haksaHash.put("gubun",gubun);
			haksaList.add(haksaHash);
			System.out.println("�������� ��ϵǾ����ϴ�");
		}
		else if(protocol==3) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();
			setManager();
			haksaHash.put("age", age);
			haksaHash.put("irum", irum);
			haksaHash.put("part", part);
			haksaHash.put("gubun","3");
//			haksaHash.put("gubun",gubun);
			haksaList.add(haksaHash);
			System.out.println("�����ڰ� ��ϵǾ����ϴ�");
		}
	}
	
}
