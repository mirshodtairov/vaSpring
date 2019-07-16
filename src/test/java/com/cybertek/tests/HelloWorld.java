package com.cybertek.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

    public static void main(String[] args) {

        Faker f = new Faker();
        System.out.println(f.name().name());
        System.out.println(f.address().city());






//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        WebElement search = driver.findElement(By.name("q"));
//        search.sendKeys("Furkand Berat Cakir sucks"+ Keys.ENTER);

    }
}
