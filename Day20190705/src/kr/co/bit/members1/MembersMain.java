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
				System.out.println("R:ȸ������ L:ȸ����� S:ȸ��ã�� D:ȸ��Ż�� E:ȸ������ I:�α��� O:�α׾ƿ�");
				String protocol = br.readLine();
				if(protocol.equals("R") || protocol.equals("r")) {
					if(session!=null) {
						System.out.println("�α������Դϴ�.");
						continue;
					}
					HashMap<String, String> hashmap = new HashMap<String, String>();
					System.out.println("���̵��Է�:");
					String id = br.readLine();
					System.out.println("�н������Է�:");
					String psw = br.readLine();
					System.out.println("�ּ��Է�:");
					String adr = br.readLine();
					System.out.println("��ȭ��ȣ�Է�:");
					String phone = br.readLine();
					hashmap.put("id", id);
					hashmap.put("psw", psw);
					hashmap.put("adr", adr);
					hashmap.put("phone", phone);
					arrayList.add(hashmap);
					System.out.println("ȸ����ϵǾ����ϴ�.");
				}
				else if(protocol.equals("L") || protocol.equals("l")){
					System.out.print("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ\n");
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						System.out.print(hashmap.get("id")+"\t"+hashmap.get("psw")+"\t"+hashmap.get("adr")+"\t"+hashmap.get("phone")+"\n");
					}
				}
				else if(protocol.equals("S") || protocol.equals("s")){
					System.out.println("ã�� ȸ���� ID�� �Է�:");
					String idSearch = br.readLine();
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						if(idSearch.equals(hashmap.get("id"))) {
							System.out.print("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ\n");
							System.out.print(hashmap.get("id")+"\t"+hashmap.get("psw")+"\t"+hashmap.get("adr")+"\t"+hashmap.get("phone")+"\n");
						}
						else {
							System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
						}
					}
				}
				else if(protocol.equals("D") || protocol.equals("d")){
					if(session==null) {
						System.out.println("�α������� �ƴմϴ�.");
						continue;
					}
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						if(session.equals(hashmap.get("id"))) {
						arrayList.remove(i);
						System.out.println("ȸ��Ż��Ǿ����ϴ�");
						session=null;
						}
					}
				}
				else if(protocol.equals("E") || protocol.equals("e")){
					if(session==null) {
						System.out.println("�α������� �ƴմϴ�.");
						continue;
					}
					System.out.print("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ\n");
					for(int i=0; i<arrayList.size(); i++) {
						HashMap<String, String> hashmap = arrayList.get(i);
						if(session.equals(hashmap.get("id"))) {
							System.out.println(hashmap.get("id")+"\t"+hashmap.get("psw")+"\t"+hashmap.get("adr")+"\t"+hashmap.get("phone"));
							System.out.println("ȸ�����̵��Է�:");
							String idU = br.readLine();
							System.out.println("ȸ���н������Է�:");
							String pswU = br.readLine();
							System.out.println("ȸ���ּ��Է�:");
							String adrU = br.readLine();
							System.out.println("ȸ����ȭ��ȣ�Է�:");
							String phoneU = br.readLine();
							hashmap.put("id", idU);
							hashmap.put("psw", pswU);
							hashmap.put("adr", adrU);
							hashmap.put("phone", phoneU);
							arrayList.set(i, hashmap);
							System.out.println("ȸ�������� �����Ǿ����ϴ�");
							session=idU;
						}
					}
				}
				else if(protocol.equals("I") || protocol.equals("i")){
					if(session!=null) {
						System.out.println("�α������Դϴ�.");
						continue;
					}
					
					if(arrayList.size()==0) {
						System.out.println("ȸ������� �������� �ʽ��ϴ�.");
						continue;
					}
					else {
						System.out.println("���̵��Է�:");
						String idIn = br.readLine();
						System.out.println("�н������Է�:");
						String pswIn = br.readLine();
						
						for(int i=0; i<arrayList.size(); i++) {
							
							HashMap<String, String> hashmap = arrayList.get(i);
							if(idIn.equals(hashmap.get("id")) && pswIn.equals(hashmap.get("psw"))) {
								System.out.println("ȯ���մϴ�.�α��εǾ����ϴ�.");	
								session = idIn;
							}
							else if(!idIn.equals(hashmap.get("id")) && pswIn.equals(hashmap.get("psw"))) {
								System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
								System.exit(0);
								
							}
							else if(idIn.equals(hashmap.get("id")) && !pswIn.equals(hashmap.get("psw"))) {
								System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");	
								System.exit(0);
							}	
						}
					}
	
				}
				else if(protocol.equals("O") || protocol.equals("o")){
					if(session==null) {
						System.out.println("�α������� �ƴմϴ�.");
						continue;
					}
					session = null;
					System.out.println("�α׾ƿ��Ǿ����ϴ�");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
