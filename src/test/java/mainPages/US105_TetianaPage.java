package mainPages;

import mainUtilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US105_TetianaPage extends CommonMethods {


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesFile ;

    @FindBy(xpath = "//img[@ alt='close-white description']")
    public WebElement closeSelectStore ;

    @FindBy(xpath = "//a[text()='sign in']")
    public WebElement singInLink ;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@data-test='signInButton']")
    public WebElement loginButton;

    @FindBy(className = "profile-dropdown-button-label")
    public WebElement myAccountLink;

    @FindBy(className = "profile-img-detail")
    public WebElement myAccountLink1;

    @FindBy(xpath = "//a[normalize-space()='account management']")
    public WebElement accountManagementLink;

    @FindBy(xpath = "//button[normalize-space()='delete account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//div[@class='dialog-content']")
    public WebElement confirmationMessage;

    @FindBy(xpath = "//button[@type='button'][normalize-space()='delete account']")
    public WebElement deleteAccountLast;

    @FindBy(xpath = "//div[text()='We’re sad to see you go. Don’t worry, you can always sign up for myLidl again if you find yourself missing us. Please note, it may take up to 24 hours for your account to be deleted.']")
    public WebElement lastConfirmationMessage;
}
