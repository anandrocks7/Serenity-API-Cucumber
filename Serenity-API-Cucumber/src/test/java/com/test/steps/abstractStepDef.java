package com.test.steps;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class abstractStepDef {
    protected static final String BASE_URL = "http://localhost:9080/studentmgmt";
    protected  static RequestSpecification request;
    protected static Response response;
}
