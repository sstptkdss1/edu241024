package com.kt.edu.firstproject;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FirstprojectApplication {

	private static Logger logger = Logger.getLogger(FirstprojectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");

	}

}
