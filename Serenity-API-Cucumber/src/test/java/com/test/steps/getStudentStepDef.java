package com.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class getStudentStepDef extends abstractStepDef {

    //NOtes::***************
/*   given() :: set cookies, add auth, add param, set headers etc
    when() ::  get , post, put, delete..
    then() ::  validate status code, extract response, extract headers cookies, response body*/
   //*************************************************

    @Given("^User sets base url for API request$")
    public void user_sets_base_API_request_URL() {
        RestAssured.baseURI= BASE_URL;
    }

    @When("^user sends the API request to fetch students$")
    public void getResquestToFetchStudentDetails() {
       // RestAssured.baseURI= BASE_URL;
        //1 )
/*        RequestSpecification request= RestAssured.given();
        request.header("Authorization", "Bearer " + token);
        response = request.get("/users/4105");
        //request.header("Content-Type", "application/json");*/

        //2)
      /*  response =given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .get("/users/4105") ;*/

        //3)
        request = given()
                .header("Content-Type", "application/json");

        response = request.get("/fetchStudents").then().extract().response();

        System.out.println(response);
        System.out.println("***"+response.asString());

    }

    @Then("^response should contain status code$")
    public void status_code_is() {
        System.out.println("***"+response.getStatusCode());
        Assert.assertEquals(200, response.getStatusCode());
    }

}
