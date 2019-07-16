package com.cybertek.tests;

import com.cybertek.utilities.VerificationUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickExample {
    public static void main(String[] args)throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        String exp = "http://practice.cybertekschool.com/forgot_password";
        VerificationUtility.verifyEquals(url, exp);
        WebElement input= driver.findElement(By.name("email"));
        input.sendKeys("mirshod.tairov@gmail.com");
        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.id("form_submit"));
        submit.submit();
        //submit.click();


    }
}
