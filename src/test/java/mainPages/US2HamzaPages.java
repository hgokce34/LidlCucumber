package mainPages;

import mainUtilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US2HamzaPages extends CommonMethods {

    @FindBy (xpath ="//button[text()='accept cookies']" )
    public WebElement acceptCookies;

    @FindBy (xpath ="(//img[@alt='close-white description'])[1]" )
    public WebElement clickAllertMessage;

    @FindBy (xpath ="(//a[normalize-space()='sign in'])[1]" )
    public WebElement clickSignInButton;

    @FindBy (xpath ="(//a[text()='join myLidl'])[1]" )
    public WebElement clickJoinLidl;

    @FindBy (xpath ="//input[@name='firstName']" )
    public WebElement writeFirstName;


    @FindBy (xpath ="//input[@name='lastName']" )
    public WebElement writeLastName;

    @FindBy (xpath ="//input[@name='email']" )
    public WebElement writeEmail;

    @FindBy (xpath ="//p[text()='Enter a valid email address.']")
    public WebElement emailMessageİsDisplayed;


    @FindBy (xpath ="//input[@name='confirm_email']")
    public WebElement confirmEmail;

    @FindBy (xpath ="//p[text()='Emails do not match']")
    public WebElement mathcesEmail;

    @FindBy (xpath ="//input[@name='password']")
    public WebElement writePass;

    @FindBy (xpath ="(//p[text()='Your password must be at least 8 characters!'])[1]")
    public WebElement passwordMessage;

    @FindBy (xpath ="//input[@name='phone']")
    public WebElement phoneNumber;

    @FindBy (xpath ="//p[text()='Enter a valid phone number.']")
    public WebElement phoneNumberMessage;

    @FindBy (xpath ="//input[@name='zip']")
    public WebElement zipCode;

    @FindBy (xpath ="//p[text()='Enter a valid zipcode.']")
    public WebElement zipCodeMessage;

    @FindBy (xpath ="//input[@name='birthday']")
    public WebElement birthdayDate;

    @FindBy (xpath ="//input[@name='mailingStreet']")
    public WebElement adressTextBox;

    @FindBy (xpath ="//input[@name='mailingCity']")
    public WebElement cityTextBox;

    @FindBy (xpath ="(//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline lidl-select MuiInputBase-formControl MuiInput-formControl'])[1]")
    public WebElement stateTextBox;

    @FindBy (xpath ="//div[@class='spinnie-container']")
    public WebElement clickJoinButton;








}
