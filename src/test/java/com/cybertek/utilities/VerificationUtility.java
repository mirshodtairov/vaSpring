package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

public class VerificationUtility {
    public static void main(String[] args) {


    }

    public static void verifyEquals(String expected, String actual) {
        if (expected.equalsIgnoreCase(actual)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }


    }

    public static void verifySelected(WebElement element, boolean checked) {
        if (checked) {
            if (element.isSelected()) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("Element must be selected");
            }
        }
        if (!checked) {
            if (element.isSelected()) {
                System.out.println("FAIL");
                System.out.println("Element must not be selected");
            } else {
                System.out.println("PASS");

            }


        }
    }
}
