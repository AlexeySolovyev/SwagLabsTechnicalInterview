package com.swaglabs.tech.testCases;

import com.swaglabs.tech.pageObjects.LoginPage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

// login and logout with performance_glitch_user

public class LoginTest_003 extends BaseClass {

    @Test
    public void LoginTest() throws Exception {
        driver.get(baseURL);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.checkLogo();
        loginPage.setUserName(performanceGlitchUser);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.checkLogin();
        loginPage.clickMenuButton();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.clickLogout();
        loginPage.checkLogout();
    }
}
