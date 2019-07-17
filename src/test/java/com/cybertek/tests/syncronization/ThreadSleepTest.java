package com.cybertek.tests.syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadSleepTest {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");
        Thread.sleep(4000);
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(5000);
        WebElement message = driver.findElement(By.id("finish"));
        message.click();

    }

}
