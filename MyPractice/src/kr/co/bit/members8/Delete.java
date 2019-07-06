package kr.co.bit.members8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.omg.PortableServer.portable.Delegate;

public class Delete extends Members implements Process, Session, SetSql{

	private int cnt;
	
	public Delete() {
		conn=null; sql=null; pstmt=null; cnt=0;
	}
	
	public void deleteExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, session);
		cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("탈퇴되었습니다");
			changeSessionStatus();
		}
	}

	@Override
	public void process() throws SQLException, IOException {
		if(isLogin()) {
			memSql();
			deleteExecuter();
		}
		else {
			System.out.println("로그인중이 아닙니다.");
		}
	}

	@Override
	public void changeSessionStatus() {
		session=null;
	}

	@Override
	public void memSql() throws IOException {
		sql = "DELETE FROM MEMBER WHERE ID=?";
	}
}
