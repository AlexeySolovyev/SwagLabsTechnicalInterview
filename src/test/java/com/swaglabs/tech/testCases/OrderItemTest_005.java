package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.OrderItemPage;
import org.testng.annotations.Test;

// Order and item with performanceGlitchUser

public class OrderItemTest_005 extends BaseClass {

    @Test
    public void orderItemTest() throws Exception {
        driver.get(baseURL);
        OrderItemPage orderPage = new OrderItemPage(driver);

        orderPage.checkLogo();
        orderPage.setUserName(performanceGlitchUser);
        orderPage.setPassword(password);
        orderPage.clickLoginButton();
        orderPage.checkProductsPage();
        orderPage.openItemCard();
        orderPage.clickAddToCartButtonBackpack();
        orderPage.checkOneCartIcon();
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
        orderPage.clickMenuButton();
        orderPage.clickLogout();
        orderPage.checkLoginButton();
    }
}
