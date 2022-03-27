package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;

public class login_Step_definitions {

  LoginPage loginPage = new LoginPage();

    @Given("user on the login page {string}")
    public void userOnTheLoginPage(String arg0) {


        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));

        String actualTittle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTittle.contains("Trycloud"));
    }

        @When("user use username {string} and passcode {string}")
        public void userUseUsernameAndPasscode(String arg0, String arg1) {


  loginPage.usernameBox.sendKeys(arg0);

  loginPage.passwordBox.sendKeys(arg1);


    }
    @When("user click the login button")
    public void user_click_the_login_button() {

        loginPage.loginBttn.click();

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

       String actualTittle= Driver.getDriver().getTitle();


       Assert.assertTrue(actualTittle.contains("Dashboard"));



    }


}
