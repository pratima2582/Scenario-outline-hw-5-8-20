package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util
{
    public static LoadProp loadProp = new LoadProp();
    public static final String USERNAME = loadProp.getProperty("USERNAME");
    public static final String ACCESS_KEY = loadProp.getProperty("ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY+ "@ondemand.us-west-1.saucelabs.com:443/wd/hub";


    public void setBrowser()
    {
        String browsername = loadProp.getProperty("browserName");

        boolean SAUCE_LAB = false;


        if (SAUCE_LAB) {
            System.out.println("sauslab is opening  ");
            //giving if condition to check cross browser
            if (browsername.equalsIgnoreCase("chrome")) {

                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "83");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            } else if (browsername.equalsIgnoreCase("firefox")) {

                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "83");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if (browsername.equalsIgnoreCase("ie")) {

                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "84");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Please enter valid BrowserName : " + browsername);
            }
        }
        else
            {
                if (loadProp.getProperty("browserName").equalsIgnoreCase("chrome")) {

                    System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
                    driver = new ChromeDriver();     //creating chrome driver object to open google chrome browser


                } else if (loadProp.getProperty("browserName").equalsIgnoreCase("firefox")) {
                    System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
                    driver = new FirefoxDriver();

                } else if (loadProp.getProperty("browserName").equalsIgnoreCase("ie")) {
                    System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
                     DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                     caps.setCapability("ignoreZoonSetting",true);

                    driver = new InternetExplorerDriver();

                } else {
                    System.out.println("Please enter valid BrowserName : " + browsername);
                }


            }
        driver.get(loadProp.getProperty("url"));   //open the URL
        driver.manage().window().maximize();   //maximizing screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //giving implicity wait
        }

        public void closeBrowser ()
        {
            driver.close();
        }
    }
