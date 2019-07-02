package kr.co.bit.boarddb2;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//BoardFunctionŬ������ instance�޼ҵ�
public class BoardFunction {
	
	public void register(Connection conn, BufferedReader br) throws SQLException,IOException {
		System.out.println("====���====");
		System.out.println("�Խñ� ��ȣ �Է�");
		int no = Integer.parseInt(br.readLine());
		System.out.println("����|����");
		String titleContent = br.readLine();
		int indexI = titleContent.indexOf("|");
		String title = titleContent.substring(0, indexI);
		String content = titleContent.substring(indexI+1);
		String sql = "INSERT INTO BOARD(NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT) VALUES(?,?,?,?,?,?)"; //�غ�
		PreparedStatement pstmt = conn.prepareStatement(sql); //�غ�
		pstmt.setInt(1,no);
		pstmt.setString(2, title);
		pstmt.setString(3, content);
		pstmt.setString(4, "������");
		pstmt.setString(5, "20190701");
		pstmt.setInt(6, 0);
		int cnt = pstmt.executeUpdate(); //����
		System.out.println(cnt+"���� �Խñ��� ��ϵǾ����ϴ�.");
		pstmt.close();
		conn.close();						
	}
	
	public void search(Connection conn, BufferedReader br) throws SQLException,IOException {
		System.out.println("====�˻�====");
		System.out.println("ã�� �Խñ� ���� �Է�");
		String titleSearch = br.readLine();
		System.out.print("��ȣ\t����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
		String sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleSearch);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int no = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String author = rs.getString("author");
			String nal = rs.getString("nal");
			int readcount = rs.getInt("readcount");
			System.out.println(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		}
		pstmt.close();
		conn.close();	
	}
	
	public void delete(Connection conn, BufferedReader br) throws SQLException,IOException {
		System.out.println("====����====");
		System.out.println("������ �Խñ��� ���� �Է�");
		String titleDelete = br.readLine();
		String sql = "Delete FROM BOARD WHERE TITLE=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleDelete);
		int cnt = pstmt.executeUpdate();
		System.out.println("�ش� �Խñ�"+cnt+"���� �����Ǿ����ϴ�.");
		pstmt.close();
		conn.close();	
	}

	public void list(Connection conn, BufferedReader br) throws SQLException {
		System.out.println("====��ü���====");
		System.out.print("��ȣ\t����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
		String sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD ORDER BY NO ASC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int no = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String author = rs.getString("author");
			String nal = rs.getString("nal");
			int readcount = rs.getInt("readcount");								
			System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		}
		pstmt.close();
		conn.close();	
	}
	
	public void update(Connection conn, BufferedReader br) throws SQLException,IOException {
		System.out.println("====����====");
		System.out.println("������ �Խñ��� ���� �Է�");
		String titleSearch = br.readLine();
		String sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleSearch);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int no = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String author = rs.getString("author");
			String nal = rs.getString("nal");
			int readcount = rs.getInt("readcount");
			System.out.println("���� �� �����Դϴ�.");
			System.out.print("��ȣ\t����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
			System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
			System.out.println("�ش� �Խñ��� �˻��Ǿ����ϴ�.");
				
			System.out.println("������ ����|���� �Է�");
			String titleContent = br.readLine();
			int indexI = titleContent.indexOf("|");
			String titleUpdate = titleContent.substring(0,indexI);
			String contentUpdate = titleContent.substring(indexI+1);
			sql = "UPDATE BOARD SET TITLE=?,CONTENT=? WHERE TITLE=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, titleUpdate);
			pstmt.setString(2, contentUpdate);
			pstmt.setString(3, titleSearch);	
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"���� �Խñ��� �����Ǿ����ϴ�.");
		}
		pstmt.close();
		conn.close();	
	}
}
