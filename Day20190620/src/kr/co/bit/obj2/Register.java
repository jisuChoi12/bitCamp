package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
//	선언
	public static Scanner input;
	private int protocol;
	public static ArrayList<HashMap<String, String>> haksaList;
	private String irum;
	private String age;
	private String hakbun;
	private String subject;
	private String part;
//	private String gubun;
	
//	초기화
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
		System.out.println("학생등록");
		System.out.println("나이:");
		age=input.next();
		System.out.println("이름:");
		irum=input.next();
		System.out.println("학번:");
		hakbun=input.next();
//		System.out.println("구분:");
//		gubun=input.next();
	}
	
	public void setProf() {
		System.out.println("교수등록");
		System.out.println("나이:");
		age=input.next();
		System.out.println("이름");
		irum=input.next();
		System.out.println("과목");
		subject=input.next();
//		System.out.println("구분:");
//		gubun=input.next();
	}
	
	public void setManager() {
		System.out.println("관리자등록");
		System.out.println("나이:");
		age=input.next();
		System.out.println("이름");
		irum=input.next();
		System.out.println("부서");
		part=input.next();
//		System.out.println("구분:");
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
			System.out.println("학생이 등록되었습니다");
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
			System.out.println("교수님이 등록되었습니다");
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
			System.out.println("관리자가 등록되었습니다");
		}
	}
	
}
