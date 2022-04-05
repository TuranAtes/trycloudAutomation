package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "svg[viewBox~='24']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@type=\'search\']")
    public WebElement searchInput;

    @FindBy(xpath = "//span//h3")
    public WebElement firstSearchedResult;

    //when you search something that not exist-->error message
    @FindBy(xpath = "(//div[@class='empty-content']//h2[@class='empty-content__title'])[1]")
    public WebElement NoResultMessageForSearch;

    //This is main module locator
    public void navigateToModule1(String module){
        String locator = "//ul[@id='appmenu']//a[@aria-label='"+module+"']";
        WebElement eachModule = Driver.getDriver().findElement(By.xpath(locator));
        BrowserUtils.highlight(eachModule);
        eachModule.click();
    }




}
