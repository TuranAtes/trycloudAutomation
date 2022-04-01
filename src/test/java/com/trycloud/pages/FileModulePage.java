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

    @FindBy(id = "view13-input-folder")
    public WebElement newFolderInputBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement newFolderSubmitBtn;

    @FindBy(xpath = "//tr[@data-file='HulyaFileAdded']")
    public WebElement newFolderLocation;

    @FindBy(xpath = "//*[@id=\"fileList\"]//span[.='HULYAFILE']")
    public WebElement newFolderInsideNewFileLocation;

    @FindBy(xpath = "//*[@id=\"fileList\"]//span[.='HulyaFileAdded']/../following-sibling::span//span[@class='icon icon-more']/..")
    public WebElement newFolder3Dots;

    @FindBy(xpath = "//li[@class=' action-delete-container']")
    public WebElement deleteFolderBtn;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolderBtn;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement first3dots;
}
