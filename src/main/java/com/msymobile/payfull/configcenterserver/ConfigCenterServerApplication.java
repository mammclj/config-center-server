package com.msymobile.payfull.configcenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterServerApplication.class, args);
	}
}
