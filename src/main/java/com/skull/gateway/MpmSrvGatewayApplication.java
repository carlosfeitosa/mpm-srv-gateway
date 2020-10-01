package com.skull.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Main class for api gateway.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com
 * @since 2020-09-29
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MpmSrvGatewayApplication { // NOPMD by skull on 9/30/20, 10:53 PM

	/**
	 * Main class constructor.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MpmSrvGatewayApplication.class, args);
	}

}
