package com.shimadove.springwithwiremock.api;

import com.shimadove.springwithwiremock.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {

    private final TestService service;

    public TestRestController(TestService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(){
        return this.service.go();
    }
}
