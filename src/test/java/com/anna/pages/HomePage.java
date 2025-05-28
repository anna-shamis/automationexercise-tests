package com.anna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // Constructor - initialize PageFactory elements
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Elements on Home Page

    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    private WebElement signUpLoginButton;

    @FindBy(xpath = "//a[contains(text(),'Delete Account')]")
    private WebElement deleteAccountButton;

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    private WebElement homePageImage;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    private WebElement loggedInAsText;

    // Methods to interact

    public void clickSignupLogin() {
        signUpLoginButton.click();
    }

    public boolean isHomePageVisible() {
        return homePageImage.isDisplayed();    }

    public boolean isLoggedInAsVisible() {
        return loggedInAsText.isDisplayed();
    }

    public void clickDeleteAccount() {
        deleteAccountButton.click();
    }
    public void goToLoginPage() {
        if (signUpLoginButton.isDisplayed()) {
            signUpLoginButton.click();
        }
    }





}