package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement in = driver.findElement(By.xpath("//*[@type='text']"));
        in.sendKeys("edfsdd");

        WebElement en = driver.findElement(By.xpath("//*[@name='email']"));
        en.sendKeys("edfsdd");

    }
}
