package r3.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.response.Response;
import r3.pojo.UsdRateGetPojo;



public class base {
	
	protected Properties prop;
	
	@BeforeSuite
	public void configTest() throws FileNotFoundException, IOException {
		
		prop = new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\r3\\resource\\config.properties"));
				
		RestAssured.baseURI = prop.getProperty("baseUri");
		
		
	}
	
	
	public static RequestSpecification fnReqSpecBuilder() {
		
		RequestSpecification reqSpec = new RequestSpecBuilder().log(LogDetail.ALL).setRelaxedHTTPSValidation().setUrlEncodingEnabled(false).build();
		return reqSpec;
	}
	
	public static ResponseSpecification fnResSpecBuilder() {
		
		ResponseSpecification reqSpec = new ResponseSpecBuilder().log(LogDetail.ALL).build();
		return reqSpec;
	}
	
}
