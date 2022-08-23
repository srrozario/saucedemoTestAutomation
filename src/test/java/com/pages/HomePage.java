package com.pages;
import com.base.BaseTest;
import com.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    @FindBy(id="react-burger-menu-btn")
    WebElement hamburgerMenuEl;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutButtonEl;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCartSauceBackpackEl;

    @FindBy(css="a.shopping_cart_link")
    WebElement addToCartIconEl;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLink() {
        return logoutButtonEl.isDisplayed();
    }

    public ShoppingCartPage clickAddToCartAndCheckout() {
        addToCartSauceBackpackEl.isDisplayed();
        addToCartSauceBackpackEl.click();
        addToCartIconEl.isDisplayed();
        addToCartIconEl.click();
        GeneralUtil.waitForDomStable();
        return new ShoppingCartPage();
    }
}
