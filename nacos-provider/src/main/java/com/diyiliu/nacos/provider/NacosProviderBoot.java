package com.diyiliu.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: NacosProviderBoot
 * Author: DIYILIU
 * Update: 2020-03-25 12:12
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProviderBoot {

    public static void main(String[] args) {

        SpringApplication.run(NacosProviderBoot.class, args);
    }

    @RestController
    public class NacosProviderController{

        @RequestMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return "Hello[你好] Nacos Discovery " + string;
        }

    }
}
