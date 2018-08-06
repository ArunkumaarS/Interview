package com.ThinkTower.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ThinkTower.*")
public class ThinkTowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinkTowerApplication.class, args);
	}
}
