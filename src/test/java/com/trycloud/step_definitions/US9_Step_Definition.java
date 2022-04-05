package com.trycloud.step_definitions;

import com.trycloud.pages.FileModulePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_Step_Definition {

FileModulePage fileModulePage=new FileModulePage();

    @And("user choose the Details option")
    public void userChooseTheDetailsOption() {

        fileModulePage.detailsBttn.click();
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {

        fileModulePage.commentBttn.click();

        fileModulePage.commentBox.sendKeys("Salatalik");

    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

        fileModulePage.commentBoxSubmit.click();

    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

        Assert.assertTrue(fileModulePage.commentVerify.isDisplayed());


    }


}
