package com.atgugu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenrentong
 * @create 2021-12-01 0:05
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002 {

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaMain7002.class,args);
    }

}
