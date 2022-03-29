package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FileModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US4_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FileModulePage fileModulePage = new FileModulePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.login();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String Files) {
        dashboardPage.fileModule.click();
    }

    @Then("verify the page title is {string}.")
    public void verify_the_page_title_is(String string) {
        Assert.assertTrue(string.contains(dashboardPage.dashboardPageTitle()));
    }


    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        fileModulePage.selectAllFilesCheckbox.click();

        BrowserUtils.sleep(3);
    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
   //   fileModulePage.allCheckboxesAreSelected.forEach(p-> Assert.assertTrue(p.isSelected()));
        for (WebElement eachCheckBox : fileModulePage.allCheckboxesAreSelected) {
            BrowserUtils.highlight(eachCheckBox);
            Assert.assertTrue(eachCheckBox.getAttribute("class").contains("selected"));
        }
    }


}