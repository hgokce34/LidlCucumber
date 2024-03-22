package mainStepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import mainUtilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class US6PolinaStepDefinitions {

    private WebDriver driver = DriverClass.getDriver();

    @Given("I access the web as a visitor")
    public void iAccessTheWebAsAVisitor() {
        driver = DriverClass.getDriver();
    }

    @When("I proceed to the Lidl main page")
    public void iProceedToTheLidlMainPage() {
        driver.get("https://www.lidl.com");
    }

    @Then("I expect to be at {string}")
    public void iExpectToBeAt(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
       // Assert.assertEquals("The current URL does not match the expected URL.", expectedUrl, actualUrl);
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='sign in']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    @Then("I should confirm that the login is successful")
    public void iShouldConfirmThatTheLoginIsSuccessful() {
        boolean isLoginSuccessful = driver.findElement(By.xpath("//span[@class='profile-dropdown-button-label ']")).isDisplayed();
        Assert.assertTrue(isLoginSuccessful, "Login was not successful, 'My Account' button not visible");
    }
}
