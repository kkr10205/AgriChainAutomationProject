package org.agriChain.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.agriChain.Base.BaseTest;

public class Hooks extends BaseTest {
    @Before
    public void setUp() {
        initializeBrowser();
    }
    @After
    public void tearDown() {
        quitBrowser();
    }
}
