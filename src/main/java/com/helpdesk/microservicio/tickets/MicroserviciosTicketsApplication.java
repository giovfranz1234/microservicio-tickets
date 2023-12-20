package com.helpdesk.microservicio.tickets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MicroserviciosTicketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviciosTicketsApplication.class, args);
    }

}
