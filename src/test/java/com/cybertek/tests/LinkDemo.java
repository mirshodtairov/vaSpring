package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();





    }

}
