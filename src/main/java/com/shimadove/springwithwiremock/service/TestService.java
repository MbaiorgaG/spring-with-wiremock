package com.shimadove.springwithwiremock.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestService {

    private final RestTemplate restTemplate;

    @Value("${app.baseUrl:https://prettier.io}")
    private String base;


    public TestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public String go(){
        return this.restTemplate.getForEntity(this.base + "/docs/en/plugins.html",String.class).getBody();
    }
}
