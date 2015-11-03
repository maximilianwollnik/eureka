/*
 * Copyright (c) 2015, Maximilian Wollnik, All rights reserved.
 */
package de.maximilianwollnik.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka for my homepage
 * 
 * @author maximilian
 * @version 1.0
 * @since 0.1.0
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class Application {

    /**
     * The main method.
     * 
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
