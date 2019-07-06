package kr.co.bit.haksa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class Haksa {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection conn = null;
//		String age;
//		String irum;
//		String hakbun;
//		String subject;
//		String part;
//		String sql;
//		PreparedStatement pstmt = null;
//		int no;

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
							int no = Integer.parseInt(br.readLine());
							System.out.println("�̸�");
							String irum = br.readLine();
							System.out.println("����");
							String age = br.readLine();
							System.out.println("�й�");
							String hakbun = br.readLine();
							String sql = "INSERT INTO HAKSASTD(NO,IRUM,AGE,HAKBUN) VALUES(?,?,?,?)"; // �����غ�
							PreparedStatement pstmt = conn.prepareStatement(sql); // �����غ�
							pstmt.setInt(1, no);
							pstmt.setString(2, irum);
							pstmt.setString(3, age);
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
							int no = Integer.parseInt(br.readLine());
							System.out.println("�̸�");
							String irum = br.readLine();
							System.out.println("����");
							String age = br.readLine();
							System.out.println("����");
							String subject = br.readLine();
							String sql = "INSERT INTO HAKSAPROF(NO,IRUM,AGE,SUBJECT) VALUES(?,?,?,?) ";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, irum);
							pstmt.setString(3, age);
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
							int no = Integer.parseInt(br.readLine());
							System.out.println("�̸�");
							String irum = br.readLine();
							System.out.println("����");
							String age = br.readLine();
							System.out.println("�μ�");
							String part = br.readLine();
							String sql = "INSERT INTO HAKSAMNG(NO,IRUM,AGE,PART) VALUES(?,?,?,?) ";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, irum);
							pstmt.setString(3, age);
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
							System.out.println("��ȣ\t�̸�\t����\t�й�");
							String sql = "SELECT NO,IRUM,AGE,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====����ã��=====");
							System.out.println("ã�� �̸��� �Է��ϼ���");
							String irumSearch = br.readLine();
							System.out.println("��ȣ\t�̸�\t����\t����");
							String sql = "SELECT NO,IRUM,AGE,SUBJECT FROM HAKSAPROF WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String subject = rs.getString("subject");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====������ã��=====");
							System.out.println("ã�� �̸��� �Է��ϼ���");
							String irumSearch = br.readLine();
							System.out.println("��ȣ\t�̸�\t����\t�μ�");
							String sql = "SELECT NO,IRUM,AGE,PART FROM HAKSAMNG WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String part = rs.getString("part");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+part+"\n");
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
							String sql = "DELETE FROM HAKSASTD WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
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
							String sql = "DELETE FROM HAKSAPROF WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
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
							String sql = "DELETE FROM HAKSAMNG WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
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
							String irumSearch = br.readLine();
							System.out.println("���� ��ϵ� ����");
							System.out.println("��ȣ\t�̸�\t����\t�й�");
							String sql = "SELECT NO,IRUM,AGE,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+hakbun+"\n");
							}
							System.out.println("");
							System.out.println("������ �����ϼ���");
							System.out.println("��ȣ|�̸�|����|�й�");
							String updateInfo = br.readLine();
							StringTokenizer stoken = new StringTokenizer(updateInfo,"|");
							while(stoken.hasMoreTokens()) {
								int noU = Integer.parseInt(stoken.nextToken());
								String irumU = stoken.nextToken();
								String ageU = stoken.nextToken();
								String hakbunU = stoken.nextToken();
								
								sql = "UPDATE HAKSASTD SET NO=?,IRUM=?,AGE=?,HAKBUN=? WHERE IRUM=?";
								pstmt = conn.prepareStatement(sql);
								pstmt.setInt(1, noU);
								pstmt.setString(2, irumU);
								pstmt.setString(3, ageU);
								pstmt.setString(4, hakbunU);
								pstmt.setString(5, irumSearch);
								int cnt = pstmt.executeUpdate();
								if(cnt==0) {
									System.out.println("������ �����߽��ϴ�");
								}else {
									System.out.println(cnt+"�� �����Ϸ�");
								}
							}
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
							String sql = "SELECT NO,IRUM,AGE,HAKBUN FROM HAKSASTD"; //�����غ�
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("��ȣ\t�̸�\t����\t�й�");
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====������ü���=====");
							String sql = "SELECT NO,IRUM,AGE,SUBJECT FROM HAKSAPROF"; //�����غ�
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("��ȣ\t�̸�\t����\t����");
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String subject = rs.getString("subject");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====��������ü���=====");
							System.out.println("��ȣ\t�̸�\t����\t�μ�");
							String sql = "SELECT NO,IRUM,AGE,PART FROM HAKSAMNG";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String part = rs.getString("part");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+part+"\n");
							}
						}
						else if(protocol==4) {
							System.out.println("=====������=====");
							System.out.println("��ȣ\t�л��̸�\t�л�����\t�й�\t�����̸�\t��������\t����\t�������̸�\t�����ڳ���\t�μ�");
							String sql = "SELECT S.NO AS ��ȣ,S.IRUM AS �л��̸�,S.AGE AS �л�����,S.HAKBUN AS �й�,P.IRUM AS �����̸�,P.AGE AS ��������,P.SUBJECT AS ����,M.IRUM AS �������̸�,M.AGE AS �����ڳ���,M.PART AS �μ� FROM (HAKSASTD S LEFT JOIN HAKSAPROF P ON S.NO=P.NO) LEFT JOIN HAKSAMNG M ON S.NO=M.NO ORDER BY ��ȣ ASC";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("��ȣ");
								String std_irum = rs.getString("�л��̸�");
								String std_age = rs.getString("�л�����");
								String hakbun = rs.getString("�й�");
								String prof_irum = rs.getString("�����̸�");
								String prof_age = rs.getString("��������");
								String subject = rs.getString("����");
								String mng_irum= rs.getString("�������̸�");
								String mng_age = rs.getString("�����ڳ���");
								String part = rs.getString("�μ�");
								System.out.print(no+"\t"+std_irum+"\t"+std_age+"\t"+hakbun+"\t"+prof_irum+"\t"+prof_age+"\t"+subject+"\t"+mng_irum+"\t"+mng_age+"\t"+part+"\n");
							}
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
