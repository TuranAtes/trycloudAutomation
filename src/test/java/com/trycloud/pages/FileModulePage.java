package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy (xpath = "//a[@class='button new']")
    public WebElement addButtonIcon;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//*[@id=\"fileList\"]//span[.='HELLOWORLD']")
    public WebElement uploadedFileLocation;

    @FindBy(xpath = "//*[@id=\"fileList\"]//span[.='HOME']/../following-sibling::span//span[@class='icon icon-more']/..")
    public WebElement chosenUploadedFile3dots;

    @FindBy(xpath = "//span[.='Delete file']")
    public WebElement deleteFileBtn;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolderBtn;

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


    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']")
    public WebElement detailsBttn;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentBttn;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement commentBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement commentBoxSubmit;


    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement commentVerify;



/*    @FindBy(xpath = "//tr//span[@class='innernametext']/..")
    public List<WebElement> AllDeletedFolderElement;

    @FindBy(xpath = "//tr[1]//span[@class='innernametext']")
    public WebElement locationofthreedat;


    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedmodule;
    @FindBy(xpath = "//span[.='Delete folder']")
    public WebElement deletedddfolder;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionbutton1;

    @FindBy(xpath = "(//span[.=' Restore']/..)[204]")
    public List<WebElement> restoreButton;

    @FindBy(xpath = "(//span[.='JamesBond'])[4]")
    public List<WebElement> jamesbond;


    @FindBy(xpath = "(//span[.='Master of Engineering'])[2]")
    public WebElement Masterofengineer;



    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionmy;*/


    @FindBy(xpath = "//tr[1]//span[@class='innernametext']")
    public WebElement mertchosenFolderForDelete;

    public void mertactionIconSubOptionsNavigate(String optionName){
        String optionLocator="//span[.='"+optionName+"']/..";
        BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath(optionLocator)),5);
        BrowserUtils.highlight(Driver.getDriver().findElement(By.xpath(optionLocator)));
        Driver.getDriver().findElement(By.xpath(optionLocator)).click();
    }

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement mertdeletedFilesModule;
    @FindBy(xpath = "//tr//span[@class='innernametext']/..")
    public List<WebElement> mertdeletedFilesFoldersList;

    @FindBy(xpath = "//span[.=' Restore']/..")
    public List<WebElement> mertrestoreBtn;


    @FindBy(xpath = "//a[@data-action='menu']//span/..")
    public WebElement mertfirst3dots;






















}
