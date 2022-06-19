package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SupportPage {

    WebDriver driver;

    @FindBy(css="button.close")
    public List<WebElement> AdvertisementCloseBtn;
    @FindBy(xpath = "//a[contains(text(),'Support')]")
    WebElement supportLink;

    @FindBy(xpath = "//h3[contains(text(),'Create a Ticket.')]")
    WebElement createATicketLabel;

    @FindBy(xpath = "//label[contains(text(),'Ticket Subject')]")
    WebElement ticketSubjectLabel;

    @FindBy(xpath = "//label[contains(text(),'Your Email')]")
    WebElement yourEmailLabel;

    @FindBy(xpath = "//label[contains(text(),'Priority')]")
    WebElement priorityLabel;

    @FindBy(xpath = "//label[contains(text(),'Ticket Category')]")
    WebElement ticketCategoryLabel;

    @FindBy(xpath = "//label[contains(text(),'Select File')]")
    WebElement selectFileLabel;

    public SupportPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAdvertisementCloseButton(){
        if(AdvertisementCloseBtn.size()>0)
            AdvertisementCloseBtn.get(0).click();
    }
    public void clickOnSupportLink() {
        supportLink.click();
    }

    public void verifyTicketLabel() {
        createATicketLabel.isDisplayed();
    }

    public void verifyTicketSubjectLabel() {
        ticketSubjectLabel.isDisplayed();
    }

    public void verifyYourEmailLabel() {
        yourEmailLabel.isDisplayed();
    }

    public void verifyPriorityLabel() {
        priorityLabel.isDisplayed();
    }

    public void verifyTicketCategoryLabel() {
        ticketCategoryLabel.isDisplayed();
    }

    public void verifySetSelectFileLabel() {
        selectFileLabel.isDisplayed();
    }
}