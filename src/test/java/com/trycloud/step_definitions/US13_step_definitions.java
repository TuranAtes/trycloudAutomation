package com.trycloud.step_definitions;

import com.trycloud.pages.ContactPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US13_step_definitions {
     ContactPage contactPage = new ContactPage();

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {
        // # (Pre-condition: there should be at least 2 contact names are displayed
        //  # On the contact list so that view list function can be tested)
         // Assert.assertTrue(contactPage.contactsList.size() >=2);

        BrowserUtils.waitFor(10);

        int count =0;
        for (WebElement contactList : contactPage.contactsList) {

            Assert.assertTrue(contactList.isDisplayed());
             count ++;

        }
        Assert.assertTrue(count >=2);

    }


}
