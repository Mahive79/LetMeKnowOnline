package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SupportPage;
import utils.DriverFactory;

public class SupportStepDef {
    public WebDriver driver;
    public SupportPage supportPage;

    @Given("user is on let me know online home page")
    public void userIsOnLetMeKnowOnlineHomePage() {

        driver = DriverFactory.getDriver();
        supportPage = new SupportPage(driver);
    }

    @When("user clicks on support")
    public void userClicksOnSupport() {
        supportPage.clickOnAdvertisementCloseButton();
        supportPage.clickOnSupportLink();

    }
    @Then("user should be able to see labels for create ticket next to the respective column fields")
    public void userShouldBeAbleToSeeLabelsForCreateTicketNextToTheRespectiveColumnFields() {
        supportPage.verifyTicketLabel();
        supportPage.verifyTicketSubjectLabel();
        supportPage.verifyYourEmailLabel();
        supportPage.verifyPriorityLabel();
        supportPage.verifyTicketCategoryLabel();
        supportPage.verifySetSelectFileLabel();
    }
}
