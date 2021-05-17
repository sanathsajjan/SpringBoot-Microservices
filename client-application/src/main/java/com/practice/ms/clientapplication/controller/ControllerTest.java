package com.practice.ms.clientapplication.controller;

import com.practice.ms.clientapplication.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/test")
public class ControllerTest {

    @Autowired
    private ServiceTest serviceTest;

    @GetMapping("/healthOfEmpReg")
    public String getHealthOfEmpReg() throws URISyntaxException {
        return serviceTest.invokeEmpRegHealth();
    }
}
