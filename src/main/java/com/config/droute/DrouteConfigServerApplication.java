package com.config.droute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DrouteConfigServerApplication {

	private static final Logger logger = LoggerFactory.getLogger(DrouteConfigServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DrouteConfigServerApplication.class, args);
		logger.info("Droute Config ServerApplication started successfully.");
	}

}
