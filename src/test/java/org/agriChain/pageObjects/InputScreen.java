package org.agriChain.pageObjects;

import org.agriChain.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class InputScreen extends BasePage {

    public InputScreen() {
        PageFactory.initElements (driver, this);
    }

    @FindBy(id = "Enter-String-Input")
    private WebElement enterStringInputField;

    public boolean isEnterStringInputFieldDisplayed () {
        return isDisplayed (enterStringInputField);
    }
    public void clearInputField() {
            clearTextField(enterStringInputField);
    }
    public void enterText(String text) {
        click(enterStringInputField);
        sendKeys(enterStringInputField,text);
    }
    @FindBy(id = "submit-Button")
    private WebElement submitButton;

    public void clickOnSubmitBtn() {
        click(submitButton);
    }

    //Output Screen

    @FindBy(id = "output-is")
    private WebElement outputIsText;
    public boolean isOutputTextDisplayed () {
        return isDisplayed (outputIsText);
    }
    @FindBy(id = "output-value")
    private WebElement outputValue;
    public String getOutputValue () {
        return getText(outputValue);
    }
    public int expLengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {
                continue;
            }
            map.put(currentChar, i);
        }

        return map.size();
    }
}
