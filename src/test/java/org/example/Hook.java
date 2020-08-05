package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Util
{
    BrowserManager browserManager = new BrowserManager();

@Before             //Before method
    public void openBrowser()
    {
    browserManager.setBrowser();
    }

                //after method
    @After
    public void closeBrowser()
    {
        browserManager.closeBrowser();
    }
}