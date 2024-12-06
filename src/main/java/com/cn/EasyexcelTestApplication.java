package com.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.cn.easyexcel.mapper")
@EnableTransactionManagement
public class EasyexcelTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyexcelTestApplication.class, args);
    }

}
