package kr.co.bit.members7;

import java.io.IOException;
import java.sql.SQLException;

public class SignOut extends Members implements Process, Session{
	
	@Override
	public void process() throws SQLException, IOException {
		if(isLogin()) {
			System.out.println("�α׾ƿ��Ǿ����ϴ�");
			changeSessionStatus();
		}
		else {
			System.out.println("�α������� �ƴմϴ�.");
		}	
	}

	@Override
	public void changeSessionStatus() {
		Members.session = null;
	}
}
