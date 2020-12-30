package com.pratap.powermock.dao;

import java.sql.SQLException;

import com.pratap.powermock.dto.UserDTO;

public interface UserDAO {

	String create(UserDTO user) throws SQLException;
}
