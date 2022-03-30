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


    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[3]")
    public WebElement actionBtn;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement addToFav;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favorite;

    @FindBy(xpath = "(//span[.='Talk'])[6]")
    public WebElement talkFileIsDisplayed;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionIndex_1;

    @FindBy (xpath = "(//span[.='Bachelor of Criminology'])[5]")
    public WebElement removeVerify;




}
