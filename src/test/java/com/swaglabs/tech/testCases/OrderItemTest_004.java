package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.OrderItemPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

// Order an item with standard_user

public class OrderItemTest_004 extends BaseClass {

    @Test
    public void OrderItemTest() throws Exception {
        driver.get(baseURL);
        OrderItemPage orderPage = new OrderItemPage(driver);

        orderPage.checkLogo();
        orderPage.setUserName(standardUser);
        orderPage.setPassword(password);
        orderPage.clickLoginButton();
        orderPage.checkProductsPage();
        orderPage.openItemCard();
        orderPage.checkItemCard();
        orderPage.clickAddToCartButton();
        orderPage.checkCartIcon();
        orderPage.clickBackToProductsButton();
        orderPage.checkProductsPage();
        orderPage.clickOnCartIcon();
        orderPage.checkCartPage();
        orderPage.clickCheckoutButton();
        orderPage.setFirstUserName(firstUserName);
        orderPage.setLastUserName(lastUserName);
        orderPage.setZipCode(zipCode);
        orderPage.clickContinueButton();
        orderPage.checkCheckoutTitle();
        orderPage.checkTotal();
        orderPage.clickFinishButton();
        orderPage.checkCompleteOrderMessage();
        orderPage.clickBackHomeButton();
        orderPage.checkProductsPage();
        orderPage.checkProductsPage();
        orderPage.clickMenuButton();
        orderPage.clickLogout();
        orderPage.checkLoginButton();
    }
}
