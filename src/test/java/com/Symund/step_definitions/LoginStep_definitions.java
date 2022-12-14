package com.Symund.step_definitions;

import com.github.javafaker.Faker;
import com.Symund.pages.LoginPage;
import com.Symund.utilities.BrowserUtils;
import com.Symund.utilities.ConfigurationReader;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStep_definitions {

    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("symundUrl"));
    }
    @When("The user logs in")
    public void the_user_logs_in() {

        loginPage.usernameBtn.sendKeys(ConfigurationReader.getProperty("symundUsername"));
        loginPage.passwordBtn.sendKeys(ConfigurationReader.getProperty("symundPsw"));

    }
    @When("The user clicks on Log in button")
    public void the_user_clicks_on_log_in_button() {

        loginPage.loginBtn.click();

    }

    @When("The user pushes ENTER")
    public void the_user_pushes_enter() {

        loginPage.passwordBtn.sendKeys(""+ Keys.ENTER);
    }



    @Then("The user is on the dashboard page")
    public void the_user_is_on_the_dashboard_page() {

        loginPage.username1OnDashboard.click();

        loginPage.usernameOnDashboard.isDisplayed();

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Dashboard"));
        System.out.println(actualTitle);
    }

    @When("The user enters invalid username and password")
    public void the_user_enters_invalid_username_and_password() {
        loginPage.usernameBtn.sendKeys(loginPage.fakeUsername);
        loginPage.passwordBtn.sendKeys(loginPage.fakePassword);
        loginPage.loginBtn.click();


    }
    @Then("Wrong username or password should be displayed for invalid credentials")
    public void wrong_username_or_password_should_be_displayed_for_invalid_credentials() {

        loginPage.wrongUsernameAndPassword.isDisplayed();


    }

    @When("The user types only the username")
    public void the_user_types_only_the_username() {

        loginPage.usernameBtn.sendKeys(ConfigurationReader.getProperty("symundUsername"));
        loginPage.loginBtn.click();
    }
    @Then("Please fill out this field message should be displayed")
    public void please_fill_out_this_field_message_should_be_displayed() {

       Assert.assertTrue(loginPage.passwordBtn.getTagName().equals("input"));



        BrowserUtils.sleep(2);
        System.out.println(loginPage.passwordBtn.getAttribute("validationMessage"));
       Assert.assertEquals("Please fill out this field.",loginPage.
               passwordBtn.getAttribute("validationMessage"));

    }

    @When("When the user types password")
    public void when_the_user_types_password() {
        loginPage.usernameBtn.sendKeys(ConfigurationReader.getProperty("symundUsername"));
        loginPage.passwordBtn.sendKeys(ConfigurationReader.getProperty("symundPsw"));
    }
    @Then("The user see the password in form of dots by default")
    public void the_user_see_the_password_in_form_of_dots_by_default() {

        Assert.assertEquals("password", loginPage.passwordBtn.getAttribute("type"));
        System.out.println("loginPage.passwordBtn.getAttribute(\"type\") = " + loginPage.passwordBtn.getAttribute("type"));
    }

    @Then("The user see the password explicitly")
    public void the_user_see_the_password_explicitly() {

        loginPage.togglePassword.click();


        Assert.assertEquals("text", loginPage.passwordBtn.getAttribute("type"));
        System.out.println("loginPage.passwordBtn.getAttribute(\"type\") = " + loginPage.passwordBtn.getAttribute("type"));

    }

    @When("The user types only password")
    public void the_user_types_only_password() {
        loginPage.passwordBtn.sendKeys(ConfigurationReader.getProperty("symundPsw"));
        loginPage.loginBtn.click();
}

    @Then("Please fill out this field \\(usernameField) message should be displayed")
    public void please_fill_out_this_field_username_field_message_should_be_displayed() {

        Assert.assertTrue(loginPage.usernameBtn.getTagName().equals("input"));



        BrowserUtils.sleep(2);
        System.out.println(loginPage.usernameBtn.getAttribute("validationMessage"));
        Assert.assertEquals("Please fill out this field.",loginPage.
                usernameBtn.getAttribute("validationMessage"));
    }


    @When("The user see Forgot password")
    public void the_user_see_forgot_password() {

        Assert.assertTrue(loginPage.forgotPasswordBtn.isDisplayed());

        System.out.println("loginPage.forgotPasswordBtn.isDisplayed() = " + loginPage.forgotPasswordBtn.isDisplayed());
    }
    @When("The user clicks on Forgot passwort field")
    public void the_user_clicks_on_forgot_passwort_field() {

        loginPage.forgotPasswordBtn.click();
    }
    @Then("The user see Reset password field on the next page")
    public void the_user_see_reset_password_field_on_the_next_page() {

        Assert.assertTrue(loginPage.resetPassword.isDisplayed());

        System.out.println("loginPage.resetPassword.isDisplayed() = " + loginPage.resetPassword.isDisplayed());

    }

    @Then("The user see placeholders on Username and Password fields")
    public void the_user_see_placeholders_on_username_and_password_fields() {

        Assert.assertTrue(loginPage.usernamePlaceholder.isDisplayed());
        Assert.assertTrue(loginPage.passwordPlaceholder.isDisplayed());
    }



}
