package com.qa.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class DeleteCall001 {
    @Test
    public void test_01_delete(){
        when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).log().all();
    }

}
