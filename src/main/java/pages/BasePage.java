package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public static HomePage homePage;
    public static SupportPage supportPage;
    public static WebDriver driver;

    public static void initPages(){
        homePage = new HomePage(driver);
        supportPage = new SupportPage(driver);
    }
}