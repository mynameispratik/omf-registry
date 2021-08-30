package com.tastyfood.omf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OmfRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmfRegistryApplication.class, args);
	}

}
