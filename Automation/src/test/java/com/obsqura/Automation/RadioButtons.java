package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends Base {
	public void radioButtons()
	{
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");	
	WebElement male=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
	WebElement female=driver.findElement(By.xpath("//label[@for='inlineRadio2']"));
	boolean isSelectFemale=female.isSelected();
	WebElement showselectedvalue=driver.findElement(By.xpath("//button[@id='button-one']"));
	showselectedvalue.click();
	showselectedvalue.getText();
	}

	public static void main(String[] args) 
	{
	 RadioButtons radiobuttons=new RadioButtons();
	 radiobuttons.intializeBrowser();
	 radiobuttons.radioButtons();
	 //radiobuttons.driverCloseOrQuit();

	}

}
