package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_invalid_step_definition {

    LoginPage loginPage = new LoginPage();



    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String arg0, String arg1) {
        loginPage.usernameBox.sendKeys(arg0);
        loginPage.passwordBox.sendKeys(arg1);
        loginPage.loginBttn.click();

    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String arg0) {
        Assert.assertTrue(loginPage.errorMessage.getText().contains(arg0));
    }
}
