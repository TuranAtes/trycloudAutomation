package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US14_Step_Definitions {
    DashboardPage dashboardPage=new DashboardPage();

    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        dashboardPage.magnifierIconBttn.click();
        BrowserUtils.waitFor(3);

    }
    @When("users search any existing {string} file,folder,user name")
    public void users_search_any_existing_file_folder_user_name(String actual) {

        dashboardPage.searchBox.sendKeys(actual);


    }
    @Then("verify the app displays the {string} result option")
    public void verify_the_app_displays_the_result_option(String expected) {


        String actual = dashboardPage.searchInputResult.getAttribute("title");
        Assert.assertTrue(actual.contains(expected));
        System.out.println(actual);


    }

}
