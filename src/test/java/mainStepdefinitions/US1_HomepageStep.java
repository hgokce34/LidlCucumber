package mainStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
//import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

import mainUtilities.DriverClass;
import org.openqa.selenium.WebDriver;

public class US1_HomepageStep {

    private WebDriver driver;

    @Given("^I am a web visitor$")
    public void i_am_a_web_visitor() {
        driver = DriverClass.getDriver();
    }

    @When("^I navigate to the Lidl homepage$")
    public void i_navigate_to_the_Lidl_homepage() {
        driver.get("https://www.lidl.com");
    }

    @Then("^I should be on \"([^\"]*)\"$")
    public void i_should_be_on(String url) {
        assertEquals(url, driver.getCurrentUrl());
    }
}

