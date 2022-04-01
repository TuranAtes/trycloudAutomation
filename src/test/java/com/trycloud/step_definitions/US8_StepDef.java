package com.trycloud.step_definitions;

import com.trycloud.pages.FileModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class US8_StepDef {
    FileModulePage fileModulePage=new FileModulePage();
    String beforedeleted;
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String Clickss) {
       fileModulePage.actionBtn.click();
        beforedeleted= fileModulePage.locationofthreedat.getText();

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        fileModulePage.actionbutton1.click();
        fileModulePage.deletedddfolder.click();
        fileModulePage.deletedmodule.click();
        BrowserUtils.waitFor(3);

        BrowserUtils.waitFor(3);
        BrowserUtils.scrollToElement(fileModulePage.AllDeletedFolderElement.get(fileModulePage.AllDeletedFolderElement.size()-1));
        BrowserUtils.waitFor(3);
        String afterDeleteFolderMovesToDeletedFilesText=fileModulePage.AllDeletedFolderElement.get(fileModulePage.AllDeletedFolderElement.size()-1).getText();


        Assert.assertEquals(beforedeleted,afterDeleteFolderMovesToDeletedFilesText);



    }

}
