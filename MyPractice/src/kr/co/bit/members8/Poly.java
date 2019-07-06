package kr.co.bit.members8;

import java.io.IOException;
import java.sql.SQLException;

public class Poly {

	public void setInfo(SetInfo sInfo) {
		try {
			sInfo.setInfo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void process(Process p) {
		try {
			p.process();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showInfo(ShowInfo show) {
		try {
			show.showInfo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeSessionStatus(Session session) {
		session.changeSessionStatus();
	}
	
	public void memSql(SetSql sSql) {
		try {
			sSql.memSql();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
