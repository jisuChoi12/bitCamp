package kr.co.bit.boarddb3;

import java.io.IOException;
import java.sql.SQLException;

public interface BoardInter {
	
	public abstract void boardClose();
	
	public abstract void boardSql();
	
	public abstract void boardProcess() throws SQLException, IOException;
}
