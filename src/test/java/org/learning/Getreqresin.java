package org.learning;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;

/**
 * Unit test for simple App.
 */
public class Getreqresin {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void getReqReqresin() {
        JsonPath baseURL = JsonPath.given("https://reqres.in/");
        String json = "json";
        Response res = given().baseUri("https://reqres.in/").header("Content-Tye","tex/json")
                .when().get("/api/users?page=2")
                .then().statusCode(200).log().body().extract().response();
    }
}
