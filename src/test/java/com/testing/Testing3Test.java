package com.testing;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3Test {
	SoftAssert softAssert =new SoftAssert();	//Crearted an object for soft assert;
  @Test(priority=1)
  public void hometest() {
	  System.out.println("I am in home test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(4>3,"Varifying element");
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
  }
  @Test(priority=2,dependsOnMethods="hometest",groups= {"smoke","sanity"})
  public void maintest() {
	  System.out.println("I am in home test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2<3,"Varifying element");//used object to put soft assertion;
	  System.out.println("After Assertion");
	  softAssert.assertEquals("abc", "abc");
	  softAssert.assertAll();	//Similar to error collector in Junit;it will show error in report;
  }
  
  @Test(priority=3,dependsOnMethods="maintest",groups= {"gopi"})
  public void endtest() {
	  System.out.println("I am in home test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2<3,"Varifying element");
	  System.out.println("After Assertion");
	  softAssert.assertEquals("abc", "abc");
	  softAssert.assertAll();	
}
}
