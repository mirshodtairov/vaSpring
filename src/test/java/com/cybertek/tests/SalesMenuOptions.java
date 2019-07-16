package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class SalesMenuOptions {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void test1(){
        driver.get("http://qa3.vytrack.com");


    }
    @Test
    public void test2() throws InterruptedException {
       
        driver.findElement(By.name("button"));
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager69");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='title title-level-1'])[4]")).getText(),"Sales");
        Thread.sleep(5000);

//        driver.findElement(By.xpath("//*[@id='user-menu']/a")).click();
//        driver.findElement(By.xpath("//*[@id='user-menu']/ul/li[5]/a")).click();
//        driver.findElement(By.id("prependedInput")).sendKeys("user3");
//        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);






    }
}
