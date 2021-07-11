package com.swaglabs.tech.pageObjects;

import com.swaglabs.tech.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseClass {

    WebDriver localDriver;
    public LoginPage(WebDriver remoteDriver) {
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(css = "div[class='login_logo']")
    @CacheLookup
    WebElement loginLogo;

    @FindBy(id = "user-name")
    @CacheLookup
    WebElement userNameField;

    @FindBy(id = "password")
    @CacheLookup
    WebElement passwordField;

    @FindBy(id = "login-button")
    @CacheLookup
    WebElement loginButton;

    @FindBy(css = "span[class='title']")
    @CacheLookup
    WebElement productsTitle;

    public void checkLogo() throws Exception {
        if (loginLogo.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Logo is displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Logo is not displayed");
            captureScreen(localDriver, "Login Test");
        }
    }

    public void setUserName(String user) {
        userNameField.click();
        userNameField.clear();
        userNameField.sendKeys(standardUser);
    }

    public void setPassword(String password) {
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void checkLogin() throws Exception {
        if (productsTitle.getText().contains("Products")) {
            Assert.assertTrue(true);
            logger.info("Successfully log in");
        } else {
            Assert.assertFalse(false);
            logger.info("Login failed");
            captureScreen(localDriver, "login Test");
        }
    }


}
