package com.ryan.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.ryan.www.dao")
@EnableCaching
//开启事物
@EnableTransactionManagement
//开启重试
@EnableRetry
public class SpringFirstApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
	}
}
