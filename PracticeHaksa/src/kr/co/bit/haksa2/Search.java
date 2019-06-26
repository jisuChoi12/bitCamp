package kr.co.bit.haksa2;


import java.util.HashMap;


public class Search {
	private String gubunSearch;
	private String irumSearch;
	
	public Search() {
		gubunSearch=null;
		irumSearch=null;
	}
	
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
	
	public void searchProcess() {
		System.out.println("찾기");
		System.out.println("1.학생 2.교수 3.관리자");
		gubunSearch = Register.input.next();
		System.out.println("검색할 사람의 이름을 입력해 주세요.");
		System.out.println("이름: ");
		irumSearch = Register.input.next();
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			//학생찾기
			if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
				if(irumSearch.equals(haksaHash.get("irum"))) {
					dispStudent(haksaHash);
				}
			}//학생찾기
			//교수찾기
			else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
				if(irumSearch.equals(haksaHash.get("irum"))) {
					dispProf(haksaHash);
				}
			}//교수찾기
			//관리자찾기
			else if(gubunSearch.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
				if(irumSearch.equals(haksaHash.get("irum"))) {
					dispManager(haksaHash);		
				}
			}//관리자찾기
		}
	}
}
