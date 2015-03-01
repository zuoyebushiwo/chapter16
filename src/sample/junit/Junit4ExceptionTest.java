package sample.junit;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.baobaotao.domain.User;

// “Ï≥£≤‚ ‘
public class Junit4ExceptionTest {

	private User user;

	@Before
	public void init() {
		user = null;
	}

	@Test(expected = NullPointerException.class)
	public void testUser() {
		assertNotNull(user.getUserName());
	}
}
