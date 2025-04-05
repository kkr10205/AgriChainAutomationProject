package org.agriChain.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.agriChain.pageObjects.InputScreen;
import org.testng.Assert;

public class InputScreenSteps {

    private String inputValue;

    @Given("User is on the Input Page")
    public void userIsOnTheInputPage() {
        InputScreen inputScreen = new InputScreen();
        boolean bv=inputScreen.isEnterStringInputFieldDisplayed();
        Assert.assertTrue(bv);
    }

    @When("User enter valid input as {string}")
    public void userEnterValidInputAs(String inputValue) {
        this.inputValue=inputValue;
        InputScreen inputScreen = new InputScreen();
        inputScreen.clearInputField();
        inputScreen.enterText(inputValue);

    }

    @And("User Click on the Submit Button")
    public void userClickOnTheSubmitButton() {
        InputScreen inputScreen = new InputScreen();
        inputScreen.clickOnSubmitBtn();

    }

    @Then("Verify user should able to navigate to the output page")
    public void verifyUserShouldAbleToNavigateToTheOutputPage() {
        InputScreen inputScreen = new InputScreen();
        boolean bv=inputScreen.isOutputTextDisplayed();
        Assert.assertTrue(bv);

    }

    @Then("Valid output should be shown")
    public void validOutputShouldBeShown() {
        InputScreen inputScreen = new InputScreen();
        String actualOutput=inputScreen.getOutputValue();
        int expLength=inputScreen.expLengthOfLongestSubstring(inputValue);
        Assert.assertEquals(actualOutput.length(),expLength,"output Length is not matching with expected ");


    }
}
