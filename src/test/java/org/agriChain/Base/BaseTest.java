package org.agriChain.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.agriChain.utils.ConfigReader;
import org.agriChain.utils.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

import static org.agriChain.utils.WaitUtil.*;

public class BaseTest {

    private static WebDriver driver;

    public void initializeBrowser() {
        String browser = ConfigReader.get("browser").toLowerCase();

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Unsupported browser: " + browser);
        }

        driver.get(ConfigReader.get("baseUrl"));
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
