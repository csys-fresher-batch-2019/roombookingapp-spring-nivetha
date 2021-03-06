package com.nive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@ServletComponentScan("com.nive.hotelroom.servlet")
public class SpringhotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhotelApplication.class, args);
	}

}
