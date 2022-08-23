package com.pages;

import com.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BaseTest {
    @FindBy (id="first-name")
    WebElement firstNameEl;

    @FindBy (id="last-name")
    WebElement lastNameEl;

    @FindBy (id="postal-code")
    WebElement zipCodeEl;

    @FindBy (id="continue")
    WebElement continueBtnEl;

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    public CheckoutPage insertFirstName(String firstName){
        firstNameEl.isDisplayed();
        firstNameEl.sendKeys(firstName);
        return this;
    }

    public CheckoutPage insertLastName(String lastName){
        lastNameEl.isDisplayed();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public CheckoutPage insetZipCode(String zipCode){
        zipCodeEl.isDisplayed();
        zipCodeEl.sendKeys(zipCode);
        return this;
    }

    public OrderDetailsPage scrollAndClickOnContinueBtn(){
        scrollToBottom();
        continueBtnEl.isDisplayed();
        continueBtnEl.click();
        return new OrderDetailsPage();
    }
}
