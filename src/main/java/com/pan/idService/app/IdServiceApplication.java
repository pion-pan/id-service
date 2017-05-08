package com.pan.idService.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//该注解能激活Eureka中的DiscoveryClient实现
@EnableDiscoveryClient
@SpringBootApplication
// 配置扫描路径
@ComponentScan(basePackages = { "com.pan.idService.web" })
public class IdServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(IdServiceApplication.class).web(true).run(args);
	}

}
