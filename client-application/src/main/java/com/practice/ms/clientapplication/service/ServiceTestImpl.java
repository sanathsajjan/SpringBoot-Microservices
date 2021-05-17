package com.practice.ms.clientapplication.service;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

@Service
public class ServiceTestImpl implements ServiceTest {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @Override
    public String invokeEmpRegHealth() throws URISyntaxException {
        Application application = eurekaClient.getApplication("employee-registration");
        InstanceInfo info = application.getInstances().get(0);
        System.out.println(info.getHostName());
        System.out.println(info.getPort());
//        URI emRegURI = new URI("");
//        restTemplate.
        return info.getHostName();
    }
}
