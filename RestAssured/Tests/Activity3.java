package demos;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Order;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import java.io.File;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;
public class Activity3 {

    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;
    @BeforeClass
    public void setup() {
        requestSpec = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setBaseUri("https://petstore.swagger.io/v2/pet")
            .build();

        responseSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON)
            .expectStatusCode(200)
            .build();
    }
    @DataProvider(name = "details")
    public Object[][] pet_details()
    {
        return new Object[][]
        {
            
                {384739,"Rilley","available"},
                {746282,"Hansel","available"}
        };
    }
    @Test(priority = 0)
    public void post()
    {
       File file=new File("src/test/resources/input3.json");
       File file2=new File("src/test/resources/input3Hansel.json");

                Response response=given().spec(requestSpec).body(file).when().post();
                Response response2=given().spec(requestSpec).body(file2).when().post();
                System.out.println(response.asPrettyString());

                
                response.then().spec(responseSpec);
                response2.then().spec(responseSpec);
       
       }

    /*@Test(dataProvider = "details")     
    public void get_user(long id,String name,String status)
    {
        Response responseGet = given().spec(requestSpec).pathParam("id", id)
        .when()
            .get("/{name}");
        //System.out.println(responseGet.asPrettyString());
                responseGet.then().spec(responseSpec);
                responseGet.then().body("id", 384739);
                responseGet.then().body("status", "alive");

    }*/
   @Test(dataProvider = "details",priority = 1)
public void get_user(long petid, String name, String status) {

    Response responseGet =
        given()
            .spec(requestSpec).pathParam("id", petid)
        .when()
            .get("/{id}");
   System.out.println(responseGet.asPrettyString());
    responseGet
        .then()
            .spec(responseSpec)
             .body("name", equalTo(name))
            .body("id", equalTo((int)petid))
            .body("status", equalTo("available"));
}

   @Test(dataProvider = "details",priority = 2)
      @Order(3)
    public void delete(long id,String name,String status)
    {
        
  Response responseDel = given().spec(requestSpec).pathParam("id", id)
        .when()
            .delete("/{id}");
        
                responseDel.then().spec(responseSpec);

    }
}
