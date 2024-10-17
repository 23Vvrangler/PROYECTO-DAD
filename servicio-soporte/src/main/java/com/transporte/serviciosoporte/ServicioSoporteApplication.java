package com.transporte.serviciosoporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioSoporteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicioSoporteApplication.class, args);
    }
}
