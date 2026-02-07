package demos;

import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Activity1 {
    String baseURL="https://petstore.swagger.io/v2";
    @Test(priority = 0)
  
    public void post()
    {
        String reqBody="""
                {
            "petId":857579,
            "name": "srihal",
            "status":"available"
                }
                """
                ;
                Response response=given().contentType(ContentType.JSON).body(reqBody).when().post(baseURL+"/pet");
                System.out.println(response.asPrettyString());

                
                response.then().statusCode(200);
       
       }
         @Test(priority = 1)
    public void get()
    {
       
        Response responseGet = given()
            .contentType(ContentType.JSON)
            .pathParam("petId",  857579)   
        .when()
            .get(baseURL + "/pet/{petId}");

        System.out.println(responseGet.asPrettyString());
                responseGet.then().statusCode(200);

    }
    @Test(priority = 2)
    public void delete()
    {
        
 Response response = given()
                .contentType(ContentType.JSON)
                .pathParam("petId", 857579) 
            .when()
                .delete(baseURL + "/pet/{petId}");

        System.out.println(response.asPrettyString());
                response.then().statusCode(200);

    }
}
