package httpRequests;

import java.io.IOException;
import java.net.http.HttpRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ExcelData;

public class TC003_POST_DataDriven {
	
	//{"name":"test","salary":"123","age":"23"}

	@Test (dataProvider="empDataprovider")
	public void dataDriven(String eName, String eSalary, String eAge) {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RequestSpecification httpreq= RestAssured.given();
		JSONObject requestBody= new JSONObject();  // need to pass the body for POST method with JSONObject class instance
		requestBody.put("name", eName);
		requestBody.put("salary", eSalary);
		requestBody.put("age", eAge);
		
		//now convert this body to json format
		httpreq.body(requestBody.toJSONString());
		
		//now get the response 
		Response res= httpreq.request(Method.POST,"/create");
		
		String responseBody= res.getBody().asString();
		System.out.println(responseBody);
		
	}
	@DataProvider(name="empDataprovider")
	public static String[][] getData() throws IOException {
		
		//String empData[][]= {{"abcd","2100","25"},{"aabb","2200","27"}};
		
		String empData[][]=new String [4][2];
		for (int i=1; i<=4;i++) {
			for (int j=0; j<=2;j++) {
				System.out.println(ExcelData.readData(i, j));

				empData[i-1][j]=ExcelData.readData(i, j);
							
			}
		}
		
		
		return (empData);
	}
	
	
}