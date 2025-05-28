package com.anna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountInfoPage {

    public AccountInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Title radio buttons
    @FindBy(id = "id_gender1")
    private WebElement mrTitle;

    @FindBy(id = "id_gender2")
    private WebElement mrsTitle;

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
    private WebElement specialOffersCheckbox;

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
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement enterAccountInfoHeader;

    public boolean isEnterAccountInfoVisible() {
        return enterAccountInfoHeader.isDisplayed();
    }

    public void fillAccountDetails(
            String title, String name, String email, String password,
            String day, String month, String year,
            boolean signUpNewsletter, boolean receiveOffers,
            String firstName, String lastName, String company,
            String address1, String address2, String country,
            String state, String city, String zip, String mobile) {

        // Select title
        if (title.equalsIgnoreCase("Mr")) {
            mrTitle.click();
        } else {
            mrsTitle.click();
        }

        passwordInput.sendKeys(password);

        new Select(daysDropdown).selectByVisibleText(day);
        new Select(monthsDropdown).selectByVisibleText(month);
        new Select(yearsDropdown).selectByVisibleText(year);

        if (signUpNewsletter) newsletterCheckbox.click();
        if (receiveOffers) specialOffersCheckbox.click();

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        companyInput.sendKeys(company);
        address1Input.sendKeys(address1);
        address2Input.sendKeys(address2);
        new Select(countryDropdown).selectByVisibleText(country);
        stateInput.sendKeys(state);
        cityInput.sendKeys(city);
        zipcodeInput.sendKeys(zip);
        mobileNumberInput.sendKeys(mobile);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}