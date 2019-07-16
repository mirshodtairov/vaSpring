package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTerm {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        String term = "charger";
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("charger"+ Keys.ENTER);
        String title = driver.getTitle();
        if(title.contains(term)){
            System.out.println("PASS");
        }else{
            System.out.println("FIL");
            System.out.println("term = " + term);
            System.out.println("title = " + title);
        }


//
//        if(term.equalsIgnoreCase("ArsenalFC")){
//            System.out.println("Pass");
//        }else{
//            System.out.println("FAIL");
//            System.out.println("expected result ArsenalFC");
//            System.out.println("term = " + term);
//        }
    }
}
