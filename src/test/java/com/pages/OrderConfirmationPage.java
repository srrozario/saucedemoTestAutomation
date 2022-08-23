package com.pages;

import com.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BaseTest {
    @FindBy(id="back-to-products")
    WebElement backToHomeEl;

    public OrderConfirmationPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage clickOnBackToHomeBtn(){
        backToHomeEl.isDisplayed();
        backToHomeEl.click();
        return new HomePage();
    }
}
