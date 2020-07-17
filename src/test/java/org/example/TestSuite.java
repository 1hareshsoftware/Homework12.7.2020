package org.example;


import org.junit.Assert;
import org.junit.Test;

public class TestSuite extends BrowserSetup {

    //HomePage homePage = new HomePage();
    BookPage bookPage = new BookPage();

    @Test
    public void book() throws InterruptedException {
        //homePage.clickOnBooks();
        //homePage.getTextToBooks();
        bookPage.Books();
    }


}