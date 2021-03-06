package com.its;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceGetewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceGetewayApplication.class, args);
    }

    /*@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route("path_route", r -> r.path("/about").uri("http://ityouknow.com")).build();
    }*/
}
