package com.anna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInformationPage {

    public AccountInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Elements

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement accountInfoHeader;

    @FindBy(id = "id_gender2")
    private WebElement titleMrsRadio;

    @FindBy(id = "id_gender1")
    private WebElement titleMrRadio;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "days")
    private WebElement daysDropdown;

    @FindBy(id = "months")
    private WebElement monthsDropdown;

    @FindBy(id = "years")
    private WebElement yearsDropdown;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    private WebElement offersCheckbox;

    @FindBy(id = "first_name")
    private WebElement firstNameInput;

    @FindBy(id = "last_name")
    private WebElement lastNameInput;

    @FindBy(id = "company")
    private WebElement companyInput;

    @FindBy(id = "address1")
    private WebElement address1Input;

    @FindBy(id = "address2")
    private WebElement address2Input;

    @FindBy(id = "country")
    private WebElement countryDropdown;

    @FindBy(id = "state")
    private WebElement stateInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "zipcode")
    private WebElement zipcodeInput;

    @FindBy(id = "mobile_number")
    private WebElement mobileInput;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    // Methods

    public boolean isAccountInfoHeaderVisible() {
        return accountInfoHeader.isDisplayed();
    }

    public void selectTitle(String gender) {
        if (gender.equalsIgnoreCase("Mrs")) {
            titleMrsRadio.click();
        } else {
            titleMrRadio.click();
        }
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        new org.openqa.selenium.support.ui.Select(daysDropdown).selectByVisibleText(day);
        new org.openqa.selenium.support.ui.Select(monthsDropdown).selectByVisibleText(month);
        new org.openqa.selenium.support.ui.Select(yearsDropdown).selectByVisibleText(year);
    }

    public void checkNewsletter() {
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }
    }

    public void checkOffers() {
        if (!offersCheckbox.isSelected()) {
            offersCheckbox.click();
        }
    }

    public void fillAddressInfo(String firstName, String lastName, String company,
                                String address1, String address2, String country,
                                String state, String city, String zip, String mobile) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        companyInput.sendKeys(company);
        address1Input.sendKeys(address1);
        address2Input.sendKeys(address2);
        new org.openqa.selenium.support.ui.Select(countryDropdown).selectByVisibleText(country);
        stateInput.sendKeys(state);
        cityInput.sendKeys(city);
        zipcodeInput.sendKeys(zip);
        mobileInput.sendKeys(mobile);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}