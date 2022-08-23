package com.pages;

import com.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage extends BaseTest {
    @FindBy(id="finish")
    WebElement finishBtnEl;

    public OrderDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    public OrderConfirmationPage scrollAndClickOnFinishBtn(){
        scrollToBottom();
        finishBtnEl.isDisplayed();
        finishBtnEl.click();
        return new OrderConfirmationPage();
    }
}
