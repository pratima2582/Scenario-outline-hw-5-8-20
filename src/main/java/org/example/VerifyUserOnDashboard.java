package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VerifyUserOnDashboard extends  Util
{
    private By _dashBoardActualText = By.xpath("//div[@class=\"head\"]/h1");
    private String _dashboardExpectedText = "Dashboard";

    public void verifyUserIsOnDashboard()
    {
        Assert.assertEquals(getElement(_dashBoardActualText),_dashboardExpectedText,"You havent log in successfully");
    }
}
