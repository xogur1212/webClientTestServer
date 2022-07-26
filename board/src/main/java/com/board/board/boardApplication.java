package com.board.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.board")
@EntityScan("com.board")
@EnableJpaRepositories("com.board")
public class boardApplication {
	public static void main(String[] args) {
		SpringApplication.run(boardApplication.class, args);
	}


}
