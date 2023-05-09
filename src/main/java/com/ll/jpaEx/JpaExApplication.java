package com.ll.jpaEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaExApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExApplication.class, args);
	}

}
