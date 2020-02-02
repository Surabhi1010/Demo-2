package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1Test {

	 @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @Test
  public void test1() {
	  
	  System.out.println("Test1");
	  System.out.println("added code");
	  System.out.println("added code 2");
	  
  }
  @Test
  public void test12() {
	  
	  System.out.println("Test1");
	  System.out.println("added code");
	  System.out.println("added code 2");
	  
  }
  
  @Test
  public void test2() {
	  
	  System.out.println("Test2");
	  System.out.println("code added bhy y user");
	  System.out.println("code added bhy y user1");
	  System.out.println("code added bhy y user2");
  }
  @Test
  public void test3() {
	  
	  System.out.println("Test3");
  }
		 
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After  Method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After Class");
  }

 @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit");
  }

}
