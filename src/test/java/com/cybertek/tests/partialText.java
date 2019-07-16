package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Auto")).click();
        driver.findElement(By.partialLinkText("Home")).click();

    }
}
