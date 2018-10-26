package com.training.practice.helloService;

import com.training.practice.helloService.domain.Bug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {



    @Autowired
    HelloService service;

    @RequestMapping("/hi")
    public String sayHello(){
        return "Hello World";
    }

    @RequestMapping("/instance")
    public String getUri(){
        return service.getServiceURI();
    }


    @RequestMapping("/backlog")
    public List<Bug> getBacklogBugs(){
        return service.getBacklogBugs();
    }
}
