package sample.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// �������
@RunWith(Suite.class)
@Suite.SuiteClasses({ Junit4TimeoutTest.class, Junit4ExceptionTest.class })
public class Junit4SuiteTest {

}
