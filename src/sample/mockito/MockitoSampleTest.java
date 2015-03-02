package sample.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.Mock;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;
import com.baobaotao.service.UserServiceImpl;

@SuppressWarnings("deprecation")
public class MockitoSampleTest {

	// 模拟接口
	UserService mockUserService = mock(UserService.class);

	// 模拟实现类
	UserServiceImpl mockServiceImpl = mock(UserServiceImpl.class);

	// 基于注释模拟类
	@Mock
	User mockUser;

	@Before
	public void initMocks() {
		// 初始化当前测试类所有的@Mock注释模拟对象
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * 模拟接口UserService测试
	 */
	@Test
	public void testMockInterface() {
		// 对方法设定返回值
		when(mockUserService.findUserByUserName("tom")).thenReturn(
				new User("tom", "1234"));
		doReturn(true).when(mockUserService).hasMatchUser("tom", "1234"); 
	}

}
