package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());

        driver.findElement(By.tagName("input")).sendKeys("Admiral Kunka");
        driver.findElement(By.name("email")).sendKeys("123ab@yahoo.com");

        driver.findElement(By.tagName("button")).click();


    }
}
