package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By books = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]");

    public void clickOnBooks() {
        ClickOnElement(books);
    }
    //public void getTextToBooks(){
    //System.out.println(getTextFromElement(books));}
}

