package com.sanath.userservice.userservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean("restTemplate")
    @LoadBalanced//Load balanced when we use service registry(eureka), should be added otherwise will get 500
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
