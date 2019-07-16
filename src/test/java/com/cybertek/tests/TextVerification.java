package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {
    public static void main(String[] args)throws Exception {
        test001();


    }
        public static void test001()throws Exception {
            WebDriver driver = new ChromeDriver();
            driver.get("http://practice.cybertekschool.com/forgot_password");

            driver.manage().window().maximize();
            Thread.sleep(2000);
            String url = driver.getCurrentUrl();
            String exp = "http://practice.cybertekschool.com/forgot_password";

            WebElement input = driver.findElement(By.name("email"));
            input.sendKeys("mirshod.tairov@gmail.com");
            Thread.sleep(2000);

            WebElement submit = driver.findElement(By.id("form_submit"));
            submit.submit();
            WebElement message = driver.findElement(By.name("confirmation_message"));
            System.out.println(message.getText());

        }


    }


