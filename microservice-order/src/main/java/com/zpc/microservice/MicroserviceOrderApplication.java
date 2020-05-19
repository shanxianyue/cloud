package com.zpc.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOrderApplication.class, args);
    }

    /**
     * 向Spring容器中定义RestTemplate对象
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
