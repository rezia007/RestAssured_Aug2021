package com.qa.tests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutCall001 {
    @Test
    public void test_01_put(){
        JSONObject request=new JSONObject();
        request.put("name","Saihaan");
        request.put("job","Student");
        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
}
