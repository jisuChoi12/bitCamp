package kr.co.bit.boarddb;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete extends Board {
	private String titleDelete;
	
	public Delete() {
		titleDelete=null;  
	}
	
	public void setTitleDelete() throws IOException {
		System.out.println("====삭제====");
		System.out.println("삭제할 게시글의 제목 입력");
		titleDelete = br.readLine();
	}
	
	public void boardSqlDelete() {
		sql = "Delete FROM BOARD WHERE TITLE=?";
	}
	
	public void deleteExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleDelete);
		cnt = pstmt.executeUpdate();
		System.out.println("해당 게시글"+cnt+"건이 삭제되었습니다.");		
	}

	public void deleteProcess() throws SQLException,IOException {
		setTitleDelete();
		boardSqlDelete();
		deleteExecuter();
		closeAll();
	}
}
