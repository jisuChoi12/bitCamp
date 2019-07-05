package kr.co.bit.members4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class MembersMain {
	public static String session;
	
	static {
		session=null;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SignUp signUp = new SignUp();
		SignIn signIn = new SignIn();
		SignOut signOut = new SignOut();
		List list = new List();
		Search search = new Search();
		DeleteAccount deleteAccount = new DeleteAccount();
		Update update = new Update();
		
		while (true) { //반복문
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl");
				System.out.println("R:회원가입 L:회원목록 S:회원찾기 D:회원탈퇴 E:회원수정 I:로그인 O:로그아웃");
				String protocol = br.readLine();
				
				if (protocol.equals("R") || protocol.equals("r")) { //회원가입
					signUp.signUpProcess();
				} //회원가입
				else if (protocol.equals("L") || protocol.equals("l")) { //회원목록
					list.listProcess();
				} //회원목록
				else if (protocol.equals("S") || protocol.equals("s")) { //회원찾기
					search.searchProcess();
				} //회원찾기
				else if (protocol.equals("D") || protocol.equals("d")) { //회원탈퇴
					deleteAccount.deleteAccountProcess();
				} //회원탈퇴
				else if (protocol.equals("E") || protocol.equals("e")) { //회원정보수정
					update.updateProcess();
				} //회원정보수정
				else if (protocol.equals("I") || protocol.equals("i")) { //로그인
					signIn.signInProcess();
				} //로그인
				else if (protocol.equals("O") || protocol.equals("o")) { //로그아웃
					signOut.signOutProcess();
				} //로그아웃
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} //반복문
	}
}
