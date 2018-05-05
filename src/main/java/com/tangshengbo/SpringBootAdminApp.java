package com.tangshengbo;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Tangshengbo on 2018/5/5
 */
@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminApp {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootAdminApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApp.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }
}
