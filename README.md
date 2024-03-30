# Technical Assessment
## _Software Developer in Test (SDET)_

### Requirement : 
Given the API: https://open.er-api.com/v6/latest/USD
Return the USD rates against multiple currency.

### Acceptance Criteria
1) API call is successful and returns valid price.
2) Check the status code and status retuned by the API response.
API could return multiple statuses like SUCCESS, FAILURE etc. Make sure this is catered for.
3) Fetch the USD price against the AED and make sure the prices are in range on 3.6 – 3.7.
4) Make sure API response time is not less then 3 seconds then current time in second.
Timestamp is returned in the API response.
5) Verify that 162 currency pairs are retuned by the API.
6) Make sure API response matches the Json schema.
Generate a schema from the API response.

### Implementation Details
- Used Maven project with TestNg framework
- Used RestAssured for BDD flow 
- Developed a framework using POJO medhodology. This helps in privatising the variables and access these easily with getter methods.
- Extent report have been used for reporting which places the result in reports/index.html
- pom.xml file contains all the dependencies and project artifacts
- testng.xml file contains the flow of testcase run and listeners 
- Maintained config.properties in r3.resource package to have all config details such as baseuri, schema file name etc.,
- r3.pojo package contains clases which has deserialization methods and variables as per POJO model
- r3.utilities package contains required uitilities such as listner calss, extent reporting and base class
- Thread local is been used to avoid overriding the report log from another testcase.

### Test Details

- fnValidatePrice : Validates the price returned in the response are of valid price. Fields and Patter matches are used to achieve this.
- fnValidateStatus : Validates status and status code. if the reponse return failure, message under error_type are logged in the report.
- fnValidateAedRate : Validates USD-AED price rate range. used pojo getter methods to access and perform validations.
- fnValidateNumOfCrncyPair : Validates number of currency pair returned from response. 
- fnValidateJsonSchema : Validates response with json schema. First schema file need to be created and place in class path. By using JsonSchemaValidator response will be validated against given schema file 
- timestamp test case is not implemented due to minor changes in an api as suggested by WenQi.
- results reports are available at reports/index.html.
