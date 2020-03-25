package com.diyiliu.nacos.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Description: NacosConsumerBoot
 * Author: DIYILIU
 * Update: 2020-03-25 14:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerBoot {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerBoot.class, args);
    }

    @RestController
    public class TestController {

        private final RestTemplate restTemplate;

        @Autowired
        public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

        @GetMapping(value = "/echo/{str}")
        public String echo(@PathVariable String str) {
            return restTemplate.getForObject("http://nacos-provider-demo/echo/" + str, String.class);
        }
    }
}