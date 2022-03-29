package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileModulePage {
    public static WebElement selectAllFilesCheckbox;

    //  @FindBy (xpath = "//*[@id="select_all_files"]")
 //   public WebElement selectAllFilesCheckbox;

    @FindBy (xpath = "//*[@id=\"filestable\"]")
    public WebElement allCheckboxesAreSelected;

    @FindBy (xpath = "//*[@id=\"select-files-18353\"]")
            public WebElement readMeCheckbox;

  //  @FindBy (xpath = "select-files-17245)
}
