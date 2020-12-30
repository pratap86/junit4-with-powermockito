package com.pratap.powermock.bo.exceptions;

import java.sql.SQLException;

public class BOException extends Exception {

	private static final long serialVersionUID = 4329090889882137516L;

	public BOException(SQLException e) {
		super(e);
	}
}
