package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearchResults {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("wooden spoon"+ Keys.ENTER);
        String result = driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println("result = " + result);

    }
}
