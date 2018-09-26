package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeOkkPage extends ParentPageOkk {
    public HomeOkkPage(WebDriver webDriver) {
        super(webDriver, "/");
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
