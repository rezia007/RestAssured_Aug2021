package com.qa.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCall003 {
    @Test
    public void testResponsecode(){
        Response response= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
        int code=response.getStatusCode();
        System.out.println("Status Code: "+code);
        Assert.assertEquals(code,200);
    }
    @Test
    public void testBody(){
        Response response= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
        String data=response.asString();
        System.out.println("Data is: "+data);
    }
}
