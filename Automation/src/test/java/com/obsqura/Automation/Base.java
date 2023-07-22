package com.obsqura.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
  public WebDriver driver;
public void intializeBrowser()
{

System.setProperty("webdriver.chrome.driver","F:\\eclipse\\workspace\\Automation\\src\\main\\java\\com\\obsqura\\Automation\\Resources\\chromedriver.exe" );

	driver= new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
}
public void driverCloseOrQuit()
{
//driver.close();
driver.quit();
}
public static void main(String[] args) 
{
   Base base=new Base();
   base.intializeBrowser();
   base.driverCloseOrQuit();
}

}