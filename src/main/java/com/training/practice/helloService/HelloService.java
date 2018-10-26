package com.training.practice.helloService;

import com.training.practice.helloService.client.BugsClient;
import com.training.practice.helloService.domain.Bug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class HelloService {

    @Autowired
    DiscoveryClient client;

    @Autowired
    BugsClient bugsClient;

    public String getServiceURI(){
        List<ServiceInstance> list = client.getInstances("hello");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;

    }

    public List<Bug> getBacklogBugs(){
        return bugsClient.getBacklogBugs();
    }
}
