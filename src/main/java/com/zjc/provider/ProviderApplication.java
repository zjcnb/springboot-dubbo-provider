package com.zjc.provider;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderApplication {


	public static void main(String[] args) {
		
		// start embedded zookeeper server
		new EmbeddedZooKeeper(2181, false).start();

		
		SpringApplication.run(ProviderApplication.class, args);
	}
	
}
