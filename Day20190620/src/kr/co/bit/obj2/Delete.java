package kr.co.bit.obj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Delete {
	private String irumDelete;
	private String gubun;
	
	public Delete() {
		irumDelete=null;
		gubun=null;
	}

	public void setDeleteIrum() {
		System.out.println("������ �̸��� �Է����ּ���");
		irumDelete = Register.input.next();		
	}
	public void setDeleteGubun() {		
		System.out.println("����");
		System.out.println("1.�л� 2.���� 3.������");
		gubun = Register.input.next();
	}
	public void deleteProcess() {
		setDeleteGubun();
		setDeleteIrum();
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			if(haksaHash.get("gubun").equals("1") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					Register.haksaList.remove(i);
					System.out.println("�л�: "+irumDelete+"���� �����Ǿ����ϴ�.");
				}
			}
			else if(haksaHash.get("gubun").equals("2") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					Register.haksaList.remove(i);
					System.out.println("����: "+irumDelete+"���� �����Ǿ����ϴ�.");
				}
			}
			else if(haksaHash.get("gubun").equals("3") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					Register.haksaList.remove(i);
					System.out.println("������: "+irumDelete+"���� �����Ǿ����ϴ�.");
				}
			}
		}
	}
}
