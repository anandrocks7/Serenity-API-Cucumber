package com.test.payloads;


import org.json.simple.JSONObject;

import java.util.Map;

public class PayloadFactory {

    /*public JSONObject createUserProfilePayload(Map<String, String> data) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", data.get("id"));
        requestBody.put("idType", data.get("idType"));
        return requestBody;
    }*/
   /* public JSONObject createVerifyAuthChallengePayload(Map<String, String> data) {
        JSONObject requestBody = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        requestBody.put("id", data.get("EmailId"));
        requestBody.put("challengeDetails", jsonArray);
        JSONObject arrayRequestBody = new JSONObject();
        arrayRequestBody.put("id", data.get("ChallengeId"));
        arrayRequestBody.put("value", data.get("Value"));
        jsonArray.add(arrayRequestBody);
        return requestBody;
    }*/
    public static JSONObject createStudentPayload(Map<String,String> data){
        JSONObject requestBody= new JSONObject();
        requestBody.put("firstName", data.get("firstName"));
        requestBody.put("id", data.get("id"));
        requestBody.put("lastName", data.get("lastName"));
        requestBody.put("nationality", data.get("nationality"));
        requestBody.put("studentClass", data.get("studentClass"));
        System.out.println("%% :: "+ requestBody);
        return requestBody;
    }
    public static JSONObject updateUserPayload(Map<String,String> data){
        JSONObject requestBody= new JSONObject();
        requestBody.put("name", data.get("name"));
        requestBody.put("gender", data.get("gender"));
        requestBody.put("email", data.get("email"));
        requestBody.put("status", data.get("status"));
        System.out.println("updateprint :: "+ requestBody);
        return requestBody;
    }
}
