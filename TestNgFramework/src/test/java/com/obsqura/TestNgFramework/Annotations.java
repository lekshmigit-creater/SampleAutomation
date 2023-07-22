package com.obsqura.TestNgFramework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Annotations extends Base
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
}  @BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}	
@BeforeSuite	
public void beforeSuite()
{
	System.out.println("before suite");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("after suite");
}
@AfterTest
public void afterTest()
{
	System.out.println("after test");
}
 @Test
  public void testCase1()
   {
	System.out.println("testcase1");
   }
 @BeforeMethod
 public void beforeMethod()
 {
	 System.out.println("before method");
 }
 @AfterMethod
 public void AfterMethod()
 {
	 System.out.println("After method");
 }
 
@Test
  public void testcase2()
  {
    System.out.println("testcase2");	
   }


}
