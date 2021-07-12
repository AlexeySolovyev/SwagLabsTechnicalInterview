package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.OrderItemPage;

public class OrderItemTest_004 extends BaseClass {

    public void OrderItemTest() throws Exception {
        driver.get(baseURL);
        OrderItemPage orderPage = new OrderItemPage(driver);

    }
}
