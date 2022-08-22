package com.pages;

import com.base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BaseTest {
    @FindBy(id="finish")
    WebElement finishBtnEl;


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
}
