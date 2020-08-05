package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;

public class LoginPage extends Util {

    LoadProp loadProp = new LoadProp();

    private By _loginActualText = By.xpath("//div[text()='LOGIN Panel']");
    private String _loginExpected = "LOGIN Panel";
    private By _userName = By.xpath("//input[@name='txtUsername']");
    private By _password = By.xpath("//input[@name='txtPassword']");
    private By _clickOnLoginButton = By.xpath("//input[@type='submit']");

    // Negative scenario locators
    private By actual_validUsername_BlankPassword =By.cssSelector("span#spanMessage");
                 //locator for invalid user blank password
    private By actual_InvalidUsername_BlankPassword =By.cssSelector("span#spanMessage");

    private By actual_blankUsername_ValidPassword =By.cssSelector("span#spanMessage");
    private By actual_BlankUsername_InvalidPassword =By.cssSelector("span#spanMessage");

    private By actual_blankUsername_BlankPassword =By.xpath("//span[text()='Username cannot be empty']");
    private By actual_ValidUsername_InvalidPassword =By.xpath("//span[text()='Invalid credentials']");
    private By actual_InvalidUsername_ValidPassword =By.xpath("//span[text()='Invalid credentials']");
    private By actual_InvalidUsername_InvalidPassword =By.cssSelector("span#spanMessage");

                //created method to verify user is on login page
    public void verifyUserIsOnLoginPage()
    {
        Assert.assertEquals(getElement(_loginActualText),_loginExpected,"You havent navigated to login page");
    }
                //created a method to enter valid credential
    public  void user_Enters_Username_and_Password()
    {
        sendkeyElement(_userName,loadProp.getProperty("Username"));
        sendkeyElement(_password,loadProp.getProperty("Password"));
    }

                // created method to click on log in button
    public void userClickOnLoginButton()
    {
        clickable(_clickOnLoginButton);
    }

                //created method to enter user name trough feature file
    public void userEntersInvalidUsername(String invalidUsername)
    {
        sendkeyElement(_userName,invalidUsername);
    }

    //created method to enter user name trough feature file
    public void userEntersInvalidPassword (String invalidPassword)
    {

        sendkeyElement(_password,invalidPassword);
    }



            //created method to verify user can not login sucessfuly using invalid credential
    public void verifyUserCanNotLogInSuccessfully(String relatedMessage)
    {

        Assert.assertEquals(getElement(actual_validUsername_BlankPassword), relatedMessage, "Password cannot be empty");
        Assert.assertEquals(getElement(actual_InvalidUsername_BlankPassword), relatedMessage, "Password cannot be empty");
//        Assert.assertEquals(getElement(actual_blankUsername_ValidPassword), relatedMessage, "Username cannot be empty");
//        Assert.assertEquals(getElement(actual_BlankUsername_InvalidPassword), relatedMessage, "Username cannot be empty");
//        Assert.assertEquals(getElement(actual_blankUsername_BlankPassword), relatedMessage, "Username cannot be empty");
//        Assert.assertEquals(getElement(actual_ValidUsername_InvalidPassword), relatedMessage, "Invalid credentials");
//        Assert.assertEquals(getElement(actual_InvalidUsername_ValidPassword), relatedMessage, "Invalid credentials");
//
//        Assert.assertEquals(getElement(actual_InvalidUsername_InvalidPassword), relatedMessage, "Invalid credentials");

    }


}
