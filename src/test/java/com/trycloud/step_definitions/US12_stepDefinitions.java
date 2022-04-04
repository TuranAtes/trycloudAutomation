package com.trycloud.step_definitions;

import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_stepDefinitions{



    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

        Assert.assertEquals(Driver.getDriver().getTitle(), "Contacts - Trycloud QA");

    }

}
