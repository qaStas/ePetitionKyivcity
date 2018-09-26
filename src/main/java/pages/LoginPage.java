package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPageId {

    @FindBy(name = "email")
    private WebElement userNameInput;

    @FindBy(name = "password")
    private WebElement passWordInput;

    @FindBy(className = "pull-right")
    private WebElement nextButton;

    @FindBy(tagName = "button")
    private WebElement submitButton;


    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/sign_in"); // уточнить и проверить
    }

    public void openPage() {
        try {
            webDriver.get(baseUrlLogIn + "/sign_in");
            checkCurrentUrl();
            logger.info("Login Page was opened");

        } catch (Exception e) {
            logger.error("Can not open LoginPage");
            Assert.fail("Can not open LoginPage");
        }
    }

    public void enterLogin(String login) {
        try {
            userNameInput.clear();
            userNameInput.sendKeys(login);
            logger.info(login + " was input into input Login");

        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void enterPass(String pass) {
        try {
            Thread.sleep(3000);
            passWordInput.clear();
            passWordInput.sendKeys(pass);
            logger.info(pass + " was input into input Pass");

        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void focusToNewTab() {
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
            logger.info("Focus switched to new Tab");
        }
    }


    public void clikOnNextButton() {
        try {
            nextButton.click();
            logger.info("Button Next was clicked");
        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void clikOnSignInButton() {
        try {
            submitButton.click();
            logger.info("Button SignIn was clicked");
            Thread.sleep(3000);
        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }
}
