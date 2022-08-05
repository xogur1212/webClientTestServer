package com.test.webClientTestServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.test")
@EntityScan("com.test")
@EnableJpaRepositories("com.test")
@EnableAspectJAutoProxy
public class WebClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
	}


}
