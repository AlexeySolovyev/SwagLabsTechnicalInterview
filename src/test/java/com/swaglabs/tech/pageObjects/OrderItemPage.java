package com.swaglabs.tech.pageObjects;

import com.swaglabs.tech.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(css = "span[class='title']")
    @CacheLookup
    WebElement productsTitle;

    @FindBy(id = "item_4_title_link")
    @CacheLookup
    WebElement itemTitle;

    @FindBy(css = "div[class='inventory_details_name large_size']")
    @CacheLookup
    WebElement singleItemTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    @CacheLookup
    WebElement addToCartButton;

    @FindBy(xpath = "//span[contains(text(),'1')]")
    @CacheLookup
    WebElement fullCartIcon;

    @FindBy(id = "back-to-products")
    @CacheLookup
    WebElement backToProductsButton;

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
}
