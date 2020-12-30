package com.pratap.powermock.dao.impl;

import com.pratap.powermock.dao.UserDAO;
import com.pratap.powermock.dto.UserDTO;
import com.pratap.powermock.utils.IDGenrator;

public class UserDAOImpl implements UserDAO {

	@Override
	public String create(UserDTO user) {

		// save the UserDTO in to DB
		return IDGenrator.generateId(8);
	}

}
