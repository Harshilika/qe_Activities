package demos;

import static io.restassured.RestAssured.given;

//import org.junit.jupiter.api.Order;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import java.io.File;
public class Activity2 {
    String baseURL="https://petstore.swagger.io/v2";
    long id=987654;
    @Test(priority = 0)
    public void post_user()
    {
       File file=new File("src/test/resources/input.json");
        Response response_post=given().contentType(ContentType.JSON).body(file).when()
        .post(baseURL+"/user");
         System.out.println(response_post.asPrettyString());
         response_post.then().statusCode(200);

    }
    @Test (priority = 1)
     //@Order(2)
    public void get_user()
    {
         Response response_get=given().contentType(ContentType.JSON).pathParam("username","Harshilika")
         .when()
         .get(baseURL+"/user/{username}");
         System.out.println(response_get.asPrettyString());
         response_get.then().statusCode(200);

    }
    @Test (priority = 2)
     //@Order(3)
    public void delete_user()
    {
         Response response_get=given().contentType(ContentType.JSON).pathParam("username","Harshilika")
         .when()
         .delete(baseURL+"/user/{username}");
         System.out.println(response_get.asPrettyString());
         //response_get.then().statusCode(200);
          Response response_getD=given().contentType(ContentType.JSON).pathParam("username","Harshilika")
         .when()
         .get(baseURL+"/user/{username}");
         response_getD.then().statusCode(404);
    }
}
