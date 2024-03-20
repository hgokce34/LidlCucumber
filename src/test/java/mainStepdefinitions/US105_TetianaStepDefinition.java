package mainStepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mainPages.US105_TetianaPage;
import mainUtilities.CommonMethods;
import mainUtilities.DriverClass;

import java.util.List;

public class US105_TetianaStepDefinition  {

  US105_TetianaPage page = new US105_TetianaPage();

    @Given("I navigate to Lidl page")
    public void i_navigate_to_lidl_page() {
        DriverClass.getDriver().get(" https://www.lidl.com/");
        page.waitTime(1);
    }

    @Given("I close the cookies and green notification of choosing  a store")
    public void i_close_the_cookies_and_green_notification_of_choosing_a_store() {
        page.waitTime(2);
        page.clickElement(page.closeSelectStore);
        page.actionClick(page.cookiesFile);

    }

    @Then("I press sing in link")
    public void i_press_sing_in_link() {
        page.waitTime(1);
        page.actionClick(page.singInLink);
    }

    @Then("I enter a valid email and password")
    public void i_enter_a_valid_email_and_password(DataTable dataTable) {
        List<String> listOfData = dataTable.asList();
        page.waitTime(2);
        page.sendKeys(page.emailTextBox,listOfData.get(0));
        page.waitTime(2);
        page.sendKeys(page.passwordTextBox,listOfData.get(1));

    }

    @Then("I press sing in button")
    public void i_press_sing_in_button() {
        page.waitTime(2);
        page.clickElement(page.loginButton);
    }

    @Then("I press on my account and choose my account")
    public void i_press_on_my_account_and_choose_my_account() {
        page.waitTime(1);
        page.clickElement(page.myAccountLink);
        page.clickElement(page.myAccountLink1);
    }

    @Then("I press on account management link")
    public void i_press_on_account_management_link() {
        page.waitTime(2);
        page.clickElement(page.accountManagementLink);
    }

    @Then("I choose delete account button")
    public void i_choose_delete_account_button() {
        page.waitTime(2);
        page.clickElement(page.deleteAccountButton);

    }

    @Then("I should see the confirmation message of deleting account")
    public void i_should_see_the_confirmation_message_of_deleting_account() {
        page.waitTime(2);
        page.isWebElementDisplayed(page.confirmationMessage);
    }

    @Then("I press delete button")
    public void i_press_delete_button() {
    // page.clickElement(page.deleteAccountLast);

    }

    @Then("I should see the last confirmation notice about deleting account")
    public void iShouldSeeTheLastConfirmationNoticeAboutDeletingAccount() {
    page.isWebElementDisplayed(page.lastConfirmationMessage);
    }
}
