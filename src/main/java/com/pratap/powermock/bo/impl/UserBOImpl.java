package com.pratap.powermock.bo.impl;

import java.sql.SQLException;

import com.pratap.powermock.bo.UserBO;
import com.pratap.powermock.bo.exceptions.BOException;
import com.pratap.powermock.dao.UserDAO;
import com.pratap.powermock.dto.UserDTO;

public class UserBOImpl implements UserBO {

	private UserDAO userDAO;
	
	@Override
	public String createUser(UserDTO user) throws BOException {
		String userId;
		try {
			userId = userDAO.create(user);
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return userId;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
