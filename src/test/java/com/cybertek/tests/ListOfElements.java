package com.cybertek.tests;

import com.cybertek.utilities.VerificationUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class ListOfElements {

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        List<WebElement> buttons = driver.findElements(By.name("sport"));
        System.out.println(buttons.size());

        //verify none selected
        for (WebElement button : buttons) {
            VerificationUtility.verifySelected(button, false);
        }

        //select any radio

        Random random = new Random();
        int number = random.nextInt(4);
        System.out.println(number);


        for(int i = 0; i<buttons.size(); i++){
            if(i==number){
                VerificationUtility.verifySelected(buttons.get(i), true);
            }else{
                VerificationUtility.verifySelected(buttons.get(i), false);
            }
        }
        int number2;
        do {
            number2= random.nextInt(4);
        }while (number==number);
        System.out.println("number2 = " + number2);
        System.out.println("number = " + number);


    }
}
