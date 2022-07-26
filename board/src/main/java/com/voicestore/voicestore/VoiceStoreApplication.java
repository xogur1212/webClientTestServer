package com.voicestore.voicestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.voicestore")
@EntityScan("com.voicestore")
@EnableJpaRepositories("com.voicestore")
public class VoiceStoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(VoiceStoreApplication.class, args);
	}


}
