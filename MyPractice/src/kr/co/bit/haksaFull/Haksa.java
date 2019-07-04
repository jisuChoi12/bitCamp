package kr.co.bit.haksaFull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Haksa {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection conn = null;
		String age;
		String irum;
		String hakbun;
		String subject;
		String part;
		String sql;
		PreparedStatement pstmt = null;
		int no;

		while (true) {
			try {
				Class.forName("oracle.jdbc.OracleDriver"); // �ε�
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); // ����
				if (conn != null) {
					System.out.println("�����ͺ��̽� ���� ����");
					System.out.println("=====�޴�=====");
					System.out.println("1.��� 2.ã�� 3.���� 4.���� 5.��ü��� 0.����");
					int protocol = Integer.parseInt(br.readLine());
					if (protocol == 1) {// ���
						System.out.println("=====���=====");
						System.out.println("1.�л� 2.���� 3.������");
						protocol = Integer.parseInt(br.readLine());
						if (protocol == 1) {// �л�
							System.out.println("��ȣ");
							no = Integer.parseInt(br.readLine());
							System.out.println("����");
							age = br.readLine();
							System.out.println("�̸�");
							irum = br.readLine();
							System.out.println("�й�");
							hakbun = br.readLine();
							sql = "INSERT INTO HAKSASTD(NO,AGE,IRUM,HAKBUN) VALUES(?,?,?,?)"; // �����غ�
							pstmt = conn.prepareStatement(sql); // �����غ�
							pstmt.setInt(1, no);
							pstmt.setString(2, age);
							pstmt.setString(3, irum);
							pstmt.setString(4, hakbun);
							int cnt = pstmt.executeUpdate(); // ����
							if (cnt == 0) {
								System.out.println("��Ͽ� �����߽��ϴ�.");
							} else {
								System.out.println(cnt + "�� ��� �Ϸ�");
								pstmt.close();
								conn.close();
							}
						} // �л�
						else if (protocol == 2) {// ����
							System.out.println("��ȣ");
							no = Integer.parseInt(br.readLine());
							System.out.println("����");
							age = br.readLine();
							System.out.println("�̸�");
							irum = br.readLine();
							System.out.println("����");
							subject = br.readLine();
							sql = "INSERT INTO HAKSAPROF(NO,AGE,IRUM,SUBJECT) VALUES(?,?,?,?) ";
							pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, age);
							pstmt.setString(3, irum);
							pstmt.setString(4, subject);
							int cnt = pstmt.executeUpdate();
							if (cnt == 0) {
								System.out.println("��Ͽ� �����߽��ϴ�.");
							} else {
								System.out.println(cnt + "�� ��� �Ϸ�");
								pstmt.close();
								conn.close();
							}
						} // ����
						else if (protocol == 3) {// ������
							System.out.println("��ȣ");
							no = Integer.parseInt(br.readLine());
							System.out.println("����");
							age = br.readLine();
							System.out.println("�̸�");
							irum = br.readLine();
							System.out.println("�μ�");
							part = br.readLine();
							sql = "INSERT INTO HAKSAMNG(NO,AGE,IRUM,PART) VALUES(?,?,?,?) ";
							pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, age);
							pstmt.setString(3, irum);
							pstmt.setString(4, part);
							int cnt = pstmt.executeUpdate();
							if (cnt == 0) {
								System.out.println("��Ͽ� �����߽��ϴ�.");
							} else {
								System.out.println(cnt + "�� ��� �Ϸ�");
								pstmt.close();
								conn.close();
							}
						} // ������
					} // ���
					else if (protocol == 2) {// ã��
						System.out.println("=====ã��=====");
						System.out.println("1.�л� 2.���� 3.������");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====�л�ã��=====");
							System.out.println("ã�� �̸��� �Է��ϼ���");
							String irumSearch = br.readLine();
							System.out.println("��ȣ\t����\t�̸�\t�й�");
							sql = "SELECT NO,AGE,IRUM,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====����ã��=====");
							System.out.println("ã�� �̸��� �Է��ϼ���");
							String irumSearch = br.readLine();
							System.out.println("��ȣ\t����\t�̸�\t����");
							sql = "SELECT NO,AGE,IRUM,SUBJECT FROM HAKSAPROF WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								subject = rs.getString("subject");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====������ã��=====");
							System.out.println("ã�� �̸��� �Է��ϼ���");
							String irumSearch = br.readLine();
							System.out.println("��ȣ\t����\t�̸�\t�μ�");
							sql = "SELECT NO,AGE,IRUM,PART FROM HAKSAMNG WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								part = rs.getString("part");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
							}
						}
					} // ã��
					else if (protocol == 3) {// ����
						System.out.println("=====����=====");
						System.out.println("1.�л� 2.���� 3.������");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====�л�����=====");
							System.out.println("������ �̸��� �Է��ϼ���");
							String irumDelete = br.readLine();
							sql = "DELETE FROM HAKSASTD WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumDelete);
							int cnt = pstmt.executeUpdate();
							if(cnt==0) {
								System.out.println("������ �����߽��ϴ�");
							}else {
								System.out.println(cnt+"�� ���� �Ϸ�");
							}
						}
						else if(protocol==2) {
							System.out.println("=====��������=====");
							System.out.println("������ �̸��� �Է��ϼ���");
							String irumDelete = br.readLine();
							sql = "DELETE FROM HAKSAPROF WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumDelete);
							int cnt = pstmt.executeUpdate();
							if(cnt==0) {
								System.out.println("������ �����߽��ϴ�");
							}else {
								System.out.println(cnt+"�� ���� �Ϸ�");
							}
						}
						else if(protocol==3) {
							System.out.println("=====�����ڻ���=====");	
							System.out.println("������ �̸��� �Է��ϼ���");
							String irumDelete = br.readLine();
							sql = "DELETE FROM HAKSAMNG WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1,irumDelete);
							int cnt = pstmt.executeUpdate();
							if(cnt==0) {
								System.out.println("������ �����߽��ϴ�");
							}else {
								System.out.println(cnt+"�� ���� �Ϸ�");
							}
						}
					} // ����
					else if (protocol == 4) {// ����
						System.out.println("=====����=====");
						System.out.println("1.�л� 2.���� 3.������");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====�л�����=====");
							System.out.println("������ �̸��� �Է��ϼ���");
							String irumUpdate = br.readLine();
							System.out.println("���� ��ϵ� ����");
							sql = "SELECT NO,AGE,IRUM,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumUpdate);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
							}
							System.out.println("");
						}
						else if(protocol==2) {
							System.out.println("=====��������=====");
							System.out.println("������ �̸��� �Է��ϼ���");
							String irumUpdate = br.readLine();
						}
						else if(protocol==3) {
							System.out.println("=====�����ڼ���=====");
							System.out.println("������ �̸��� �Է��ϼ���");
							String irumUpdate = br.readLine();
						}
					} // ����
					else if (protocol == 5) {// ��ü���
						System.out.println("=====��ü���=====");
						System.out.println("1.�л� 2.���� 3.������ 4.������");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====�л���ü���=====");
							sql = "SELECT NO,AGE,IRUM,HAKBUN FROM HAKSASTD"; //�����غ�
							pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("��ȣ\t����\t�̸�\t�й�");
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====������ü���=====");
							sql = "SELECT NO,AGE,IRUM,SUBJECT FROM HAKSAPROF"; //�����غ�
							pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("��ȣ\t����\t�̸�\t����");
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								subject = rs.getString("subject");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====��������ü���=====");
							System.out.println("��ȣ\t����\t�̸�\t�μ�");
							sql = "SELECT NO,AGE,IRUM,PART FROM HAKSAMNG";
							pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								part = rs.getString("part");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
							}
						}
						else if(protocol==4) {
							System.out.println("=====������=====");
							System.out.println("��ȣ\t�л�����\t�л��̸�\t�й�\t��������\t�����̸�\t����\t�����ڳ���\t�������̸�\t�μ�");
							sql = "";
						}
					} // ��ü���
					else if(protocol == 0) {// ����
						System.out.println("=====����=====");
						
					} // ����
					else {
						System.out.println("�޴����� ����ּ���...");
					}
				} else {
					System.out.println("�����ͺ��̽� ���� ����");
				}
			}

			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
