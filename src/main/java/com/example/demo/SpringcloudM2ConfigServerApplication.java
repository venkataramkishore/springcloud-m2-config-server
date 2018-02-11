package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudM2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM2ConfigServerApplication.class, args);
	}
}
