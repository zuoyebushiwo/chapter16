package sample.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.baobaotao.domain.User;

public class Junit4TimeoutTest {

	private User user;

	@Before
	public void init() {
		user = new User("tom", "1234");
	}

	// 测试是指在指定时间内就正确
	@Test(timeout = 10)
	public void testUser() {
		 assertNotNull(user);
		 assertEquals("tom", user.getUserName());
	}
	
}
