package com.cybertek.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownWithoutTag {
    WebDriver driver;
    @BeforeMethod
    public void open(){
        driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public  void test1(){
        WebElement dropd= driver.findElement(By.partialLinkText("Dropdown link"));
        System.out.println(dropd.getText());



    }
}
