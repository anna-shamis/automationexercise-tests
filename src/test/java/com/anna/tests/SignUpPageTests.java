package com.anna.tests;
import com.anna.pages.*;
import com.anna.utils.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTests extends Base {

    @Test
    public void testSignupFormIsVisible() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible(), "Home page is not visible");

        homePage.clickSignupLogin();

        SignUpPage signupPage = new SignUpPage(driver);
        Assert.assertTrue(signupPage.isSignupFormVisible(), "Signup form is not visible");
    }

    @Test
    public void testEnterNameAndEmailToSignUp()  {

        HomePage homePage = new HomePage(driver);
        homePage.clickSignupLogin();

        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isSignupFormVisible(), "'New User Signup!' form not visible");


        String name = "Anna";
        String email = "annatest" + System.currentTimeMillis() + "@example.com";  // unique email

        signUpPage.enterNameToSignUp(name);
        signUpPage.enterEmailToSignUp(email);
        signUpPage.clickSignupButton();

        AccountInfoPage accountInfoPage = new AccountInfoPage(driver);
        Assert.assertTrue(accountInfoPage.isEnterAccountInfoVisible(), "'ENTER ACCOUNT INFORMATION' is not visible");

    }
    @Test
    public void endToEndUserRegistrationAndDeletion() throws InterruptedException {
        driver.get("https://automationexercise.com");

        // Step 1–3: Home Page
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible(), "Home page is not visible");

        homePage.clickSignupLogin();
        Thread.sleep(5000);
        // Step 4–8: Signup Page
        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isSignupFormVisible(), "Signup form not visible");
        Thread.sleep(5000);
        String testEmail = "test" + System.currentTimeMillis() + "@example.com";
        signUpPage.enterNameToSignUp("Anna");
        signUpPage.enterEmailToSignUp(testEmail);
        signUpPage.clickSignupButton();
        Thread.sleep(5000);
        // Step 9–13: Account Info Page
        AccountInfoPage accountInfoPage = new AccountInfoPage(driver);
        Assert.assertTrue(accountInfoPage.isEnterAccountInfoVisible(), "Account info form not visible");
        Thread.sleep(5000);
        accountInfoPage.fillAccountDetails(
                "Mrs", "Anna", testEmail, "123456", "5", "May", "1990",
                true, true,
                "Anna", "Smith", "OpenAI", "123 Main St", "Apt 1",
                "United States", "NY", "New York", "10001", "1234567890"
        );
        accountInfoPage.clickCreateAccount();
        Thread.sleep(5000);
        // Step 14–15: Account Created Page
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
        Assert.assertTrue(accountCreatedPage.isAccountCreatedMessageVisible(), "Account Created message not visible");
        accountCreatedPage.clickContinueButton();
        Thread.sleep(5000);
        // Step 16: Logged In
        Assert.assertTrue(homePage.isLoggedInAsVisible(), "Logged in as username not visible");
        Thread.sleep(5000);
        // Step 17–18: Delete Account
        homePage.clickDeleteAccount();
        Thread.sleep(5000);
        AccountDeletedPage accountDeletedPage = new AccountDeletedPage(driver);
        Assert.assertTrue(accountDeletedPage.isAccountDeletedMessageVisible(), "Account Deleted message not visible");
        accountDeletedPage.clickContinueButton();
    }
}










