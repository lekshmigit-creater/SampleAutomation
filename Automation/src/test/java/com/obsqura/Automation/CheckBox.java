package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	public void checkBox()
	{
	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement Clickonthischeckbox=driver.findElement(By.id("gridCheck"));
	Clickonthischeckbox.click();
	}
	public static void main(String[] args) 
	{
	CheckBox checkbox=new CheckBox();
	checkbox.intializeBrowser();
	checkbox.checkBox();
    checkbox.driverCloseOrQuit();
	}

}

