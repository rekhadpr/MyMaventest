package restPrograms;



	import org.testng.Assert;   //used to validate response status 
	import org.testng.annotations.Test;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class TestResponse {
		
	          @Test
	              public void GetBookDetails()
	       {  
	           // Specify the base URL to the RESTful web service
	           RestAssured.baseURI = "https://reqres.in/api/users?page=2";
	           // Get the RequestSpecification of the request to be sent to the server
	           RequestSpecification httpRequest = RestAssured.given();

	           Response response = httpRequest.get("");

	           // Get the status code of the request. 
	           //If request is successful, status code will be 200
	          int statusCode = response.getStatusCode();
	          System.out.println(statusCode);

	           // Assert that correct status code is returned.
	          Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
	            "Correct status code returned");

	    }
	
}
