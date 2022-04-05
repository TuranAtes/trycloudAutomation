package com.trycloud.step_definitions;

import com.trycloud.pages.FileModulePage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US5_Step_Definitions {

    FileModulePage fileModulePage = new FileModulePage();

    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        BrowserUtils.waitForClickablility(fileModulePage.actionBtn,5);
        fileModulePage.actionBtn.click();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        fileModulePage.addToFav.click();
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        fileModulePage.favorite.click();
        BrowserUtils.waitFor(3);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        Assert.assertTrue("", fileModulePage.talkFileIsDisplayed.isDisplayed());
    }



}
