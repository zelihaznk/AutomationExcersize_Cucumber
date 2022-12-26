package stepDefinitions.Api_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class API_01_StepDefinition {
    Response response;
    @Given("automationexercise")
    public void automationexercise() {

    }

    @When("send Get request")
    public void sendGetRequest() {
        response = given().when().get("https://automationexercise.com/api/productsList");
        response.prettyPrint();
    }

    @Then("Status code is {int}")
    public void statusCodeIs(int statuscode) {
        response.then().assertThat().statusCode(statuscode);
    }

    @And("All products list")
    public void allProductsList() {

    }
}
