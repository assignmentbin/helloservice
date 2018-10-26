package com.training.practice.helloService.client;


import com.training.practice.helloService.domain.Bug;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("bugs")
public interface BugsClient {

    @RequestMapping("/bugs/backlog")
    List<Bug> getBacklogBugs();

}
