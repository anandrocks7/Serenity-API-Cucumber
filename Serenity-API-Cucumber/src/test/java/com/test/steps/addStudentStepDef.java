package com.test.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.util.Map;

import static com.test.payloads.PayloadFactory.createStudentPayload;
import static io.restassured.RestAssured.given;



public class addStudentStepDef extends abstractStepDef{

   // private static String token="e0ee6aeeaa2e08e4daa2dad964f6b0d34df8be3b26a151ea3d37fee097dc0b2c";

    /*@Given("^User sets base url for API request$")
    public void user_sets_base_API_request_URL() {
        RestAssured.baseURI= BASE_URL;
    }
*/
    @When("^user sends the API request with new student details$")
    public void postStudentDetails(Map<String, String> data) {
           // String body= createUserPayload(data).toJSONString();
        JSONObject body;
         body=createStudentPayload(data);
            System.out.println("string body is :: "+body.toString());
               request= given()
                       .header("Content-Type", "application/json")
                               .body(body);
        System.out.println("***request "+request.toString());
        response = request.when().post("/addStudent");
        System.out.println("**Response ** "+ response);
        System.out.println("**Response is :: "+response.asString());

    }

    @Then("^response should contain the status code$")
    public void response_should_contain_the_status_code(Map<String, String> data) {
        System.out.println("***"+response.getStatusCode());
        Assert.assertEquals(data.get("status"), String.valueOf(response.getStatusCode()));
    }


}
