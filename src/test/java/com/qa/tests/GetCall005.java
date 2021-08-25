package com.qa.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetCall005 {
    @Test
    public void testcase_1_get(){
        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                body("data.id[1]",equalTo(8)).
                log().all();
    }
}
