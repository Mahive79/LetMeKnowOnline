package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.DriverFactory;

public class SignUpStepDef {
    public WebDriver driver;
    public HomePage homePage;

    @Given("User is on LetMeKnowOnline home page")
    public void user_is_on_let_me_know_online_home_page() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
    }

    @When("user click on SignUp")
    public void user_click_on_sign_up() {

        homePage.clickOnAdvertisementCloseButton();
        homePage.clickOnSignUpLink();
    }

    @When("passes the details as {string} {string} {string} {string} {string} {string}")
    public void passes_the_details_as(String firstName, String lastName, String email, String companyName, String password, String confirmPassword) {

        homePage.enterFirstName(firstName);
        homePage.enterLastName(lastName);
        homePage.enterEmail(email);
        homePage.enterCompanyName(companyName);
        homePage.enterPassword(password);
        homePage.enterConfPassword(confirmPassword);
    }

    @When("select I'm not a robot")
    public void select_i_m_not_a_robot() {
        homePage.checkCaptchaChkBox();
    }

    @When("accept terms and conditions")
    public void accept_terms_and_conditions() {
        homePage.checkTermsAndCond();
    }

    @When("click on Register button")
    public void click_on_register_button() {
        homePage.clickOnRegistrationBtn();
    }

    @Then("user should be able to register successfully")
    public void user_should_be_able_to_register_successfully() {
        WebElement actual = driver.findElement(By.xpath("//h2[contains(text(),'User Login')]"));
        String actualMessage = actual.getText();
        String expectedMessage = "User login";
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}