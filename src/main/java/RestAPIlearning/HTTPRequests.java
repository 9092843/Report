package RestAPIlearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import com.google.gson.JsonObject;

import io.restassured.internal.support.FileReader;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class HTTPRequests {
	int id;
	//@Test(priority=1)
//void GetUser() {
//	 given()
//	 
//	.when()
//	   .get("https://reqres.in/api/users?page=2")
//	
//	.then()
//	   .statusCode(200)
//	   .log().all();
//}
	//@Test(priority=2)
void PostUser() {
		HashMap data= new HashMap();
		data.put("name", "vijay");
		data.put("job", "tester");
		   id= given()
		      .contentType("application/json")
		      .body(data)
			.when()
			   .post("https://reqres.in/api/users")
			   .jsonPath().getInt("id");
			
//			.then()
//			   .statusCode(201)
//			   .log().all();
	}
@Test
void jsonparsing() throws FileNotFoundException {
	File f=new File("C:\\vijayan\\student.json");
	java.io.FileReader fr = new java.io.FileReader(f);
	JSONTokener jt=new JSONTokener(fr);
	JSONObject data= new JSONObject(jt);
}


//	
//	@Test(priority=3,dependsOnMethods = {"PostUser"})
//	void UpdateUser() {
//		HashMap data= new HashMap();
//		JsonObject jo=new JsonObject();
//		XmlPath path=new XmlPath("");
//		
//		data.put("name", "TG");
//		data.put("job", "Bot");
//		    given()
//		      .contentType("application/json")
//		      .body(data)
//			.when()
//			   .put("https://reqres.in/api/users/"+id)
//			
//			.then()
//			   .statusCode(200)
//			   .log().all();
	}

//}
