package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MtStepDef
{
    LoginPage loginPage = new LoginPage();
    VerifyUserOnDashboard verifyUserOnDashboard = new VerifyUserOnDashboard();
//
@Given("^user is on home page$")
public void user_is_on_home_page()
{
    loginPage.verifyUserIsOnLoginPage();


}

    @When("^user enters username and  password$")
    public void user_enters_username_and_password()
    {
        loginPage.user_Enters_Username_and_Password();

    }

    @When("^user clicks on login button$")
    public void user_clicks_on_login_button()
    {
        loginPage.userClickOnLoginButton();

    }

    @Then("^user should navigate to login page$")
    public void user_should_navigate_to_login_page()
    {
        verifyUserOnDashboard.verifyUserIsOnDashboard();
    }

    @When("^user enters invalid  \"([^\"]*)\"$")
    public void user_enters_invalid(String invalidUsername)
    {
       loginPage.userEntersInvalidUsername(invalidUsername);
    }

    @When("^user enters  \"([^\"]*)\"$")
    public void user_enters(String invalidPassword)
    {
       loginPage.userEntersInvalidPassword(invalidPassword);
    }

    @Then("^User should not be able to login successfully and see \"([^\"]*)\"$")
    public void user_should_not_be_able_to_login_successfully_and_see(String relatedMessage)
    {
       loginPage.verifyUserCanNotLogInSuccessfully(relatedMessage);
    }


}
