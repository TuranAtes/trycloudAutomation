package com.trycloud.step_definitions;

import com.trycloud.pages.FileModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
        fileModulePage.actionmy.click();
        BrowserUtils.sleep(3);
        fileModulePage.deletedddfolder.click();
        fileModulePage.deletedmodule.click();
        BrowserUtils.waitFor(3);
       // Actions actions=new Actions(Driver.getDriver());
        BrowserUtils.scrollToElement(fileModulePage.Masterofengineer);
        //actions.moveToElement((WebElement) fileModulePage.Masterofengineer).perform();
        BrowserUtils.waitFor(3);
       // String afterDeleteFolderMovesToDeletedFilesText=fileModulePage.AllDeletedFolderElement.get(fileModulePage.AllDeletedFolderElement.size()-1).getText();
BrowserUtils.hover(fileModulePage.Masterofengineer);
        String actual = fileModulePage.Masterofengineer.getText();

        Assert.assertEquals(actual,beforedeleted);



        // Assert.assertEquals(beforedeleted,afterDeleteFolderMovesToDeletedFilesText);



    }

}
