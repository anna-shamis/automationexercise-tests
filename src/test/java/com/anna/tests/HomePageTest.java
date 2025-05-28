package com.anna.tests;

import com.anna.utils.Base;
import org.testng.annotations.Test;

public class HomePageTest extends Base {

    @Test
    public void verifyTitle() {
        driver.get("https://automationexercise.com");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);


    }


}