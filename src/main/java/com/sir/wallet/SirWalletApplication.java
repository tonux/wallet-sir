package com.sir.wallet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SirWalletApplication {

	private static final Logger logger = LogManager.getLogger(SirWalletApplication.class);

	public static void main(String[] args) {
		logger.info("Starting application");
		SpringApplication.run(SirWalletApplication.class, args);
	}

}
