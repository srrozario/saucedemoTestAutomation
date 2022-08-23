package com.pages;

import com.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BaseTest {
    @FindBy(id="checkout")
    WebElement checkoutBtnEl;

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    public CheckoutPage clickCheckout() {
        checkoutBtnEl.isDisplayed();
        checkoutBtnEl.click();
        return new CheckoutPage();
    }
}
