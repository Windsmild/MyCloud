package com.piaoniu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Stephen Cai on 2017-11-04 10:12.
 */

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.piaoniu.*"})
public class SpringConfiguration {

}
