package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US3_step_definition {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();




    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedtext) {
        loginPage.loginBttn.click();
        BrowserUtils.waitFor(3);

        List<String> actualText = BrowserUtils.getElementsText(dashboardPage.allTabs);
        Assert.assertEquals(expectedtext,actualText);

    }
}