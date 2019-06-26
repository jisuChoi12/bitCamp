package kr.co.bit.haksa2;

import java.util.HashMap;

public class Delete {
	private String gubunDelete;
	private String irumDelete;
	
	public Delete() {
		gubunDelete=null;
		irumDelete=null;
	}
	
	public void delete() {
		System.out.println("삭제");
		System.out.println("1.학생 2.교수 3.관리자");
		gubunDelete = Register.input.next();
		System.out.println("삭제할 사람의 이름을 입력해 주세요.");
		System.out.println("이름: ");
		irumDelete = Register.input.next();
		
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			//학생삭제
			if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
				if(irumDelete.equals(haksaHash.get("irum"))) {
					Register.haksaList.remove(i);
					System.out.println("학생:"+irumDelete+"이 삭제되었습니다.");
				}
			}//학생삭제
			//교수삭제
			else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
				if(irumDelete.equals(haksaHash.get("irum"))) {
					Register.haksaList.remove(i);
					System.out.println("교수:"+irumDelete+"이 삭제되었습니다.");	
				}
			}//교수삭제
			//관리자삭제
			else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
				if(irumDelete.equals(haksaHash.get("irum"))) {
					Register.haksaList.remove(i);
					System.out.println("관리자:"+irumDelete+"이 삭제되었습니다.");							
				}
			}//관리자삭제
		}
	}
}
