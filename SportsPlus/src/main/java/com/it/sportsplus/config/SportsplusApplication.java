package com.it.sportsplus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.thinkxfactor.zomatoplus.models.User;

@SpringBootApplication
@ComponentScan("com.it")
@EnableJpaRepositories(basePackages = "com.it")
@EntityScan("com.it")  
public class SportsplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsplusApplication.class, args);
	}
}
