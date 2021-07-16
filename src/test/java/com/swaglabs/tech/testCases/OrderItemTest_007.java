package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.OrderItemPage;
import org.testng.annotations.Test;

// Order all items by standard_user

public class OrderItemTest_007 extends BaseClass {

    @Test
    public void orderItemTest() throws Exception {
        driver.get(baseURL);
        OrderItemPage orderPage = new OrderItemPage(driver);

        orderPage.checkLogo();
        orderPage.setUserName(standardUser);
        orderPage.setPassword(password);
        orderPage.clickLoginButton();
        orderPage.checkProductsPage();
        orderPage.clickAddToCartButtonBackpack();
        orderPage.clickAddToCartButtonBoltTshort();
        orderPage.clickAddToCartButtonOnesie();
        orderPage.clickAddToCartButtonBickelight();
        orderPage.clickAddToCartButtonJacket();
        orderPage.clickAddToCartButtonRedTshirt();
        orderPage.checkSixCartIcon();
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
