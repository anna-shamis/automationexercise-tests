package com.anna.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
      driver = Driver.getDriver();
        System.out.println("before");
        driver.get("https://automationexercise.com");
    }

    @AfterMethod
    public void tearDown() {
       Driver.quitDriver();
        System.out.println("after");
    }

}