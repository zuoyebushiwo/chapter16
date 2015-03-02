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

	// ģ��ӿ�
	UserService mockUserService = mock(UserService.class);

	// ģ��ʵ����
	UserServiceImpl mockServiceImpl = mock(UserServiceImpl.class);

	// ����ע��ģ����
	@Mock
	User mockUser;

	@Before
	public void initMocks() {
		// ��ʼ����ǰ���������е�@Mockע��ģ�����
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * ģ��ӿ�UserService����
	 */
	@Test
	public void testMockInterface() {
		// �Է����趨����ֵ
		when(mockUserService.findUserByUserName("tom")).thenReturn(
				new User("tom", "1234"));
		doReturn(true).when(mockUserService).hasMatchUser("tom", "1234"); 
	}

}
