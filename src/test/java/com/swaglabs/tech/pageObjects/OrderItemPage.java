package com.swaglabs.tech.pageObjects;

import com.swaglabs.tech.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderItemPage extends BaseClass {

    WebDriver localDriver;
    public OrderItemPage(WebDriver remoteDriver) {
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

    @FindBy(id = "item_4_title_link")
    @CacheLookup
    WebElement itemTitleLink;

    @FindBy(css = "div[class='inventory_details_name large_size']")
    @CacheLookup
    WebElement singleItemTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    @CacheLookup
    WebElement addToCartButton;

    @FindBy(xpath = "//span[contains(text(),'1')]")
    @CacheLookup
    WebElement fullCartIcon;

    @FindBy(css = "a[class='shopping_cart_link']")
    @CacheLookup
    WebElement cartIcon;

    @FindBy(id = "back-to-products")
    @CacheLookup
    WebElement backToProductsButton;

    @FindBy(css = "span[class='title']")
    @CacheLookup
    WebElement cartTitle;

    @FindBy(id = "checkout")
    @CacheLookup
    WebElement checkoutButton;

    @FindBy(xpath = "//span[contains(text(),'Checkout')]")
    @CacheLookup
    WebElement checkoutTitle;

    @FindBy(id = "first-name")
    @CacheLookup
    WebElement firstNameField;

    @FindBy(id = "last-name")
    @CacheLookup
    WebElement lastNameField;

    @FindBy(id = "postal-code")
    @CacheLookup
    WebElement zipCodeField;

    @FindBy(id = "continue")
    @CacheLookup
    WebElement continueButton;

    @FindBy(xpath = "//div[contains(text(),'Total: $')]")
    @CacheLookup
    WebElement totalPrice;

    @FindBy(id = "finish")
    @CacheLookup
    WebElement finishButton;

    @FindBy(xpath = "//h2[contains(text(),'THANK YOU')]")
    @CacheLookup
    WebElement completeOrderMessage;

    @FindBy(id = "back-to-products")
    @CacheLookup
    WebElement backHomeButton;

    @FindBy(id = "react-burger-menu-btn")
    @CacheLookup
    WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    @CacheLookup
    WebElement logoutLink;


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

    public void checkProductsPage() throws Exception {
        if (driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Products page is displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Login failed");
            captureScreen(localDriver, "Product page is not displayed");
        }
    }

    public void openItemCard() {
        itemTitleLink.click();
    }

    public void checkItemCard() throws Exception {
        if (singleItemTitle.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Item card is displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Item card us not displayed");
            captureScreen(driver, "Order item test");
        }
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void checkCartIcon() throws Exception {
        if (fullCartIcon.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Cart with item is displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Can't see an item in the cart");
            captureScreen(driver, "Order item test");
        }
    }

    public void clickBackToProductsButton() {
        backToProductsButton.click();
    }

    public void clickOnCartIcon() {
        cartIcon.click();
    }

    public void checkCartPage() throws Exception {
        if (cartTitle.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Cart page has been displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Cart page has not bee displayed");
            captureScreen(driver, "Order item test");
        }
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public void setFirstUserName(String firstName) {
        firstNameField.click();
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void setLastUserName(String lastName) {
        lastNameField.click();
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void setZipCode(String zipCode) {
        zipCodeField.click();
        zipCodeField.clear();
        zipCodeField.sendKeys(zipCode);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void checkCheckoutTitle() throws Exception {
        if (checkoutTitle.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Checkout page has been displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Checkout title is not displayed");
            captureScreen(driver, "Checkout page has not been displayed");
        }
    }

    public void checkTotal() throws Exception {
        if (totalPrice.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Total price has been displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Checkout title is not displayed");
            captureScreen(driver, "Total price has not been displayed");
        }
    }

    public void clickFinishButton() {
        finishButton.click();
    }

    public void checkCompleteOrderMessage() throws Exception {
        if (completeOrderMessage.isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Success order message has been displayed");
        } else {
            Assert.assertFalse(false);
            logger.info("Checkout title is not displayed");
            captureScreen(driver, "Success order message has not been displayed");
        }
    }

    public void clickBackHomeButton() {
        backHomeButton.click();
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickLogout() {
        logoutLink.click();
    }

    public void checkLoginButton() throws Exception {
        if (driver.findElement(By.id("login-button")).isDisplayed()) {
            Assert.assertTrue(true);
            logger.info("Logout has been executed");
        } else {
            Assert.assertFalse(false);
            logger.info("Logout has not been performed");
            captureScreen(driver, "Order item test");
        }
    }
}
