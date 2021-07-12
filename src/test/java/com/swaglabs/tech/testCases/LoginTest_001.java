package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.LoginPage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

// login and logout with standard_user

public class LoginTest_001 extends BaseClass {

    @Test
    public void LoginTest() throws Exception {
        driver.get(baseURL);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.checkLogo();
        loginPage.setUserName(standardUser);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        loginPage.checkLogin();
        loginPage.clickMenuButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.clickLogout();
        loginPage.checkLogout();
    }
}
