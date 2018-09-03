package parentTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomeOkkPage;
import pages.HomeOkkPetitions;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected LoginPage loginPage;
    protected HomeOkkPage homeOkkPage;
    protected HomePage homePage;
    protected HomeOkkPetitions homeOkkPetitions;


    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homeOkkPage = new HomeOkkPage(webDriver);
        homeOkkPetitions = new HomeOkkPetitions(webDriver);
        homePage = new HomePage(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    protected void checkAC(String message, boolean actual, boolean expected) {
        if (actual != expected) {
            logger.error("AC failed: " + message);
        }
        Assert.assertEquals(message, expected, actual);
    }

}
