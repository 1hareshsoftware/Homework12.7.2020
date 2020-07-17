package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Utils extends BasePage {

    //to click on element
    public static void ClickOnElement (By by){driver.findElement(by).click();}

    //to enter text
    public static void enterText (By by, String text) {driver.findElement(by).sendKeys(text);}

    //to get text from element
    public static String getTextFromElement(By by) {return driver.findElement(by).getText();}

    //to select from droplist by visible text
    public static void SelectByVisibletext(By by, String name){
        new Select(driver.findElement(by)).selectByVisibleText(name);
    }

}
