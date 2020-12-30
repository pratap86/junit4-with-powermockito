package com.pratap.powermock.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.pratap.powermock.dao.UserDAO;
import com.pratap.powermock.dto.UserDTO;
import com.pratap.powermock.utils.IDGenrator;

@RunWith(PowerMockRunner.class)
@PrepareForTest({IDGenrator.class})
public class UserDAOImplTest {
	
	private static final String USER_ID = "A31jkssdf99Z";
	private UserDAO userDAO;

	@Before
	public void setup() {
		mockStatic(IDGenrator.class);
		userDAO = new UserDAOImpl();
	}
	
	@Test
	public void testCreate_Should_Return_UserId() throws SQLException {
		
		when(IDGenrator.generateId(Mockito.anyInt())).thenReturn(USER_ID);
		String expectedId = userDAO.create(new UserDTO());
		assertEquals(expectedId, USER_ID);
	}

}
