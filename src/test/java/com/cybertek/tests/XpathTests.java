package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathTests {



    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/signup_confirmation");
        System.out.println(
        driver.findElement(By.xpath("/html/body/div/div/div/div/a/i")).getText());
    }
    @Test
    public void test1(){//any tag
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.xpath("//button[@id='disappearing_button']")).click();

    }
    @Test
    public void test2(){//any attribute
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.xpath("//*[@id='disappearing_button']")).click();

    }
    @Test
    public void test3(){//dynamic xpath
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.xpath("//button[contains(@id, 'button')]")).click();

    }
    @Test
    public void test4(){//exact text
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.xpath("//button[.='Button 3']")).click();

    }
    @Test
    public void test5(){//partial text
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.xpath("//button[contains(text(), 'click')]")).click();

    }
    @Test
    public void test6(){//Nth child
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.xpath("//button[2]")).click();

    }
}
