package sample.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.baobaotao.domain.User;

public class Junit4SampleTest {

	private User user;

	// ����ǰJUnit�����setUp()�����ͳ�ʼ�����Ի���
	@Before
	public void setUp() {
		user = new User("Junit", "1234");
	}

	// ������ɺ�JUnit�����tearDown()������Դ�����ͷŴ򿪵��ļ����ر����ݿ����ӵȵ�
	public void tearDown() {
		assertNull(null, user);
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("11");
	}

	// ������ɺ�JUnit�����tearDown()������Դ�����ͷŴ򿪵��ļ�,�ر����ݿ����ӵȵ�
	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("22");
	}

	// ����User�û�������
	@Test
	public void testUser() {
		assertEquals("Junit", user.getUserName());
		assertEquals("1234", user.getPassword());// ���������ֹ��ϣ�Ӧ�ð���ߵĲ�����Ϊ10
	}

	// ����Hello���е�division����
	@Test(expected = Exception.class)
	public void testUserId() {
		assertEquals(0, user.getUserId());
	}

}
