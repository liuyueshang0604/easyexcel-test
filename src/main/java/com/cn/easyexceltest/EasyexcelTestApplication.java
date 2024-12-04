package com.cn.easyexceltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class EasyexcelTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyexcelTestApplication.class, args);
    }

}