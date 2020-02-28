package com.springg.springhotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
@ServletComponentScan("com.onlineroom")
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class SpringhotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhotelApplication.class, args);
	}

}
