package org.agriChain.Base;
import org.agriChain.utils.WaitUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static org.agriChain.utils.WaitUtil.getExplicitWaitDuration;

public class BasePage {

    public WebDriver driver;

    public BasePage() {
        this.driver = BaseTest.getDriver();
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(getExplicitWaitDuration()));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForVisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(getExplicitWaitDuration()));
        wait.until(ExpectedConditions.visibilityOf(findElement(locator)));
    }


    public void waitForElementToClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(getExplicitWaitDuration()));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(getExplicitWaitDuration()));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForInVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(getExplicitWaitDuration()));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void clear(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }

    public void click(WebElement element) {
        waitForElementToClickable(element);
        element.click();
    }

    public void clickWithoutWait(WebElement element) {
        element.click();
    }

    public void clickAction(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public boolean isDisplayed(WebElement element) {
        boolean status = false;
        waitForVisibility(element);
        try {
            status = element.isDisplayed();
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return status;
    }
    public void sendKeys(WebElement element, String txt) {
        waitForVisibility(element);
        element.sendKeys(txt);
    }

    public void clearTextField(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }
    public String getText(WebElement element) {
        waitForVisibility(element);
        String label = element.getText().trim();
        return label;
    }

}
