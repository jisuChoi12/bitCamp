package kr.co.bit.boarddb2;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update extends Board{
//	private int readcount;
//	private int no;
//	private int indexI;
//	private int cnt;
//	private String title;
//	private String content;
//	private String author;
//	private String nal;
//	private String titleContent;
//	private String sql;
//	private PreparedStatement pstmt;
//	private ResultSet rs;
	private String titleSearch;
	private String titleUpdate;
	private String contentUpdate;
	
	public Update() {
//		no=0; indexI=0; cnt=0; readcount=0; title=null; content=null; author=null; nal=null; titleContent=null; sql=null; pstmt=null; rs=null;
		titleSearch=null; titleUpdate=null; contentUpdate=null; 
	}
	
	public void setTitleSearch() throws IOException {
		System.out.println("====����====");
		System.out.println("������ �Խñ��� ���� �Է�");
		titleSearch = Register.br.readLine();		
	}
	
	public void boardSqlSearch() {
		sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
	}
	
//	public void showTitles() {
//		System.out.print("��ȣ\t����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
//	}
	
	public void setTitleContent() throws IOException {
		System.out.println("������ ����|���� �Է�");
		titleContent = Register.br.readLine();
	}
	
//	public void titleContentProcess() {
//		indexI = titleContent.indexOf("|");
//		titleUpdate = titleContent.substring(0,indexI);
//		contentUpdate = titleContent.substring(indexI+1);
//	}
	
	public void boardSqlUpdate() {
		sql = "UPDATE BOARD SET TITLE=?,CONTENT=? WHERE TITLE=?";
	}
	
	public void UpdateExecuter() throws SQLException{
		pstmt = Register.conn.prepareStatement(sql);
		pstmt.setString(1, titleUpdate);
		pstmt.setString(2, contentUpdate);
		pstmt.setString(3, titleSearch);	
		cnt = pstmt.executeUpdate();
		System.out.println(cnt+"���� �Խñ��� �����Ǿ����ϴ�.");
	}
	
	public void SearchExecuter() throws IOException, SQLException {
		pstmt = Register.conn.prepareStatement(sql);
		pstmt.setString(1, titleSearch);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			no = rs.getInt("no");
			title = rs.getString("title");
			content = rs.getString("content");
			author = rs.getString("author");
			nal = rs.getString("nal");
			readcount = rs.getInt("readcount");
			System.out.println("���� �� �����Դϴ�.");
			showTitles();
			System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
			System.out.println("�ش� �Խñ��� �˻��Ǿ����ϴ�.");
				
			setTitleContent();
			titleContentProcess();
			boardSqlUpdate();
			UpdateExecuter();
		}
	}
	
//	public void closeAll() {
//		try {
//			pstmt.close();
//			Register.conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}			
//	}
	
	public void updateProcess() throws SQLException,IOException {
		setTitleSearch();
		boardSqlSearch();
		SearchExecuter();
		closeAll();
	}
}
	
