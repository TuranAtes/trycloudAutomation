package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//input[@id='user']")
    public WebElement  usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement  passwordBox;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBttn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public  WebElement errorMessage;

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginBttn.click();
    }

}
