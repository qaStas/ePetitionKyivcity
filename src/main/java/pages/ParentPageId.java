package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ParentPageId {
    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    String expectedUrl;
    final String baseUrlLogIn = "https://id.kitsoft.kiev.ua";

    public ParentPageId(WebDriver webDriver, String expectedUrl) {
        this.webDriver = webDriver;
        this.expectedUrl = baseUrlLogIn + expectedUrl;
    }

    public String getCurrentUrl (){
        return webDriver.getCurrentUrl();
    }

    public void checkCurrentUrl (){
        try {
            Assert.assertEquals("Url is not expexted", expectedUrl, getCurrentUrl());

        } catch (Exception e){
            logger.error("Cannot work with Url");
            Assert.fail("Cannot work with Url");
        }
    }
}
