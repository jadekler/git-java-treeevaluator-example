package com.example;

import com.example.config.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest("server.port:0")
public class AcceptanceTest {
    @Value("${local.server.port}")
    private int port;

	@Test
	public void algorithm() {
        get("http://127.0.0.1:" + port + "/schools?commaSeparatedGrades=Pass")
            .then().assertThat().body("size()", equalTo(1))
            .assertThat().body("get(0).id", equalTo("school id 4"));

        get("http://127.0.0.1:" + port + "/schools?commaSeparatedGrades=Pass,Fail")
            .then().assertThat().body("size()", equalTo(2))
            .assertThat().body("get(0).id", equalTo("school id 3"))
            .assertThat().body("get(1).id", equalTo("school id 4"));
	}
}
