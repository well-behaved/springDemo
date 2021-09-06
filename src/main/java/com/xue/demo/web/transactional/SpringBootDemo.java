package com.xue.demo.web.transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: xuexiong@souche.com
 * @date: 2021/2/1 18:01
 * @description: 启动类
 */
@SpringBootApplication
//@EnableAspectJAutoProxy
//@EnableTransactionManagement
public class SpringBootDemo {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo.class, args);
    }
}
