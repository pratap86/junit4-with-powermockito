package com.pratap.powermock.bo;

import com.pratap.powermock.bo.exceptions.BOException;
import com.pratap.powermock.dto.UserDTO;

public interface UserBO {

	String createUser(UserDTO user) throws BOException;
}
