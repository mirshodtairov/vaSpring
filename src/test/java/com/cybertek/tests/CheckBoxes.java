package com.cybertek.tests;

import com.cybertek.utilities.VerificationUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        driver.findElement(By.xpath("//input[1]")).click();
        WebElement one = driver.findElement(By.xpath("//input[1]"));
        WebElement two = driver.findElement(By.xpath("//input[2]"));
        System.out.println("One: " + one.isSelected());
        System.out.println("Two: " + two.isSelected());
        System.out.println("verifying default");
        VerificationUtility.verifySelected(one, false);
        VerificationUtility.verifySelected(two, true);
        System.out.println("Clicking on one");
        one.click();

        VerificationUtility.verifySelected(one, true);
        VerificationUtility.verifySelected(two, true);

        System.out.println("clicking on two");
        two.click();
        VerificationUtility.verifySelected(one, true);
        VerificationUtility.verifySelected(two, false);


        // How to see if element is selected using its attributes
        System.out.println(one.getAttribute("type"));
        System.out.println(one.getAttribute("checked"));
        System.out.println(two.getAttribute("checked"));




    }
}
