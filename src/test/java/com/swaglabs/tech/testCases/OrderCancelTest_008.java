package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.OrderItemPage;
import org.testng.annotations.Test;

public class OrderCancelTest_008 extends BaseClass {

    @Test
    public void orderCancelTest() throws Exception {
        driver.get(baseURL);
        OrderItemPage orderPage = new OrderItemPage(driver);

        orderPage.checkLogo();
        orderPage.setUserName(standardUser);
        orderPage.setPassword(password);
        orderPage.clickLoginButton();
        orderPage.checkProductsPage();
        orderPage.openBackpackCard();
        orderPage.clickAddToCartButtonBackpack();
        orderPage.checkOneCartIcon();
        orderPage.clickRemoveFromCartButtonBackpack();
        orderPage.checkEmptyCartIcon();
        orderPage.clickBackToProductsButton();
        orderPage.checkProductsPage();
        orderPage.clickMenuButton();
        orderPage.clickLogout();
        orderPage.checkLoginButton();
    }
}
