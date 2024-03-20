package mainPages;

import mainUtilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US103AliyePage extends CommonMethods {
    // handle cookies and login successfully
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesBtn;
    @FindBy(xpath = "//img[@alt='close-white description']")
    public WebElement closeJoinLidlFrame;
    @FindBy(xpath = "//a[normalize-space()='sign in']")
    public WebElement signInBtnHomePage;
    @FindBy(xpath = "(//input[@id='input0'])[1]")
    public WebElement signInEmailTextBox;
    @FindBy(xpath = "(//input[@id='input1'])[1]")
    public WebElement signInPasswordTextBox;
    @FindBy(xpath = "//button[normalize-space()='sign in']")
    public WebElement signInSignInBtn;

    // Update my Account information´s
    @FindBy(xpath = "//span[@class='profile-dropdown-button-label ']")
    public WebElement myAccountDropDownList;
    @FindBy(xpath = "//div[@class='name']")
    public WebElement clickToEdit;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameToChange;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameToChange;

    //@FindBy(xpath = "//select[@name='mailingState']")
    //public WebElement stateList;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
    @FindBy(xpath = "//p[@aria-live='assertive']")
    public WebElement updateMessage;
    @FindBy(xpath = "//h3[@class='title-3']")
    public WebElement updatedUsername;
}
