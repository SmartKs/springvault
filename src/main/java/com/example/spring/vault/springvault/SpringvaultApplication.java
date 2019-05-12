package com.example.spring.vault.springvault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class SpringvaultApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringvaultApplication.class, args);
	}
	
	
	private final MyConfiguration configuration;

    public SpringvaultApplication(MyConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void run(String... args) throws Exception {
        Logger LOGGER = LoggerFactory.getLogger(SpringvaultApplication.class);
        LOGGER.info("----------------------------------------");
        LOGGER.info("Configuration properties");
        LOGGER.info("        example.username is {}", configuration.getUsername());
        LOGGER.info("        example.password is {}", configuration.getPassword());
        LOGGER.info("----------------------------------------");
    }

}
