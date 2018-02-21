package com.aj.zuulservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(ZuulServiceApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZuulServiceApplication.class,args);
        logger.info("Zuul Service is up and running...");
	}
}
