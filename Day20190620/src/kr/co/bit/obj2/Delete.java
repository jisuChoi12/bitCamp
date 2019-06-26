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
		System.out.println("삭제할 이름을 입력해주세요");
		irumDelete = Register.input.next();		
	}
	public void setDeleteGubun() {		
		System.out.println("삭제");
		System.out.println("1.학생 2.교수 3.관리자");
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
					System.out.println("학생: "+irumDelete+"님이 삭제되었습니다.");
				}
			}
			else if(haksaHash.get("gubun").equals("2") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					Register.haksaList.remove(i);
					System.out.println("교수: "+irumDelete+"님이 삭제되었습니다.");
				}
			}
			else if(haksaHash.get("gubun").equals("3") && haksaHash.get("gubun").equals(gubun)) {
				if(haksaHash.get("irum").equals(irumDelete)) {
					Register.haksaList.remove(i);
					System.out.println("관리자: "+irumDelete+"님이 삭제되었습니다.");
				}
			}
		}
	}
}
