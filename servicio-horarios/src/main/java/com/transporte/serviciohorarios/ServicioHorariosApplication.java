package com.transporte.serviciohorarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioHorariosApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicioHorariosApplication.class, args);
    }
}
