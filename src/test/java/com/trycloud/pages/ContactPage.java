package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactPage {

    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='active'])[1]")
    public WebElement contactModule;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-view']")
    public List<WebElement> contactsList;
}
