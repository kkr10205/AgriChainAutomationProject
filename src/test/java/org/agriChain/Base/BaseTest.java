package org.agriChain.Base;
import org.agriChain.utils.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

import static org.agriChain.utils.WaitUtil.*;

public class BaseTest {

    private static WebDriver driver;

    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "./src/test/java/org/agriChain/driver/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(getImplicitWait()));
    }


    public void quitBrowser() {
        driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
