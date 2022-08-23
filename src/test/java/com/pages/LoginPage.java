package com.pages;

import com.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameEl;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordEl;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButtonEl;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String username, String password) {
        usernameEl.isDisplayed();
        usernameEl.sendKeys(username);
        passwordEl.isDisplayed();
        passwordEl.sendKeys(password);
        loginButtonEl.click();
        return new HomePage();
    }
}
