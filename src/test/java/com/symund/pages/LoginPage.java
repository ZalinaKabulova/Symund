package com.symund.pages;

import com.github.javafaker.Faker;
import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    Faker faker = new Faker();

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

    public String fakeUsername = faker.numerify("Employee/###");
    public String fakePassword = faker.name().nameWithMiddle();


    @FindBy (xpath = "//p[@class= 'warning wrongPasswordMsg']")
    public WebElement  wrongUsernameAndPassword;



    @FindBy (xpath = "//img[@alt='Toggle password visibility']")
    public WebElement togglePassword;












}
