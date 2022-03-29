package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FileModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US4_StepDefinitions {
    public static void main(String[] args) {



    FileModulePage fileModulePage = new FileModulePage();
   DashboardPage dashboardPage = new DashboardPage();
  //LoginPage loginPage = new LoginPage();


    @Given("user on the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page(){
        String actualDashboardTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualDashboardTitle.contains("Dashboard"));
    }

    @When("the user clicks the 'Files' module")
    public void the_user_clicks_the_Files_module() {
        dashboardPage.fileModule.click();
    }

    @Then("verify the page title is 'Files - Trycloud QA.' ")
    public void verify_the_page_title() {
        String fileModuleActualPageTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(fileModuleActualPageTitle.contains("Files - Trycloud QA."));
    }

    @And("user click the top-left checkbox of the table")
        public void click_top_left_checkbox_of_the_table(){
        fileModulePage.selectAllFilesCheckbox.click();
    }

    @Then("verify all the files are selected")
    public void verify_all_files_are_selected(){
        Assert.assertTrue(fileModulePage.allCheckboxesAreSelected.getAttribute("class").contains("multiselect"));
    }}
}
