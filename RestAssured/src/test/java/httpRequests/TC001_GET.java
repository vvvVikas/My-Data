package httpRequests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET {
	
	@Test
	void getRequest() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification httpreq= RestAssured.given();
		
		Response response = httpreq.request(Method.GET,"/");
		 
		// print thhis response
		
		String responseBody=response.getBody().asString();
		System.out.println(responseBody);
		
		//print status code
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		
		//Get All the headers from response
		Headers allHeaders= response.headers();			//Headers is a collection	
		
		//now print it using for each loop
		for(Header header: allHeaders) {
			System.out.println(header.getName()+"   			"+header.getValue());
			
		}
	}

}
