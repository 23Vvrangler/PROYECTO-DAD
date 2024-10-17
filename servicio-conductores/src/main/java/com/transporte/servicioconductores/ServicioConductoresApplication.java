package com.transporte.servicioconductores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioConductoresApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicioConductoresApplication.class, args);
    }
}
