package com.importsource.cloud.eureka;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhuofan
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableAutoConfiguration
@EnableZuulProxy
public class Application {
    @RequestMapping("/")
    public String home() {
       // try {
      //      Thread.sleep(6000);
     //   } catch (InterruptedException e) {
       //     e.printStackTrace();
      //  }
        return "Hello world";

    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}