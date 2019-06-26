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
		System.out.println("이름:");
		irum = input.next();
		System.out.println("나이:");
		age = input.next();
		System.out.println("학번:");
		hakbun = input.next();
	}
	
	public void setProf() {
		System.out.println("이름:");
		irum = input.next();
		System.out.println("나이:");
		age = input.next();
		System.out.println("과목:");
		subject = input.next();
	}
	
	public void setManager() {
		System.out.println("이름:");
		irum = input.next();
		System.out.println("나이:");
		age = input.next();
		System.out.println("부서:");
		part = input.next();
	}
	
	public void registerProcess(int protocol) {
		//학생등록
		if(protocol==1) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();	
			setStudent();
			haksaHash.put("irum",irum);
			haksaHash.put("age",age);
			haksaHash.put("hakbun",hakbun);
			haksaHash.put("gubun","1");
			haksaList.add(haksaHash);
			System.out.println("학생 등록 완료");
		}//학생등록
		//교수등록
		else if(protocol==2) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();	
			setProf();
			haksaHash.put("irum",irum);
			haksaHash.put("age",age);
			haksaHash.put("subject",subject);
			haksaHash.put("gubun","2");
			haksaList.add(haksaHash);
			System.out.println("교수 등록 완료");
		}//교수등록
		//관리자등록
		else if(protocol==3) {
			HashMap<String, String> haksaHash = new HashMap<String, String>();	
			setManager();
			haksaHash.put("irum",irum);
			haksaHash.put("age",age);
			haksaHash.put("part",part);
			haksaHash.put("gubun","3");
			haksaList.add(haksaHash);
			System.out.println("관리자 등록 완료");
		}//관리자등록
	}
}
