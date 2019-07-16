package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGDemo {

    @BeforeClass
    public void test1(){
        System.out.println("Before class");


    }
    @BeforeMethod()
    public void test5(){

        System.out.println("Before method");


    }

    @Test
    public void Test2(){

        System.out.println("testcase test N1");

    }

    @Test
    public void Test4(){

        System.out.println("testcase test N2");

    }
    @AfterMethod
    public void Test3(){
        System.out.println("After method");
    }

    @BeforeTest
    public  void  test6(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void test(){
        System.out.println("After test");
    }
    @AfterClass
    public void test7(){
        System.out.println("After class");


    }









}
