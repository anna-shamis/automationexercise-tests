package com.anna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDeletedPage {

    public AccountDeletedPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Elements

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeletedMessage;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueButton;

    // Methods

    public boolean isAccountDeletedMessageVisible() {
        return accountDeletedMessage.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}