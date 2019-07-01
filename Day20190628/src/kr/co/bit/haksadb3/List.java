package kr.co.bit.haksadb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class List {
	private int protocol;
	private int no;
	private Statement stmt;
	private ResultSet rs;
	private String sql;
	private String age;
	private String irum;
	private String hakbun;
	private String subject;
	private String part;
	private Connection conn;
	private String st_age;
	private String st_irum;
	private String pf_age;
	private String pf_irum;
	private String mng_age;
	private String mng_irum;
	
	
	public List() {
		protocol=0; no=0;
		stmt=null; rs=null; sql=null; age=null; irum=null; hakbun=null; subject=null; part=null;
		st_age=null; st_irum=null; pf_age=null; pf_irum=null; mng_age=null; mng_irum=null;
	}
	
	public void listProcess() {
		System.out.println("========��ü���=========");
		System.out.println("1.�л���ü��� 2.������ü��� 3.��������ü��� 4.��ü���");
		protocol = Register.input.nextInt();
		if(protocol==1) {
			try {//�л���ü���
				conn = Register.getConnection();
				System.out.print("��ȣ\t����\t�̸�\t�й�\n");
				stmt = conn.createStatement(); //�����غ�
				sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT ORDER BY NO ASC"; //�����غ�
				rs = stmt.executeQuery(sql); //����
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					hakbun = rs.getString("hakbun");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//�л���ü���
		if(protocol==2) {//������ü���
			try {
				conn = Register.getConnection();
				System.out.print("��ȣ\t����\t�̸�\t����\n");
				stmt = conn.createStatement(); //�����غ�
				sql = "SELECT NO,AGE,IRUM,SUBJECT FROM PROFESSOR ORDER BY NO ASC"; //�����غ�
				rs = stmt.executeQuery(sql); //����
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					subject = rs.getString("subject");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//������ü���
		else if(protocol==3) {//��������ü���
			try {
				conn = Register.getConnection();
				stmt = conn.createStatement(); //�����غ�
				sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER ORDER BY NO ASC"; //�����غ�
				rs = stmt.executeQuery(sql); //����
				System.out.print("��ȣ\t����\t�̸�\t�μ�\n");
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					part = rs.getString("part");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//��������ü���
		
		else if(protocol==4) {//�л���ü���
			try {
				conn = Register.getConnection();
				stmt = conn.createStatement(); //�����غ�
				sql = "SELECT S.NO AS ��ȣ,S.AGE AS �л�����,S.IRUM AS �л��̸�,S.HAKBUN AS �й�,P.AGE AS ��������,P.IRUM AS �����̸�,P.SUBJECT AS ����,M.AGE AS �����ڳ���,M.IRUM AS �������̸�,M.PART AS �μ� FROM (STUDENT S LEFT JOIN PROFESSOR P ON S.NO=P.NO) LEFT JOIN MANAGER M ON S.NO=M.NO ORDER BY ��ȣ ASC"; //�����غ�
				rs = stmt.executeQuery(sql); //����
				System.out.print("��ȣ\t�л�����\t�л��̸�\t�й�\t��������\t�����̸�\t����\t�����ڳ���\t�������̸�\t�μ�\n");
				while(rs.next()) {
					no = rs.getInt("��ȣ");
					st_age = rs.getString("�л�����");
					st_irum = rs.getString("�л��̸�");
					hakbun = rs.getString("�й�");
					pf_age = rs.getString("��������");
					pf_irum = rs.getString("�����̸�");
					subject = rs.getString("����");
					mng_age = rs.getString("�����ڳ���");
					mng_irum = rs.getString("�������̸�");
					part = rs.getString("�μ�");
					System.out.print(no+"\t"+st_age+"\t"+st_irum+"\t"+hakbun+"\t"+pf_age+"\t"+pf_irum+"\t"+subject+"\t"+mng_age+"\t"+mng_irum+"\t"+part+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//�л���ü���
	}
}
