package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    public DashboardPage(){

            PageFactory.initElements(Driver.getDriver(),this);
        }

        public void subTabs(String subName){
            String AllSubTubs = "//li[@class='in-header']//a//span[.='"+subName+"'] ";
        }
        @FindBy(xpath = "//li[@class='in-header']//a")
        public List<WebElement> allTabs;

    @FindBy (xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement fileModule;


    @FindBy(xpath = "//span[@class='material-design-icon magnify-icon unified-search__trigger']")
    public WebElement magnifierIconBttn;

    @FindBy (xpath ="//input[@class='unified-search__form-input']")
    public WebElement searchBox;

    @FindBy (xpath ="//h3[@class='unified-search__result-line-one']")
    public WebElement searchInputResult;

    public String dashboardPageTitle(){
        return Driver.getDriver().getTitle();
    }






}
