package com.pratap.powermock.bo.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import com.pratap.powermock.bo.exceptions.BOException;
import com.pratap.powermock.dao.UserDAO;
import com.pratap.powermock.dto.UserDTO;

@PrepareForTest({UserBOImpl.class})
public class UserBOImplTest {

	@Mock
	private UserDAO userDAO;

	@InjectMocks
	private UserBOImpl userBOImpl;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCreateUser_Should_Create_UserId() throws SQLException, BOException {

		when(userDAO.create(any(UserDTO.class))).thenReturn("12dwdwSJS");
		String expected = userBOImpl.createUser(new UserDTO());
		assertEquals(expected, "12dwdwSJS");
		verify(userDAO).create(any(UserDTO.class));

	}
	
	@Test(expected = BOException.class)
	public void testCreateUser_Should_Throw_SQLException() throws SQLException, BOException {

		when(userDAO.create(any(UserDTO.class))).thenThrow(SQLException.class);
		userBOImpl.createUser(new UserDTO());
	}
	
	@Test
	public void testUserBOImpl_Constructor() throws Exception {
		
		PowerMockito.whenNew(UserBOImpl.class).withAnyArguments().thenReturn(userBOImpl);
		assertNotNull(userBOImpl);
	}

}
