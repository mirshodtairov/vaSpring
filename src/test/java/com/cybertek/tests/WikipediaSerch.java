package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSerch {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.com");
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium (software)"+ Keys.ENTER);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.endsWith("Selenium_(software)")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
