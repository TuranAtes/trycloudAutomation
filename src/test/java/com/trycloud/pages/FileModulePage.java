package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FileModulePage {

    public FileModulePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@for='select_all_files']")
    public WebElement selectAllFilesCheckbox;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> allCheckboxesAreSelected;

    @FindBy(xpath = "//*[@id=\"select-files-18353\"]")
    public WebElement readMeCheckbox;

    //  @FindBy (xpath = "select-files-17245)
}
