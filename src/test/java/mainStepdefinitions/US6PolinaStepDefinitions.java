package mainStepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import mainUtilities.DriverClass;
import org.testng.Assert;

public class US6PolinaStepDefinitions {

    private WebDriver driver = DriverClass.getDriver();

    @Given("I am a web visitor")
    public void iAmAWebVisitor() {

        driver = DriverClass.getDriver();
    }

    @When("I navigate to the Lidl homepage")
    public void iNavigateToTheLidlHomepage() {
        driver.get("https://www.lidl.com");
    }

    @Then("I should be on {string}")
    public void iShouldBeOn(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("The current URL does not match the expected URL.", expectedUrl, actualUrl);
    }

    @When("I click the \"Sign In\" button on the homepage")
    public void iClickTheSignInButtonOnTheHomepage() {
        driver.findElement(By.xpath("//a[normalize-space()='sign in']")).click();
    }

    @And("I enter my email \"polya3hus@gmail.com\" and password \"LidlPassword123\"")
    public void iEnterMyEmailAndPassword() {
        driver.findElement(By.id("input0")).sendKeys("polya3hus@gmail.com");
        driver.findElement(By.id("input1")).sendKeys("LidlPassword123");
    }

    @And("I click the \"Sign In\" button on the login page")
    public void iClickTheButtonOnTheLoginPage() {
        driver.findElement(By.xpath("//a[normalize-space()='sign in']")).click();
    }

    @Then("I should confirm that the login is successful")
    public void iShouldConfirmThatTheLoginIsSuccessful() {
        boolean isLoginSuccessful = driver.findElement(By.xpath("//button[@class='clickable button profile-dropdown-button clickable--theme-flat clickable--size-auto clickable--bold-weight clickable--regular-font']")).isDisplayed();
        Assert.assertTrue(isLoginSuccessful, "Login was not successful, 'My Account' button not visible");
    }
}
