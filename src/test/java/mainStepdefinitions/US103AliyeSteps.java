package mainStepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mainPages.US103AliyePage;
import mainUtilities.CommonMethods;
import mainUtilities.DriverClass;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class US103AliyeSteps {
    US103AliyePage page = new US103AliyePage();

    @Given("i navigate to lidl homepage")
    public void i_navigate_to_lidl_homepage() {
        DriverClass.getDriver().get("https://www.lidl.com/");
    }

    //login successfully
    @Given("i click on signIn button on homepage")
    public void iClickOnSignInButtonOnHomepage() {
        CommonMethods.waitTime(3);
        page.clickElement(page.cookiesBtn);
        page.clickElement(page.closeJoinLidlFrame);
        CommonMethods.waitTime(1);
        page.clickElement(page.signInBtnHomePage);
    }

    @Then("I enter username and password")
    public void iEnterUsernameAndPassword(DataTable loginData) {
        List<String> toLogin = loginData.asList(String.class);
        page.sendKeys(page.signInEmailTextBox, toLogin.get(0));
        CommonMethods.waitTime(1);
        page.sendKeys(page.signInPasswordTextBox, toLogin.get(1));
        CommonMethods.waitTime(1);
        page.clickElement(page.signInSignInBtn);
    }

    // update user information
    @Then("i click on myAccount to edit my account")
    public void iClickOnMyAccountToEditMyAccount() {
        page.clickElement(page.myAccountDropDownList);
        CommonMethods.waitTime(1);
        page.clickElement(page.clickToEdit);
    }

    @And("i enter to change my firstname and lastname")
    public void iEnterToChangeMyFirstnameAndLastname(DataTable newData) {
        List<String> userData = newData.asList(String.class);
        page.sendKeys(page.firstNameToChange, userData.get(0));
        CommonMethods.waitTime(1);
        page.sendKeys(page.lastNameToChange, userData.get(1));
        CommonMethods.waitTime(1);
       /*page.scrollToElement(page.stateList);
        page.clickElement(page.stateList);
        CommonMethods.waitTime(2);
        Select state = new Select(page.stateList);
        state.selectByVisibleText("Alaska");
        CommonMethods.waitTime(1); */
    }

    @Then("i click on save button")
    public void iClickOnSaveButton() {
        CommonMethods.waitTime(1);
        page.clickElement(page.saveButton);
    }

    @And("i should see and verify the updated message")
    public void iShouldSeeAndVerifyTheUpdatedMessage() {
        CommonMethods.waitTime(1);
        Assert.assertTrue(page.updateMessage.isDisplayed());
        Assert.assertTrue(page.updatedUsername.isDisplayed());
    }
}
