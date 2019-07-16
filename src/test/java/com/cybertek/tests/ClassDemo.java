package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo {
    public static void main(String[] args) {
       class2();

    }
    public static void class1(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.className("subheader")).getText());
        driver.findElement(By.className("nav-link")).click();

    }

    public static void class2(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.className("btn btn-primary")).getText());
    }
}
