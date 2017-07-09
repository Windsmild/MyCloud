import com.piaoniu.user.entity.User;
import com.piaoniu.user.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Stephen Cai on 2017-07-09 16:10.
 */
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class MyBatisTest {
	private static Logger logger = Logger.getLogger(MyBatisTest.class);

	@Autowired
	UserService userService;

	@Test
	public void userTest() throws Exception {
		User user = new User();
		user.setUserName("datoucai");
		user.setPassword("123");
		userService.register(user);
	}
}
