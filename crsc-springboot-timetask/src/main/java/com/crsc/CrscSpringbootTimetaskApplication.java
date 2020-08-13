package com.crsc;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.crsc")
@MapperScan("com.crsc.mapper")
@EnableScheduling
public class CrscSpringbootTimetaskApplication {

	private static final Logger LOG = LoggerFactory.getLogger(CrscSpringbootTimetaskApplication.class);
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CrscSpringbootTimetaskApplication.class);
		ConfigurableEnvironment env = app.run(args).getEnvironment();
		LOG.info("项目启动！端口号：" + env.getProperty("server.port"));
	}

}
