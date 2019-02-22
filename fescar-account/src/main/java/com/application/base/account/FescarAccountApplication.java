package com.application.base.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 孤狼
 * @desc: 服务启动.
 */
@MapperScan(basePackages = "com.application.base.*.dao")
@SpringBootApplication
public class FescarAccountApplication {
	
	/**
	 * springboot 启动入口.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FescarAccountApplication.class, args);
	}
	
}
