package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.LoginPage;
import org.testng.annotations.Test;

// attempt to login with locked user

public class LoginTest_002 extends BaseClass {

    @Test
    public void LoginTest() throws Exception {
        driver.get(baseURL);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.checkLogo();
        loginPage.setUserName(lockedUser);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        loginPage.checkErrorMessage();
        loginPage.closeErrorMessage();
        loginPage.checkHidingElement();
    }
}
