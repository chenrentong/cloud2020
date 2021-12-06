package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenrentong
 * @create 2021-11-17 21:26
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002 {
    public static void main(String[] args){

        SpringApplication.run(PaymentMain8002.class,args);
    }
}
