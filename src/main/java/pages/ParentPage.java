package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    String expectedUrl;
    final String baseUrl = "https://iptkiev.kitsoft.kiev.ua/petitions";
    final String baseUrlLogIn = "https://id.kitsoft.kiev.ua/sign_in";
    final String baseUrlOKK = "https://my.kitsoft.kiev.ua";


    public ParentPage(WebDriver webDriver, String expectedUrl) {
        this.webDriver = webDriver;
        this.expectedUrl = baseUrl + expectedUrl;
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
