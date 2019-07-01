package kr.co.bit.boardDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardExecute {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //�ε�
				while(true) {//�ݺ���				
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); //����
					if(conn==null) {
						System.out.println("�����ͺ��̽� ���� ����");
					} else {//�����ͺ��̽� ����
						System.out.println("�����ͺ��̽� ���� ����");
						System.out.println("====�Խ����ۼ�====");
						System.out.println("R:��� S:�˻� D:���� U:���� L:���");
						String protocol = br.readLine();
						
						if(protocol.equals("R") || protocol.equals("r")) {//���
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
						}//���
						
						else if(protocol.equals("S") || protocol.equals("s")) {//�˻�
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
								String readcount = rs.getString("readcount");
								System.out.println(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
							}
							pstmt.close();
							conn.close();
						}//�˻�
						
						else if(protocol.equals("D") || protocol.equals("d")) {//����
							System.out.println("====����====");
							System.out.println("������ �Խñ��� ���� �Է�");
							String titleDelete = br.readLine();
							String sql = "Delete FROM BOARD WHERE TITLE=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, titleDelete);
							int cnt = pstmt.executeUpdate();
							System.out.println("�ش� �Խñ��� �����Ǿ����ϴ�.");
							pstmt.close();
							conn.close();
						}//����
						
						else if(protocol.equals("U") || protocol.equals("u")) {//����
//							System.out.println("====����====");
//							System.out.println("������ �Խñ��� ���� �Է�");
//							String titleSearch = br.readLine();
//							String sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
//							PreparedStatement pstmt = conn.prepareStatement(sql);
//							pstmt.setString(1, titleSearch);
//							ResultSet rs = pstmt.executeQuery();
//							while(rs.next()) {
//								int no = rs.getInt("no");
//								String title = rs.getString("title");
//								String content = rs.getString("content");
//								String author = rs.getString("author");
//								String nal = rs.getString("nal");
//								String readcount = rs.getString("readcount");
//								System.out.println("���� �� �����Դϴ�.");
//								System.out.println(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
//								System.out.println("�ش� �Խñ��� �˻��Ǿ����ϴ�.");
//								System.out.println("������ ����|���� �Է�");
//								String titleContent = br.readLine();
//								int indexI = titleContent.indexOf("|");
//								String titleU = titleContent.substring(0,indexI);
//								String contentU = titleContent.substring(indexI+1);
//								
//							}
							
						}//����
						
						else if(protocol.equals("L") || protocol.equals("l")) {//��ü���
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
								String readcount = rs.getString("readcount");								
								System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
							}
							pstmt.close();
							conn.close();
						}//��ü���
						
					}//�����ͺ��̽� ����
				}//�ݺ���
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		
		
//		try {
//			while(true) {//�ݺ���
//				
//				if(protocol.equals("R") || protocol.equals("r")) {//���
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("����|����");
//					String titleContent = br.readLine();
//					int indexI = titleContent.indexOf("|");
//					String title = titleContent.substring(0,indexI);
//					String content = titleContent.substring(indexI+1);
//					if(title==null || title=="") {
//						System.out.println("������ �Է����ּ���.");
//					}
//					if(content==null || content=="") {
//						System.out.println("������ �Է����ּ���.");
//					}
//					hashMap.put("title", title);
//					hashMap.put("content", content);
//					hashMap.put("author", "������");
//					hashMap.put("nal", "20190701");
//					hashMap.put("readCount", "0");
//					boardList.add(hashMap);
//					System.out.println("�Խñ��� ��ϵǾ����ϴ�.");
//				}//���
//				else if(protocol.equals("S") || protocol.equals("s")) {//�˻�
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====ã��====");
//					System.out.println("ã�� �Խñ� �����Է�");
//					String titleSearch = br.readLine();
//					System.out.print("����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						if(titleSearch.equals(hashMap.get("title"))) {
//							System.out.print(hashMap.get("title")+"\t");
//							System.out.print(hashMap.get("content")+"\t");
//							System.out.print(hashMap.get("author")+"\t");
//							System.out.print(hashMap.get("nal")+"\t");
//							System.out.print(hashMap.get("readCount")+"\n");
//						}
//					}
//				}//�˻�
//				else if(protocol.equals("D") || protocol.equals("d")) {//����
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====����====");
//					System.out.println("���� �� �Խñ� ���� �Է�");
//					String titleDelete = br.readLine();
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						if(titleDelete.equals(hashMap.get("title"))) {
//							boardList.remove(i);
//							System.out.println("�ش� �Խñ��� �����Ǿ����ϴ�.");
//						}
//					}
//				}//����
//				else if(protocol.equals("U") || protocol.equals("u")) {//����
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====����====");
//					System.out.println("���� �� �Խñ� ���� �Է� ");
//					String titleSearch = br.readLine();
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						if(titleSearch.equals(hashMap.get("title"))) {
//							System.out.println("���� �� ���� �Դϴ�.");
//							System.out.print("����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
//							System.out.print(hashMap.get("title")+"\t");
//							System.out.print(hashMap.get("content")+"\t");
//							System.out.print(hashMap.get("author")+"\t");
//							System.out.print(hashMap.get("nal")+"\t");
//							System.out.print(hashMap.get("readCount")+"\n");
//						}
//						System.out.println("�ش� �Խñ��� �˻��Ǿ����ϴ�.");
//						System.out.println("������ ����|���� �� �Է��ϼ���.");
//						String titleContent = br.readLine();
//						int indexI = titleContent.indexOf("|");
//						String title = titleContent.substring(0,indexI);
//						String content = titleContent.substring(indexI+1);
//						hashMap.put("title", title);
//						hashMap.put("content", content);
//						boardList.set(i, hashMap);
//					}
//					System.out.println("�Խñ��� �����Ǿ����ϴ�.");
//				}//����
//				else if(protocol.equals("L") || protocol.equals("l")) {//���
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====��ü���====");
//					System.out.print("����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						System.out.print(hashMap.get("title")+"\t");
//						System.out.print(hashMap.get("content")+"\t");
//						System.out.print(hashMap.get("author")+"\t");
//						System.out.print(hashMap.get("nal")+"\t");
//						System.out.print(hashMap.get("readCount")+"\n");
//					}
//				}//���
//			}//�ݺ���
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
