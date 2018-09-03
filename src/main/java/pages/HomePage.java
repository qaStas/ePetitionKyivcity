package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public void openPage() {
        try {
            webDriver.get(baseUrl + "/");
            checkCurrentUrl();
            logger.info("HomePage was opened");

        } catch (Exception e) {
            logger.error("Can not open HomePage");
            Assert.fail("Can not open HomePage");
        }
    }

    public void clickOnAvatarLink() {
        try {
            WebElement webElement = webDriver.findElement(By.className("tool__link"));
            webElement.click();
            logger.info("Avatar was clicked");
            Thread.sleep(5000);

        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }

    public boolean isAvatarPresent() {
        try {
            return webDriver.findElement(
                    By.xpath(".//img[@alt='avatar']"))
                    .isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
