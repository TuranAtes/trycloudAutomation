package com.trycloud.step_definitions;

import com.trycloud.pages.FileModulePage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class US6_stepDefinition {

    FileModulePage fileModulePage = new FileModulePage();



    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
       fileModulePage.actionIndex_1.click();


    }
    @When("user choose the Remove from favorites option")
    public void user_choose_the_remove_from_favorites_option() {
        BrowserUtils.waitFor(3);
        fileModulePage.removeFromFavorites.click();

    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {

        try {
            Assert.assertTrue("test is failed",!fileModulePage.removeVerify.isDisplayed());
        }catch (NoSuchElementException e){

        }
    }


    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {

        BrowserUtils.waitForClickablility(fileModulePage.addButtonIcon,5);
        fileModulePage.addButtonIcon.click();

    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {


        String path = System.getProperty("user.dir")+"/src/test/resources/files/HELLOWORLD.jpg";

        BrowserUtils.highlight(fileModulePage.uploadFileBtn);
        fileModulePage.uploadFileBtn.sendKeys(path);

        BrowserUtils.waitForPageToLoad(5);
        fileModulePage.addButtonIcon.click();
    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {



    }

}
