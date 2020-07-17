package org.example;
import org.openqa.selenium.By;

public class BookPage extends Utils {

    private By books =By.className("page-title");
    private By SortByBooks= By.id("products-orderby");
    private By DisplayPerPage= By.id("products-pagesize");
    private By clickOnFirstProduct= By.cssSelector("div[class='buttons'] input:nth-child(1)");
    private By shoppingCart = By.cssSelector("a [class='cart-label']");
    private By terms = By.id("termsofservice");
    private By checkout= By.id("checkout");
    private By checkoutGuest = By.cssSelector("input[class='button-1 checkout-as-guest-button']");
    private By firstName = By.id("BillingNewAddress_FirstName");
    private By lastName = By.id("BillingNewAddress_LastName");
    private By email = By.id("BillingNewAddress_Email");
    private By company = By.id("BillingNewAddress_Company");
    private By country = By.id("BillingNewAddress_CountryId");
    private By india = By.cssSelector("#BillingNewAddress_CountryId > option:nth-child(101)");
    private By city = By.id("BillingNewAddress_City");
    private By address1 = By.id("BillingNewAddress_Address1");
    private By address2 = By.id("BillingNewAddress_Address2");
    private By zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    private By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By faxNumber = By.id("BillingNewAddress_FaxNumber");
    private By continuePage = By.cssSelector("input[class='button-1 new-address-next-step-button']");
    private By shippingMethod = By.id("shippingoption_2");
    private By shippingContinue = By.cssSelector("input[class='button-1 shipping-method-next-step-button']");
    private By paymentMethod = By.id("paymentmethod_1");
    private By paymentContinue = By.cssSelector("input[class='button-1 payment-method-next-step-button']");
    private By creditCard = By.id("CreditCardType");
    private By visa = By.cssSelector("#CreditCardType > option:nth-child(1)");
    private By cardholderName = By.id("CardholderName");
    private By cardNumber = By.id("CardNumber");
    private By expireMonth = By.cssSelector("#ExpireMonth > option:nth-child(2)");
    private By expireYear = By.cssSelector("#ExpireYear > option:nth-child(4)");
    private By cardCode = By.id("CardCode");
    private By cardDetailsContinue = By.cssSelector("input[class='button-1 payment-info-next-step-button']");
    private By confirm = By.cssSelector("input[class='button-1 confirm-order-next-step-button']");

    public void Books() throws InterruptedException {
        System.out.println(getTextFromElement(books));
            SelectByVisibletext(SortByBooks, "Name: A to Z");
            SelectByVisibletext(DisplayPerPage, "3");
            Thread.sleep(4000);
            ClickOnElement(clickOnFirstProduct);
            ClickOnElement(shoppingCart);
            Thread.sleep(4000);
            ClickOnElement(terms);
            ClickOnElement(checkout);
            ClickOnElement(checkoutGuest);
            enterText(firstName, "Haresh");
            enterText(lastName, "Katariya");
            enterText(email, "abc@haresh.com");
            enterText(company, "Atmiy");
            ClickOnElement(country);
            ClickOnElement(india);
            enterText(city, "Surat");
            enterText(address1, "D804 Ambika Heights");
            enterText(address2, "Surat, Guj.");
            enterText(zipPostalCode, "395010");
            enterText(phoneNumber, "07877970045");
            enterText(faxNumber, "098765432");
            ClickOnElement(continuePage);
            ClickOnElement(shippingMethod);
            ClickOnElement(shippingContinue);
            ClickOnElement(paymentMethod);
            ClickOnElement(paymentContinue);
            ClickOnElement(creditCard);
            ClickOnElement(visa);
            enterText(cardholderName, "Bhai");
            enterText(cardNumber, "4263982640269299");
            ClickOnElement(expireMonth);
            ClickOnElement(expireYear);
            enterText(cardCode, "837");
            ClickOnElement(cardDetailsContinue);
            ClickOnElement(confirm);
        }

}


