package kr.co.bit.members8;

import java.io.IOException;
import java.sql.SQLException;

public class SignOut extends Members implements Process, Session{
	
	@Override
	public void process() throws SQLException, IOException {
		if(isLogin()) {
			changeSessionStatus();
			System.out.println("로그아웃되었습니다");
		}
		else {
			System.out.println("로그인중이 아닙니다.");
		}	
	}

	@Override
	public void changeSessionStatus() {
		MembersMain.session = null;
	}
}
