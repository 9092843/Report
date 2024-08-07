package RestAPIlearning;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
public class PathAndQueryParameters {
	
    //@Test
	void pathqueryparam() {
		given()
		   .pathParam("path", "users")
		   .queryParam("page", "2")
		   .queryParam("id", "5")
		.when()
		   .get("https://reqres.in/api/{path}")
		.then()
		   .statusCode(200)
		   .log().cookies();
	}
    
    //Cookies
    @Test
    void cookies() {
    	Response res=given()
    	
    	.when()
    	   .get("https://www.google.com/");
    	
//    	String cookie_value=res.getCookie("AEC");
//    	System.out.println(cookie_value);
    	Map<String,String>cookie_values=res.getCookies();
    	for(String k:cookie_values.keySet()) {
    		
    		String cookie_value=res.getCookie(k);
    		System.out.println(k+"  ---   "+cookie_values);
    	}
    }
}
