package kr.co.bit.members7;

import java.io.IOException;
import java.sql.SQLException;

public class SignOut extends Members implements Process, Session{
	
	@Override
	public void process() throws SQLException, IOException {
		if(isLogin()) {
			System.out.println("로그아웃되었습니다");
			changeSessionStatus();
		}
		else {
			System.out.println("로그인중이 아닙니다.");
		}	
	}

	@Override
	public void changeSessionStatus() {
		Members.session = null;
	}
}
