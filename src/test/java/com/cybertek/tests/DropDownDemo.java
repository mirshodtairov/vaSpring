package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownDemo {
    WebDriver driver;
    @BeforeMethod
    public void open(){
        driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void mainPart() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        Select list= new Select(dropdown);
        Thread.sleep(2000);
        list.selectByVisibleText("Option 2");
        WebElement year = driver.findElement(By.id("year"));
        Select listOfYaer= new Select(year);
        listOfYaer.selectByVisibleText("1988");

        WebElement month =driver.findElement(By.id("month"));
        Select outOfMonth = new Select(month);
        outOfMonth.selectByVisibleText("January");


        WebElement day =driver.findElement(By.id("day"));
        Select outOfDays = new Select(day);
        outOfDays.selectByVisibleText("25");


        WebElement states = driver.findElement(By.id("state"));
        Select outOfStates = new Select(states);
        outOfStates.selectByValue("VA");

        Select outOflanguages = new Select(driver.findElement(By.name("Languages")));
        Thread.sleep(2000);
        outOflanguages.selectByVisibleText("Java");
        outOflanguages.selectByVisibleText("Python");

        for(WebElement selectedOption: outOflanguages.getAllSelectedOptions()){
            System.out.println(selectedOption.getText());
        }

        outOflanguages.deselectByVisibleText("Java");





//        Select outOflanguages = new Select(languages);
//        outOflanguages.getFirstSelectedOption();

//       WebElement dd= driver.findElement(By.linkText("Google"));
//        Select outOfSearch = new Select(dd);
//        outOfSearch.selectByVisibleText("Google");










    }
}
