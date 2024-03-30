package r3.tests;

import static io.restassured.RestAssured.given;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import r3.pojo.UsdRateGetPojo;
import r3.utilities.base;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;


public class rateTests  extends base{	
	
	private Response R1;
	private JsonPath js;
	private UsdRateGetPojo usdRateApiRes;
	SoftAssert s1 = new SoftAssert();
	
	//to validate the status code 
	@Test()
	public void fnRunUsdApi() {	
		R1 = given().spec(base.fnReqSpecBuilder())				
			.when()
				.get("v6/latest/USD")
			.then()
			.spec(base.fnResSpecBuilder())
			//Validates api response against json schema.Same is been validated as a separate test.
//			.body(matchesJsonSchemaInClasspath("Rateschema.json"))			
				.assertThat()
				.statusCode(200)    //Validates status code is 200
				.and().time(lessThan(3000L))  //validates response is less than 3 sec. 
				//As there was change in api related to timestamp, As suggested by WenQi same has been ignored.
				.extract().response();
				
		 js = new JsonPath(R1.asString());		
			 
		 usdRateApiRes = R1.as(r3.pojo.UsdRateGetPojo.class);
	}
	
	
	//to validate the valid price	
		@Test(priority =1)
		public void fnValidatePrice() throws IllegalArgumentException, IllegalAccessException {			
			
			usdRateApiRes.getRates().validatePriceRate();
		
		}
		
	
	//to validate the status and status code	
	@Test(priority =1)
	public void fnValidateStatus() {
		
		s1.assertEquals(R1.statusCode(),200);
		s1.assertEquals(usdRateApiRes.getResult(), "success","Api returns error with error_type as "+ usdRateApiRes.getError()+" : ");	//if error then assert with the value in error_type field
		s1.assertAll();
	
	}
	
	
	//to validate the USD-AED rate range
		@Test(priority =1)
		public void fnValidateAedRate() {

			double USdAedRate = (Double) usdRateApiRes.getRates().getAed();  //get the value from pojo class
			Assert.assertTrue(USdAedRate <= Double.parseDouble(prop.getProperty("aedTo")) && USdAedRate>=Double.parseDouble(prop.getProperty("aedFrom")), "USD price range against AED does not fall between rate "+prop.getProperty("aedFrom")+" to "+prop.getProperty("aedTo")+" : ");
		}
	
		
	//to validate number of currency pair
	@Test(priority =1)
	public void fnValidateNumOfCrncyPair() {
		
		String rateSize = js.getString("rates.size()");
		Assert.assertEquals(rateSize,prop.getProperty("totalCurncy"),"Number of currency pairs returned are not equal to "+prop.getProperty("totalCurncy")+" : ");
		
	}
	
	
	//to validate the currency pair count	
	@Test(priority =1)
	public void fnValidateJsonSchema() {

		//create a schema file and place under class path which is in target folder.
		MatcherAssert.assertThat("Validate response json schema",R1.getBody().asString(),JsonSchemaValidator.matchesJsonSchemaInClasspath(prop.getProperty("schemaFileName")));

	}

}
