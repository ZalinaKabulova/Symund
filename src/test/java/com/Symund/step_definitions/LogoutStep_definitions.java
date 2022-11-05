package com.Symund.step_definitions;

import com.Symund.pages.LoginPage;
import com.Symund.utilities.ConfigurationReader;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStep_definitions {

    LoginPage loginPage = new LoginPage();


    @Given("The user is already logged in")
    public void the_user_is_already_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("symundUrl"));

        loginPage.usernameBtn.sendKeys(ConfigurationReader.getProperty("symundUsername"));
        loginPage.passwordBtn.sendKeys(ConfigurationReader.getProperty("symundPsw"));
        loginPage.loginBtn.click();

    }


    @And("The user clicks on Log out button")
    public void the_user_clicks_on_log_out_button() {


        loginPage.logoutBtn.click();

    }

    @When("The user click on Log out Button")
    public void the_user_click_on_log_out_button() {

        loginPage.username1OnDashboard.click();

        loginPage.logoutBtn.click();
    }


    @Then("The user lands on log in page")
    public void the_user_lands_on_log_in_page() {

        String actualTitle = Driver.getDriver().getTitle();

        System.out.println(actualTitle);

        Assert.assertEquals("Symund - QA", actualTitle);
    }

    @Then("The user can not land on dashboard page again clicking Back button")
    public void the_user_can_not_land_on_dashboard_page_again_clicking_back_button() {

        Driver.getDriver().navigate().back();

        String actualTitle = Driver.getDriver().getTitle();

        System.out.println(actualTitle);

        Assert.assertEquals("Symund - QA", actualTitle);
    }

    @When("The user is already on the dashboard page")
    public void the_user_is_already_on_the_dashboard_page() {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Dashboard"));
        System.out.println(actualTitle);

        loginPage.username1OnDashboard.click();

    }
}