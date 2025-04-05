package org.agriChain.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
    tags = "@Regression",
    features = "src/test/resources/features/InputScreen.feature",
    glue = { "org.agriChain.stepDefs" },
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}