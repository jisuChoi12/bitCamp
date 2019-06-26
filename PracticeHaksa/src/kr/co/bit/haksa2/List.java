package kr.co.bit.haksa2;

import java.util.HashMap;

public class List {
	
	public void dispStudent(HashMap<String, String> haksaHash) {
		System.out.print("이름:"+haksaHash.get("irum")+"\t");
		System.out.print("나이:"+haksaHash.get("age")+"\t");
		System.out.println("학번:"+haksaHash.get("hakbun")+"\t");
	}

	public void dispProf(HashMap<String, String> haksaHash) {
		System.out.print("이름:"+haksaHash.get("irum")+"\t");
		System.out.print("나이:"+haksaHash.get("age")+"\t");
		System.out.println("과목:"+haksaHash.get("subject")+"\t");
	}
	
	public void dispManager(HashMap<String, String> haksaHash) {
		System.out.print("이름:"+haksaHash.get("irum")+"\t");
		System.out.print("나이:"+haksaHash.get("age")+"\t");
		System.out.println("부서:"+haksaHash.get("part")+"\t");
	}
	
	public void listProcess() {
		System.out.println("전체출력");
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			//학생출력
			if(haksaHash.get("gubun").equals("1")) {
				dispStudent(haksaHash);
			}//학생출력
			//교수출력
			else if(haksaHash.get("gubun").equals("2")) {
				dispProf(haksaHash);
			}//교수출력
			//관리자출력
			else if(haksaHash.get("gubun").equals("3")) {
				dispManager(haksaHash);
			}//관리자출력
		}
	}
}
