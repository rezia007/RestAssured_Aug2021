package com.qa.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class GetCall002 {
    @Test
    public void test_numberOfCircuitsFor2017_Season(){
        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                statusCode(200).
                and().
                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).log().all().
                and().
                header("content-length",equalTo("4551"));
    }
}
