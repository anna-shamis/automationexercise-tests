package com.anna.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement newUserSignupText;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement loginFormText;

    @FindBy(name = "name")
    private WebElement newUserNameInput;
    //(xpath="//input[@name='name']")

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement newUserEmailInput;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signupButton;


    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;


    // Methods to interact with elements

    public boolean isSignupFormVisible() {
        return newUserSignupText.isDisplayed();
    }
    public boolean isLoginFormVisible() {
        return loginFormText.isDisplayed();
    }
    public void enterNameToSignUp(String name) {
        newUserNameInput.clear();
        newUserNameInput.sendKeys(name);
    }

    public void enterEmailToSignUp(String email) {
       newUserEmailInput.clear();
        newUserEmailInput.sendKeys(email);
    }

    public void clickSignupButton() {
        signupButton.click();
    }
    public void enterEmailToLogin(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPasswordToLogin(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}