package com.piaoniu;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Stephen Cai on 2017-11-04 09:55.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// ApplicationContext will be loaded from AppConfig and TestConfig
//@ContextConfiguration(classes = { SpringConfiguration.class})
//@Transactional
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public abstract class AbstractTest {

}
