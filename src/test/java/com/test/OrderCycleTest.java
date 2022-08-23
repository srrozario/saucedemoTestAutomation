package com.test;

import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrderCycleTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    public OrderCycleTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(getUsername(), getPassword());
    }

    @DataProvider
    public Object[][] getTestData() {
        Object data[][] = GeneralUtil.getTestData("contactInfo");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public void successfullyOderAnItem(String firstName, String lastName, String zipCode) {
        homePage = homePage
                .clickAddToCartAndCheckout()
                .clickCheckout()
                .insertFirstName(firstName)
                .insertLastName(lastName)
                .insetZipCode(zipCode)
                .scrollAndClickOnContinueBtn()
                .scrollAndClickOnFinishBtn()
                .clickOnBackToHomeBtn();
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

