package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSetup extends BasePage {

    @Before
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src\\Resource\\BrowserSetup\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/books");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/books");
        System.out.println("Book Page");
    }

    @After
    public void closeBrowser()
    {
        //driver.close();
    }

}
