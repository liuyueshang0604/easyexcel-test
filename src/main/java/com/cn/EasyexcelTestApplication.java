package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class EasyexcelTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyexcelTestApplication.class, args);
    }

}
