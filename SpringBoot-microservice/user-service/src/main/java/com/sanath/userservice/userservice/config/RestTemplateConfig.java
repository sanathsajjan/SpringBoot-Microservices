package com.sanath.userservice.userservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate configuration to access other services...
 */
@Configuration
public class RestTemplateConfig {

    @Bean("restTemplate")
    //Loadbalanced annotation will be used to load the balancing among multiple instances.
    //We can access the server by server application name
    @LoadBalanced//Load balanced when we use service registry(eureka), should be added otherwise will get 500
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
