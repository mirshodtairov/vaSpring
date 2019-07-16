package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyStatenameSorted {

    WebDriver driver;
    @BeforeMethod
    public  void open(){
        driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void test1(){
        WebElement states = driver.findElement(By.id("state"));
        Select list = new Select(states);
        List<WebElement> options= list.getOptions();
        System.out.println(options.size());
        for(int i =0; i<options.size()-1; i++) {
            String current = list.getOptions().get(i).getText();
            String next = list.getOptions().get(i + 1).getText();
            System.out.println("comparing: " + current + " with " + next);
            Assert.assertTrue(current.compareTo(next) <= 0);
        }

    }
}
