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
    FileModulePage filesPage = new FileModulePage();
    String beforeDeleteFolderText;

    @When("the user clicks action-icon  from any file on the pagem")
    public void the_user_clicks_action_icon_from_any_file_on_the_pagem() {
        BrowserUtils.waitForClickablility(filesPage.mertfirst3dots,5);
        filesPage.mertfirst3dots.click();
    }
    @When("user choose the {string} optionm")
    public void user_choose_the_optionm(String str) {
        beforeDeleteFolderText=filesPage.mertchosenFolderForDelete.getText();
        filesPage.mertactionIconSubOptionsNavigate(str);
    }
    @When("the user clicks the {string} sub-modulem")
    public void the_user_clicks_the_sub_modulem(String string) {
        BrowserUtils.waitForClickablility(filesPage.mertdeletedFilesModule,5);
        filesPage.mertdeletedFilesModule.click();
        BrowserUtils.waitForPageToLoad(5);

    }
    @Then("Verify the deleted file is displayed on the page.m")
    public void verify_the_deleted_file_is_displayed_on_the_page_m() {
        BrowserUtils.scrollToElement(filesPage.mertdeletedFilesFoldersList.get(filesPage.mertdeletedFilesFoldersList.size()-1));
        BrowserUtils.sleep(10);
        String afterDeleteFolderMovesToDeletedFilesText=filesPage.mertdeletedFilesFoldersList.get(filesPage.mertdeletedFilesFoldersList.size()-1).getText();
        Assert.assertEquals(beforeDeleteFolderText,afterDeleteFolderMovesToDeletedFilesText);

        BrowserUtils.scrollToElement(filesPage.mertrestoreBtn.get(filesPage.mertrestoreBtn.size()-1));
        BrowserUtils.waitForClickablility(filesPage.mertrestoreBtn.get(filesPage.mertrestoreBtn.size()-1),5);
        BrowserUtils.highlight(filesPage.mertrestoreBtn.get(filesPage.mertrestoreBtn.size()-1));
        filesPage.mertrestoreBtn.get(filesPage.mertrestoreBtn.size()-1).click();

    }

}
