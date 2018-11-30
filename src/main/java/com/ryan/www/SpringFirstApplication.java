package com.ryan.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ryan.www.dao")
@EnableCaching
public class SpringFirstApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
	}
}
