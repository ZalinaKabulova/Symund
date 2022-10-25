package com.symund.step_definitions;

import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_definitions {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("symundUrl"));
    }
    @When("The user logs in")
    public void the_user_logs_in() {

    }
    @When("The user clicks on Log in button")
    public void the_user_clicks_on_log_in_button() {


    }
    @Then("The user is on the dashboard page")
    public void the_user_is_on_the_dashboard_page() {

    }
}
