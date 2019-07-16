package com.cybertek.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo {
    public static void main(String[] args) {
        v1();



    }
    public static void v1() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.name("full_name"));
        Faker f = new Faker();
        String FirstName = f.name().name();
        name.sendKeys(FirstName);
        Faker f2 =  new Faker();
        String pass = f2.artist()+"@gamil.com";
        driver.findElement(By.name("email")).sendKeys(pass);


    }
}
