package com.trycloud.step_definitions;

import com.trycloud.pages.ContactPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_stepDefinitions{

   ContactPage contactPage = new ContactPage();

    @When("the user clicks the Contacts module")
    public void theUserClicksTheContactsModule() {
        contactPage.contactModule.click();
    }





    @Then("verify the page title is the {string}")
    public void verifyThePageTitleIsThe(String arg0) {

       Assert.assertTrue(Driver.getDriver().getTitle().contains("Contacts - Trycloud"));

    }
    }




