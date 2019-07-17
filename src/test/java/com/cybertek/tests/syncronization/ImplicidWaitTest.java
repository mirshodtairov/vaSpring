package com.cybertek.tests.syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicidWaitTest {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");
        driver.findElement(By.tagName("button")).click();



        WebElement message = driver.findElement(By.id("finish"));
        message.click();

    }

}
