package kr.co.bit.boarddb3;

import java.io.IOException;
import java.sql.SQLException;

public class BoardPoly {
	
	public void boardSql(BoardInter board) {
		board.boardSql();
	}
	
	public void boardClose(BoardInter board) {
		board.boardClose();
	}
	
	public void boardProcess(BoardInter board) throws SQLException, IOException {
		board.boardProcess();
	}
}
