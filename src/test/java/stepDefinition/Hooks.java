package stepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import static pages.BasePage.driver;

public class Hooks {

    @Before
    public void  setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        BasePage.initPages();
    }
    @After
    public  void tearDown(){

        driver.quit();
    }
}
