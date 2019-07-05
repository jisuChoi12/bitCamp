package kr.co.bit.members1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class MembersMain {
	public static String session;
	
	static {
		session=null;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<HashMap<String, String>> arrayList = new  ArrayList<HashMap<String,String>>();
		while(true) {
			try {
				System.out.println("R:회원가입 L:회원목록 S:회원찾기 D:회원탈퇴 E:회원수정 I:로그인 O:로그아웃");
				String protocol = br.readLine();
				if(protocol.equals("R") || protocol.equals("r")) {
					if(session!=null) {
						System.out.println("로그인중입니다.");
						continue;
					}
					HashMap<String, String> hashmap = new HashMap<String, String>();
					System.out.println("아이디입력:");
					String id = br.readLine();
					System.out.println("패스워드입력:");
					String psw = br.readLine();
					System.out.println("주소입력:");
					String adr = br.readLine();
					System.out.println("전화번호입력:");
					String phone = br.readLine();
					hashmap.put("id", id);
					hashmap.put("psw", psw);
					hashmap.put("adr", adr);
					hashmap.put("phone", phone);
					arrayList.add(hashmap);
					System.out.println("회원등록되었습니다.");
				}
				else if(protocol.equals("L") || protocol.equals("l")){
					System.out.print("아이디\t패스워드\t주소\t전화번호\n");
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						System.out.print(hashmap.get("id")+"\t"+hashmap.get("psw")+"\t"+hashmap.get("adr")+"\t"+hashmap.get("phone")+"\n");
					}
				}
				else if(protocol.equals("S") || protocol.equals("s")){
					System.out.println("찾는 회원의 ID를 입력:");
					String idSearch = br.readLine();
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						if(idSearch.equals(hashmap.get("id"))) {
							System.out.print("아이디\t패스워드\t주소\t전화번호\n");
							System.out.print(hashmap.get("id")+"\t"+hashmap.get("psw")+"\t"+hashmap.get("adr")+"\t"+hashmap.get("phone")+"\n");
						}
						else {
							System.out.println("해당 회원은 존재하지 않습니다.");
						}
					}
				}
				else if(protocol.equals("D") || protocol.equals("d")){
					if(session==null) {
						System.out.println("로그인중이 아닙니다.");
						continue;
					}
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						if(session.equals(hashmap.get("id"))) {
						arrayList.remove(i);
						System.out.println("회원탈퇴되었습니다");
						session=null;
						}
					}
				}
				else if(protocol.equals("E") || protocol.equals("e")){
					if(session==null) {
						System.out.println("로그인중이 아닙니다.");
						continue;
					}
					System.out.print("아이디\t패스워드\t주소\t전화번호\n");
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						if(session.equals(hashmap.get("id"))) {
							System.out.println(hashmap.get("id")+"\t"+hashmap.get("psw")+"\t"+hashmap.get("adr")+"\t"+hashmap.get("phone"));
							System.out.println("회원아이디입력:");
							String idU = br.readLine();
							System.out.println("회원패스워드입력:");
							String pswU = br.readLine();
							System.out.println("회원주소입력:");
							String adrU = br.readLine();
							System.out.println("회원전화번호입력:");
							String phoneU = br.readLine();
							hashmap.put("id", idU);
							hashmap.put("psw", pswU);
							hashmap.put("adr", adrU);
							hashmap.put("phone", phoneU);
							arrayList.set(i, hashmap);
							System.out.println("회원정보가 수정되었습니다");
							session=idU;
						}
					}
				}
				else if(protocol.equals("I") || protocol.equals("i")){
					if(session!=null) {
						System.out.println("로그인중입니다.");
						continue;
					}
					
					if(arrayList.size()==0) {
						System.out.println("회원목록이 존재하지 않습니다.");
						continue;
					}
					else {
						System.out.println("아이디입력:");
						String idIn = br.readLine();
						System.out.println("패스워드입력:");
						String pswIn = br.readLine();
						
						for(int i=0; i<arrayList.size(); i++) {
							
							HashMap<String, String> hashmap = arrayList.get(i);
							if(idIn.equals(hashmap.get("id")) && pswIn.equals(hashmap.get("psw"))) {
								System.out.println("환영합니다.로그인되었습니다.");	
								session = idIn;
							}
							else if(!idIn.equals(hashmap.get("id")) && pswIn.equals(hashmap.get("psw"))) {
								System.out.println("아이디가 틀렸습니다.");
								System.exit(0);
								
							}
							else if(idIn.equals(hashmap.get("id")) && !pswIn.equals(hashmap.get("psw"))) {
								System.out.println("패스워드가 틀렸습니다.");	
								System.exit(0);
							}	
						}
					}
	
				}
				else if(protocol.equals("O") || protocol.equals("o")){
					if(session==null) {
						System.out.println("로그인중이 아닙니다.");
						continue;
					}
					session = null;
					System.out.println("로그아웃되었습니다");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
