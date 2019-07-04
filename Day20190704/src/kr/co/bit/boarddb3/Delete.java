package kr.co.bit.boarddb3;

import java.io.IOException;
import java.sql.SQLException;

public class Delete extends Board implements BoardInter {
	private String titleDelete;
	
	public Delete() {
		titleDelete=null;  
	}
	
	public void setTitleDelete() throws IOException {
		System.out.println("====����====");
		System.out.println("������ �Խñ��� ���� �Է�");
		titleDelete = br.readLine();
	}
	
	@Override
	public void boardSql() {
		sql = "Delete FROM BOARD WHERE TITLE=?";
	}
	
	public void deleteExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleDelete);
		cnt = pstmt.executeUpdate();
		System.out.println("�ش� �Խñ�"+cnt+"���� �����Ǿ����ϴ�.");		
	}

	@Override
	public void boardProcess() throws SQLException,IOException {
		setTitleDelete();
		deleteExecuter();
		boardClose();
	}

	@Override
	public void boardClose() {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
