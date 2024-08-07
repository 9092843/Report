package RestAPIlearning;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//Serilization - Pojo --> Json 
//DeSerilization - Json --> Pojo

public class SerilizationDeSerilization {

	@Test
	void Serilization() {
		ObjectMapper mapper = new ObjectMapper();
		
	}
}
