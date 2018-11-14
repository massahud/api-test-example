package com.massahud;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldSaluteInJson() {

        given()
            .accept(ContentType.JSON)
        .when()
            .get("http://localhost:8080/")
        .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("message", equalTo("Hello World"));
    }

}
