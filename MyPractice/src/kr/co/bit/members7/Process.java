package kr.co.bit.members7;

import java.io.IOException;
import java.sql.SQLException;

public interface Process {
	public abstract void process() throws SQLException, IOException;
}
