package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ParentPage{

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/sign_in"); // уточнить и проверить
    }

    public void openPage(){
        try{
            webDriver.get(baseUrlLogIn);
            logger.info("Login Page was opened");

        } catch (Exception e){
            logger.error("Can not open LoginPage");
            Assert.fail("Can not open LoginPage");
        }
    }

    public void enterLogin (String login) {
        try {
            WebElement webElement = webDriver.findElement(By.name("email"));
            webElement.clear();
            webElement.sendKeys(login);
            logger.info(login + " was input into input Login");

        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }
}
