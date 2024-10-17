package com.transporte.serviciorutas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioRutasApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicioRutasApplication.class, args);
    }
}
