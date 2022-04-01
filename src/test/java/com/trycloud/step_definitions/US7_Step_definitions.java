package com.trycloud.step_definitions;

import com.trycloud.pages.FileModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US7_Step_definitions {
    FileModulePage fileModulePage = new FileModulePage();
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.waitForClickablility(fileModulePage.addIcon,5);
        fileModulePage.addIcon.click();
    }

    @When("user click {string}")
    public void user_click(String string) {
        BrowserUtils.waitForClickablility(fileModulePage.newFolderBtn,10);
        BrowserUtils.highlight(fileModulePage.newFolderBtn);
        fileModulePage.newFolderBtn.click();
    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        BrowserUtils.sleep(5);
        fileModulePage.newFolderInputBox.sendKeys("HulyaFileAdded");
        BrowserUtils.sleep(5);
        }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        BrowserUtils.waitForClickablility(fileModulePage.newFolderSubmitBtn,5);
        BrowserUtils.highlight(fileModulePage.newFolderSubmitBtn);
        fileModulePage.newFolderSubmitBtn.click();
    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        BrowserUtils.waitForVisibility(fileModulePage.newFolderLocation,5);
        BrowserUtils.highlight(fileModulePage.newFolderLocation);
        Assert.assertTrue(fileModulePage.newFolderLocation.isDisplayed());
    }

    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        BrowserUtils.waitForClickablility(fileModulePage.newFolderLocation,10);
        BrowserUtils.highlight(fileModulePage.newFolderLocation);
        fileModulePage.newFolderLocation.click();
    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        String path = System.getProperty("user.dir")+"/src/test/resources/files/HULYAFILE.jpg";
        fileModulePage.uploadFileBtn.sendKeys(path);
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitForClickablility(fileModulePage.addIcon,5);
        fileModulePage.addIcon.click();
    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.waitForVisibility(fileModulePage.newFolderInsideNewFileLocation,10);
        Assert.assertTrue(fileModulePage.newFolderInsideNewFileLocation.isDisplayed());

        Driver.getDriver().navigate().back();
        BrowserUtils.waitForPageToLoad(5);
        fileModulePage.newFolder3Dots.click();
        BrowserUtils.hover(fileModulePage.deleteFolderBtn);
        fileModulePage.deleteFolderBtn.click();
    }

}
