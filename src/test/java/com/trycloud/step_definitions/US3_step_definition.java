package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class US3_step_definition {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedtext) {
        List<String> actualtext=new ArrayList<>();
        for (int i = 0; i < dashboardPage.allTabs.size(); i++) {
            String expextedEachText = dashboardPage.allTabs.get(i).getAttribute("aria-label");
            actualtext.add(expextedEachText);
        }
        Assert.assertEquals(expectedtext,actualtext);
    }
    }
