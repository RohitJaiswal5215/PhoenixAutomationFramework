package com.api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiTests extends BaseTest {
    private static int createdEmployeeId;

    @Test(priority = 1)
    public void testGetEmployees() {
        Response response = given().spec(requestSpec)
                .when().get("/employees")
                .then().statusCode(200).extract().response();

        Assert.assertEquals(response.jsonPath().getString("status"), "success");
        Assert.assertTrue(response.jsonPath().getList("data").size() > 0,
                "Employee list should not be empty");
    }

    @Test(priority = 2)
    public void testCreateEmployee() {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("name", "RohitTest");
        requestBody.put("salary", "50000");
        requestBody.put("age", "27");

        Response response = given().spec(requestSpec).body(requestBody)
                .when().post("/create")
                .then().statusCode(200).extract().response();

        Assert.assertEquals(response.jsonPath().getString("status"), "success");

        createdEmployeeId = response.jsonPath().getInt("data.id");
        Assert.assertTrue(createdEmployeeId > 0, "Employee ID should be created");
    }

    @Test(priority = 3, dependsOnMethods = "testCreateEmployee")
    public void testDeleteEmployee() {
        Response response = given().spec(requestSpec)
                .when().delete("/delete/" + createdEmployeeId)
                .then().statusCode(200).extract().response();

        Assert.assertEquals(response.jsonPath().getString("status"), "success");
        Assert.assertTrue(response.jsonPath().getString("message").contains("deleted"));
    }
}
