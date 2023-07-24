package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends Base {
	public void radioButtons()
	{
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");	
	WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	female.click();
	boolean isSelectFemale=female.isSelected();
	WebElement showselectedvalue=driver.findElement(By.xpath("//button[@id='button-one']"));
	showselectedvalue.click();
	WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
	message.getText();
	}

	public static void main(String[] args) 
	{
	 RadioButtons radiobuttons=new RadioButtons();
	 radiobuttons.intializeBrowser();
	 radiobuttons.radioButtons();
	 radiobuttons.driverCloseOrQuit();

	}

}
