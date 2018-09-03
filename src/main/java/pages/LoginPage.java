package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ParentPageId{

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/sign_in"); // уточнить и проверить
    }

    public void openPage(){
        try{
            webDriver.get(baseUrlLogIn + "/sign_in");
            checkCurrentUrl();
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

    public void enterPass (String pass) {
        try {
            Thread.sleep(3000);
            WebElement webElement = webDriver.findElement(By.name("password"));
            webElement.clear();
            webElement.sendKeys(pass);
            logger.info(pass + " was input into input Pass");

        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void focusToNewTab(){
        for(String winHandle : webDriver.getWindowHandles()){
            webDriver.switchTo().window(winHandle);
            logger.info("Focus switched to new Tab");
        }
    }


    public void clikOnNextButton(){
        try {
            WebElement webElement = webDriver.findElement(By.className("pull-right"));
            webElement.click();
            logger.info("Button Next was clicked");
        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void clikOnSignInButton(){
        try {
            WebElement webElement = webDriver.findElement(By.tagName("button"));
            webElement.click();
            logger.info("Button SignIn was clicked");
            Thread.sleep(3000);
        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }
}
