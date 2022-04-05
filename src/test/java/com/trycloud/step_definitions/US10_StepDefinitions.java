
package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FileModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Background;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class US10_StepDefinitions {
    FileModulePage fileModulePage = new FileModulePage();
    Double beforeStorage;

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        fileModulePage.settingsBtn.click();
    }

    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {

/**
 * input checkboxes are not clickable, have to click the lable and then verify that the checkbox isSelected
 */
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            if (fileModulePage.settingsCheckboxes.get(i).isSelected()) {
                continue;
            }
            fileModulePage.settingsCheckboxesName.get(i).click();
            Assert.assertTrue("Checkbox is selected after clicking", fileModulePage.settingsCheckboxes.get(i).isSelected());
        }
        for (WebElement each : fileModulePage.settingsCheckboxes) {
            Assert.assertTrue(each.isEnabled());
        }
    }
        @When("user checks the current storage usage")
        public void user_checks_the_current_storage_usage () {
           String storageBeforeUploading= fileModulePage.storageUsage.getText();
           beforeStorage = Double.valueOf(storageBeforeUploading.substring(0,storageBeforeUploading.indexOf(' ')));
           System.out.println("beforeStorage = " + beforeStorage);
        }

        @When("user  uploads file with the upload file option")
        public void users_uploads_file_with_the_upload_file_option() {
            String path = System.getProperty("user.dir") + "/src/test/resources/files/HELLOWORLD.jpg";
            BrowserUtils.highlight(fileModulePage.uploadFileBtn);
            fileModulePage.uploadFileBtn.sendKeys(path );
            BrowserUtils.waitForPageToLoad(5);
            fileModulePage.addButtonIcon.click();
        }

        @When("user refresh the page")
        public void user_refresh_the_page ()  {

       // try{fileModulePage.notEnoughSpacePopup.isDisplayed()

         try {fileModulePage.conflictWarning.isDisplayed();

             for (WebElement checkbox : fileModulePage.conflictCheckboxes) {
                 checkbox.click();
                 BrowserUtils.sleep(2);
             }
             BrowserUtils.sleep(2);
             fileModulePage.conflictBtn.click();
             BrowserUtils.sleep(2);
            } catch (NoSuchElementException e) {
                System.out.println("No duplicated file");
            }
        }

        @Then("the user should be able to see storage usage is increased")
        public void the_user_should_be_able_to_see_storage_usage_is_increased () {
            Driver.getDriver().navigate().refresh();
            BrowserUtils.sleep(2);

            String storageAfterUploading= fileModulePage.storageUsage.getText();
            Double afterStorage = Double.valueOf(storageAfterUploading.substring(0,storageAfterUploading.indexOf(' ')));
            System.out.println("afterStorage = " + afterStorage);

           Assert.assertTrue(beforeStorage<afterStorage);
        }
    }


