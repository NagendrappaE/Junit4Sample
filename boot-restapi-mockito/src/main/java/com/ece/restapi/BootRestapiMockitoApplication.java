package com.ece.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ece")

public class BootRestapiMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestapiMockitoApplication.class, args);
	}

}
