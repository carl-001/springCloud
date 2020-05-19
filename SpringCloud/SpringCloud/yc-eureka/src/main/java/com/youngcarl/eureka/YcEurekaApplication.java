package com.youngcarl.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YcEurekaApplication {

    private static final Logger logger = LoggerFactory.getLogger(YcEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(YcEurekaApplication.class, args);
        logger.info("\r----------------------------------------------EurekaServer Start Success----------------------------------------------");
    }

}
