package com.massahud;

import static io.restassured.RestAssured.given;

import java.util.Collections;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FooTest {

    @Test
    public void shouldReturnTheSameId() {

        given()
            .log().everything()
        .when()
            .put("http://localhost:8080/foo/{id}", Collections.singletonMap("id", "123"))
        .then()
            .body("id", Matchers.equalTo("123"));


    }

}
