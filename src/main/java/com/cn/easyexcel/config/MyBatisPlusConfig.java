package com.cn.easyexcel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mp 扩展 批量新增 mysql
 *
 * @author 86166
 * @Date 2023/4/22 2:28
 * @Description: MyBatisPlusConfig
 */
@Configuration
@EnableTransactionManagement
public class MyBatisPlusConfig {
    /**
     * 注入批量插入
     *
     * @return MySqlInjector
     */
    @Bean
    @Primary
    public MySqlInjector mySqlInjector() {
        return new MySqlInjector();
    }
}
