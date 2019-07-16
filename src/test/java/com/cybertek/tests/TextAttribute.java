package com.cybertek.tests;

import com.cybertek.utilities.VerificationUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAttribute {

    public static void test004() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.name("email"));
        String exp = "randomemail@gmail.com";
        emailInput.sendKeys(exp);
        Thread.sleep(1000);

        // getAttribute --> returns the value of the given atrribute of the element
        System.out.println(emailInput.getAttribute("name"));
        System.out.println(emailInput.getAttribute("type"));

        // getAttribute(value) --> use this to get text from input box etc
        String act = emailInput.getAttribute("value");
        System.out.println("act = " + act);
//
        VerificationUtility.verifyEquals(exp, act);

        // getAttribute("innerHTML")  --> if getAttribute(value) does not work, use this ones
        System.out.println(emailInput.getAttribute("innerHTML"));

        //  getAttribute("outerHTML")  --> returns the HTML of given element
        System.out.println(emailInput.getAttribute("outerHTML"));

        // HOW TO DELETE TEXt FROM INPUT FIELD

        emailInput.clear();

    }




}
