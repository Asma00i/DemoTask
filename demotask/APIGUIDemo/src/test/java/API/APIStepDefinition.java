package API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.RestAssured;
import org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class APIStepDefinition {


    @Given("we have URL to query about airline data")
    public void weHaveURLToQueryAboutAirlineData() {
        given()
                .when()
                .get("https://reqres.in/")
                .then()
                .statusCode(200).assertThat()
                .header("Server", "nginx")
                .contentType(ContentType.HTML);
    }



    @Then("response should be returned with full data about airline details in jason format")
    public void responseShouldBeReturnedWithFullDataAboutAirlineDetailsInJasonFormat() {

    }

    @Given("we have URL to query about available hotels")
    public void weHaveURLToQueryAboutAvailableHotels() {
        given()
                .when()
                .get("http://engine.hotellook.com/api/v2/search/start.json?checkIn=2020-08-01&checkOut=2020-08-23&adultsCount=2&customerIP=188.42.198.244&childrenCount=1&lang=en&currency=EUR&waitForResult=0&marker=78606&signature=e82332a132119bdd91c026edf1b19263&cityId=3288")
                .then()
//                .log().body()
                .statusCode(400).assertThat()
                .body("message", equalTo("CheckIn date must not be less than today"))
                .contentType(ContentType.JSON);
    }

    @Then("response should be returned with error message")
    public void responseShouldBeReturnedWithErrorMessage() {
    }

    @When("send get request to server")
    public void sendGetRequestToServer() {

    }
}
