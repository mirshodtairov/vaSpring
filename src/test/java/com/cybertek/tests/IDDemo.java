package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDDemo {
    public static void main(String[] args) {
        v1();







    }
    public static void v1(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.name("username"));
        login.click();
        login.sendKeys("user123@gmail.com");


    }
}
