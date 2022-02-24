package com.shimadove.springwithwiremock;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureHttpClient;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("app.baseUrl= https://localhost:6443")
@AutoConfigureHttpClient
class SpringWithWiremockApplicationTests {

    @Test
    void contextLoads() {
    }

}
