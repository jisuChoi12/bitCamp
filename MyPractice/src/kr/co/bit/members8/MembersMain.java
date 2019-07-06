package kr.co.bit.members8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;


public class MembersMain {
	public static String session;
	public static int tryCount;
	
	static {
		session=null;
		tryCount=0;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		SignUp signUp = new SignUp();
		SignIn signIn = new SignIn();
		SignOut signOut = new SignOut();
		List list = new List();
		Search search = new Search();
		Delete delete = new Delete();
		Update update = new Update();
		
		Poly poly = new Poly();
		
		while (true) { //반복문
			try {
				Members.getConnection();
				System.out.println("R:회원가입 L:회원목록 S:회원찾기 D:회원탈퇴 E:회원수정 I:로그인 O:로그아웃");
				String protocol = br.readLine();
				
				if (protocol.equals("R") || protocol.equals("r")) { //회원가입
					poly.process(signUp);
				} //회원가입
				else if (protocol.equals("L") || protocol.equals("l")) { //회원목록
					poly.process(list);
				} //회원목록
				else if (protocol.equals("S") || protocol.equals("s")) { //회원찾기
					poly.process(search);
				} //회원찾기
				else if (protocol.equals("D") || protocol.equals("d")) { //회원탈퇴
					poly.process(delete);
				} //회원탈퇴
				else if (protocol.equals("E") || protocol.equals("e")) { //회원정보수정
					poly.process(update);
				} //회원정보수정
				else if (protocol.equals("I") || protocol.equals("i")) { //로그인
					poly.process(signIn);
				} //로그인
				else if (protocol.equals("O") || protocol.equals("o")) { //로그아웃
					poly.process(signOut);
				} //로그아웃
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} //반복문
	}
}
