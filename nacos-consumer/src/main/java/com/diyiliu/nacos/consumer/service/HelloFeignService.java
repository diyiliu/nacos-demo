package com.diyiliu.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description: HelloFeignService
 * Author: DIYILIU
 * Update: 2020-03-26 10:44
 */

@FeignClient(name = "github-client", url = "https://api.github.com")
public interface HelloFeignService {

    @GetMapping("/search/repositories")
    String searchRepo(@RequestParam("q") String queryStr);
}
