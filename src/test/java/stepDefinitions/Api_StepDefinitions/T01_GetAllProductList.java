package stepDefinitions.Api_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class T01_GetAllProductList {

    Response response;


    @Given("API URL {string} Request Method GET")
    public void apıURLRequestMethodGET(String apiUrl) {
        response = given().when().get(apiUrl);
    }

    @Then("Response Code {int}")
    public void responseCode(int code) {
        response.then().assertThat().statusCode(200);

    }

    @And("Response JSON All products list")
    public void responseJSONAllProductsList() {

        assertTrue((response.jsonPath()).getList("products.id").size()>0);

        System.out.println((response.jsonPath()).getList("products.id"));


    }
}
