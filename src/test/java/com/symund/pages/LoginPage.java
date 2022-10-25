package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameBtn;

    @FindBy(id = "password")
    public WebElement passwordBtn;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@title='Zalina']")
    public WebElement usernameOnDashboard;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement username1OnDashboard;








}
