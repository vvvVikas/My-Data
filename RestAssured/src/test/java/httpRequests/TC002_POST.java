package httpRequests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST {
	@Test
	void postRequest() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpreq= RestAssured.given();
		
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("name","morpheus");
		requestParams.put("job","leader");
		 
		
		
		
		httpreq.header("Content-Type", "application/json");
		httpreq.body(requestParams.toJSONString());
		
		Response response = httpreq.request(Method.POST,"/");
		
		
		// print thhis response
		
		String responseBody=response.getBody().asString();
		System.out.println(responseBody);
		
		
	}

}
