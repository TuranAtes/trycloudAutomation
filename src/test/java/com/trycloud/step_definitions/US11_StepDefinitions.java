package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.TalkModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_StepDefinitions {
    DashboardPage dashboardPage= new DashboardPage();
    TalkModulePage talkModulePage= new TalkModulePage();

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
     Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
        talkModulePage.talkModuleSerachbox.click();
        talkModulePage.talkModuleSerachbox.sendKeys("User71");
        BrowserUtils.waitForClickablility( talkModulePage.user71,5);
        talkModulePage.user71.click();







    }
    @When("user write a message")
    public void user_write_a_message() {
        BrowserUtils.waitForClickablility(talkModulePage.messageBox,5);
        talkModulePage.messageBox.sendKeys("Anastasia");
        BrowserUtils.waitForClickablility(talkModulePage.messageSubmitButton,5);

    }
    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        talkModulePage.messageSubmitButton.click();



    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
      String actualTextmessage= talkModulePage.listOfMessages.get((talkModulePage.listOfMessages.size()-1)).getText();
      String expectedMessage= "Anastasia";
      Assert.assertEquals(expectedMessage,actualTextmessage);

    }

    @When("the user clicks the Talk module")
    public void theUserClicksTheTalkModule() {
        talkModulePage.talkmodule.click();
    }
}
