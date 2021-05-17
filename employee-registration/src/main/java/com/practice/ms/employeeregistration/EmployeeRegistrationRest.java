package com.practice.ms.employeeregistration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empReg")
public class EmployeeRegistrationRest {

    @GetMapping("/health")
    public String healthCheck(){
        return "Up and running";
    }
}
