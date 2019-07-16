package com.cybertek.tests;

import com.cybertek.utilities.VerificationUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        if(!driver.findElement(By.id("blue")).isSelected()) {
            driver.findElement(By.id("blue")).click();
        }
        if(!driver.findElement(By.id("red")).isSelected()) {
            driver.findElement(By.id("red")).click();
        }

        VerificationUtility.verifySelected(driver.findElement(By.id("red")),true);







    }
}
