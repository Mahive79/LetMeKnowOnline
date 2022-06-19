package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;

    @FindBy(css = "button.close")
    public List<WebElement> AdvertisementCloseBtn;

    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    public WebElement signUp;
    @FindBy(css = "input[placeholder='First Name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastname;
    @FindBy(xpath = "(//input[@placeholder='Email'])[1]")
    public WebElement email;
    @FindBy(xpath = "//input[@placeholder='Company Name']")
    public WebElement companyName;
    @FindBy(xpath = "(//input[@name='password'])[1]")
    public WebElement password;
    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement captchaCheckBox;
    @FindBy(xpath = "//label[@for='terms_conditon']")
    public WebElement termsAndConditionsCheckBox;
    @FindBy(xpath = "//button[normalize-space()='Registration']")
    public WebElement registrationButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAdvertisementCloseButton() {
        if (AdvertisementCloseBtn.size() > 0)
            AdvertisementCloseBtn.get(0).click();
    }

    public void clickOnSignUpLink() {
        signUp.click();
    }

    public void enterFirstName(String firstName) {
        firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastname.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        email.sendKeys(email);
    }

    public void enterCompanyName(String companyName) {
        companyName.sendKeys(companyName);
    }

    public void enterPassword(String password) {
        password.sendKeys(password);
    }

    public void enterConfPassword(String confirmPassword) {
        confirmPassword.sendKeys(confirmPassword);
    }

    public void checkCaptchaChkBox() {
        captchaCheckBox.click();
    }

    public void checkTermsAndCond() {
        termsAndConditionsCheckBox.click();
    }

    public void clickOnRegistrationBtn() {
        registrationButton.click();
    }
}