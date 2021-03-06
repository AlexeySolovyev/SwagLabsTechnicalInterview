package com.swaglabs.tech.pageObjects;

import com.swaglabs.tech.testCases.BaseClass;
import org.openqa.selenium.By;
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

    @FindBy(css = "div[class='bot_column']")
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

    @FindBy(id = "react-burger-menu-btn")
    @CacheLookup
    WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    @CacheLookup
    WebElement logoutLink;

    @FindBy(css = "h3[data-test='error']")
    @CacheLookup
    WebElement errorMessage;

    @FindBy(css = "button[class='error-button']")
    @CacheLookup
    WebElement closeErrorButton;

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
        userNameField.sendKeys(user);
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
        if (productsTitle.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Successful login");
        } else {
            Assert.assertFalse(false);
            logger.info("Login failed");
            captureScreen(localDriver, "Login Test with standard_user");
        }
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickLogout() {
        logoutLink.click();
    }

    public void checkLogout() throws Exception {
        if (localDriver.findElement(By.cssSelector("div[class='bot_column']")).isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Successful logout");
        } else {
            Assert.assertFalse(false);
            logger.info("Logout failed");
            captureScreen(localDriver, "Test logout with standard_user");
        }
    }

    public void checkErrorMessage() throws Exception {
        if (errorMessage.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Login error message is displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Login error message is not displayed");
            captureScreen(localDriver, "Test login with locked_out_user");
        }
    }

    public void closeErrorMessage() {
        closeErrorButton.click();
    }

    public void checkHidingElement() throws Exception {
        if (localDriver.findElement(By.cssSelector("div[class='error-message-container']")).getText().isEmpty()) {
            Assert.assertTrue(true);

        } else {
            Assert.assertFalse(false);
            captureScreen(localDriver, "Test login with locked_out_user");
        }
    }
}
