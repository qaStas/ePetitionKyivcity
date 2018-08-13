package loginTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTestWithOutPageObject {
    // тест быстро создаётся, но не поддерживается

    WebDriver webDriver;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
    }

    @Test
    public void validLogIn() {
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriver.get("https://id.kitsoft.kiev.ua/sign_in");

        webDriver.findElement(By.name("email")).clear();
        webDriver.findElement(By.name("email")).sendKeys("bsl604@gmail.com");

        webDriver.findElement(By.className("pull-right")).click();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

}
