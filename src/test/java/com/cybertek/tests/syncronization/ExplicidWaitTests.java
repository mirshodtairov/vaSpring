package com.cybertek.tests.syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicidWaitTests {

    WebDriver driver;

    @Test
    public void testA(){
        driver = new ChromeDriver();
        //driver.get("");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void testB(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        WebDriverWait wait = new WebDriverWait(driver, 10);//creating object and time of the driver
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));//condition to happen

    }
    @Test
    public void testC(){
        //wait fro clickable
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement input = driver.findElement(By.cssSelector("#input-example>input"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(input));
        input.sendKeys("Hello world");

    }
    @Test
    public void testD(){
        //explicid wait is not helping, in this case use Thread sleep
        driver.get("http://qa3.vytrack.com");



    }



}
