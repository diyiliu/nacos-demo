package com.diyiliu.nacos.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: NacosGatewayBoot
 * Author: DIYILIU
 * Update: 2020-03-26 19:06
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NacosGatewayBoot {

    public static void main(String[] args) {

        SpringApplication.run(NacosGatewayBoot.class, args);
    }
}
