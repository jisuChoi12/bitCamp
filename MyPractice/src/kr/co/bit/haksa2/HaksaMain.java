package kr.co.bit.haksa2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class HaksaMain {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection conn = null;
		HaksaFunction haksafunction = new HaksaFunction();

		while (true) {
			try {
				Class.forName("oracle.jdbc.OracleDriver"); // 로드
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); // 연결
				if (conn != null) {
					System.out.println("데이터베이스 연결 성공");
					System.out.println("=====메뉴=====");
					System.out.println("1.등록 2.찾기 3.삭제 4.수정 5.전체출력 0.종료");
					int protocol = Integer.parseInt(br.readLine());
					if (protocol == 1) {
						haksafunction.register(br, conn, protocol);
					} // 등록
					else if (protocol == 2) {
						haksafunction.search(br, conn, protocol);
					} // 찾기
					else if (protocol == 3) {
						haksafunction.delete(br, conn, protocol);
					} // 삭제
					else if (protocol == 4) {
						haksafunction.update(br, conn, protocol);
					} // 수정
					else if (protocol == 5) {
						haksafunction.list(br, conn, protocol);
					} // 전체출력
					else if(protocol == 0) {// 종료
						System.out.println("=====종료=====");
						System.exit(0);
					} // 종료
					else {
						System.out.println("메뉴에서 골라주세요...");
					}
				} else {
					System.out.println("데이터베이스 연결 실패");
					System.exit(0);
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
