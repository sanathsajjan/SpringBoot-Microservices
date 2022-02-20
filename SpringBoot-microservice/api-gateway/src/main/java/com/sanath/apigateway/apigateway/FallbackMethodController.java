package com.sanath.apigateway.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @RequestMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User service is down, taking more than expected time.. Please try again later..";
    }

    @RequestMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod(){
        return "Department service is down, taking more than expected time.. Please try again later..";
    }
}
