package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy   //开启 uul 的功能
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulClientApplication.class, args);
	}
}
