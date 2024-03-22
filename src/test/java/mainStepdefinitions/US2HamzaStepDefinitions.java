package mainStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mainPages.US2HamzaPages;
import mainUtilities.CommonMethods;
import mainUtilities.DriverClass;
import org.testng.Assert;

import java.sql.Driver;


public class US2HamzaStepDefinitions {

    CommonMethods commonMethods =new CommonMethods();
    US2HamzaPages hamzaPages = new US2HamzaPages();

    @Given("I navigate the Lidl website")
    public void ı_navigate_the_lidl_website() {
        DriverClass.getDriver().get("https://www.lidl.com/");

    }
    @Then("I Click On the singin button")
    public void ı_click_on_the_singin_button() {
        CommonMethods.waitTime(2);
        commonMethods.clickMethod(hamzaPages.acceptCookies);
        CommonMethods.waitTime(2);
        commonMethods.clickMethod(hamzaPages.clickAllertMessage);
        CommonMethods.waitTime(2);
        commonMethods.clickMethod(hamzaPages.clickSignInButton);
        CommonMethods.waitTime(2);
        commonMethods.clickMethod(hamzaPages.clickJoinLidl);
        CommonMethods.waitTime(2);

    }
    @Then("I click on the Join MyLidl button")
    public void ı_click_on_the_join_my_lidl_button() {
        CommonMethods.waitTime(1);
        commonMethods.clickMethod(hamzaPages.clickJoinLidl);
    }
    @Then("a user with name {string} and surname {string}")
    public void a_user_with_name_and_surname(String name, String surname) {
        CommonMethods.waitTime(1);
        commonMethods.sendKeys(hamzaPages.writeFirstName, name);
        commonMethods.sendKeys(hamzaPages.writeLastName, surname);

    }
    @Then("a user write {string} and confirm email {string}")
    public void a_user_write_and_confirm_email(String email, String corfirmEmail) {
    CommonMethods.waitTime(1);
    commonMethods.sendKeys(hamzaPages.writeEmail, email);
    CommonMethods.waitTime(1);
    Assert.assertTrue(hamzaPages.emailMessageİsDisplayed.isDisplayed());
    CommonMethods.waitTime(1);
    commonMethods.sendKeys(hamzaPages.confirmEmail, corfirmEmail);
    CommonMethods.waitTime(1);
    Assert.assertTrue(hamzaPages.mathcesEmail.isDisplayed());
    }
    @Then("I can write {string}")
    public void ı_can_write(String password) {
    CommonMethods.waitTime(1);
    commonMethods.sendKeys(hamzaPages.writePass,password );
    CommonMethods.waitTime(1);
    Assert.assertTrue(hamzaPages.passwordMessage.isDisplayed());
    CommonMethods.waitTime(2);
    }
    @Then("I can write phone {string}")
    public void ı_can_write_and(String phoneNumber) {
        CommonMethods.waitTime(2);
        commonMethods.sendKeys(hamzaPages.phoneNumber,phoneNumber);
        CommonMethods.waitTime(2);
        Assert.assertTrue(hamzaPages.phoneNumberMessage.isDisplayed());

    }
    @Then("I can write zipcode {string}")
    public void ı_can_write_zipcode(String zipcode) {
        CommonMethods.waitTime(1);
        commonMethods.sendKeys(hamzaPages.zipCode,zipcode);
        CommonMethods.waitTime(1);
        Assert.assertTrue(hamzaPages.zipCodeMessage.isDisplayed());
    }

    @Then("I can write birthday {string}")
    public void ı_can_write_birthday(String birthday) {
    CommonMethods.waitTime(1);
    commonMethods.sendKeys(hamzaPages.birthdayDate, birthday);
    }
    @Then("I can write address {string}")
    public void ı_can_write_address(String adress) {
    CommonMethods.waitTime(1);
    commonMethods.sendKeys(hamzaPages.adressTextBox, adress);
    }

    @Then("I can write city {string}")
    public void ı_can_write_city(String city) {
    CommonMethods.waitTime(1);
    commonMethods.sendKeys(hamzaPages.cityTextBox, city);
    }
    @Then("I can write state {string}")
    public void ı_can_write_state(String state) {
    CommonMethods.waitTime(1);
    commonMethods.sendKeys(hamzaPages.stateTextBox , state);
    }

    @Then("I can click JoinMyLidl")
    public void ı_can_click_join_my_lidl() {
        CommonMethods.waitTime(1);
        commonMethods.clickMethod(hamzaPages.clickJoinLidl);
    }
    @Then("I can click signOut button")
    public void ı_can_click_sign_out_button() {
        CommonMethods.waitTime(1);

    }
}
