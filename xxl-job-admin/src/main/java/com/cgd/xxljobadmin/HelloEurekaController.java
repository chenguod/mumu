package com.cgd.xxljobadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class HelloEurekaController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("testPort")
    public String testPort() {
        // 根据服务名获取实例列表
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("xxl-job-admin");
        ServiceInstance serviceInstance = serviceInstances.get(0);
        return "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }
}
