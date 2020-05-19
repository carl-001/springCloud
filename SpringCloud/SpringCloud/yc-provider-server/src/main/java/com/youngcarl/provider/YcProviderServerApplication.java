package com.youngcarl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YcProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YcProviderServerApplication.class, args);
    }

}
