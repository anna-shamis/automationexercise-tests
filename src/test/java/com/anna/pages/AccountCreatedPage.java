package com.anna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage {

    public AccountCreatedPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Elements

    @FindBy(xpath = "//b[text()='Account Created!']")
    private WebElement accountCreatedMessage;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueButton;

    // Methods

    public boolean isAccountCreatedMessageVisible() {
        return accountCreatedMessage.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}