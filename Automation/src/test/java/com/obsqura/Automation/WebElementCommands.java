package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
 public void webElementCommands()
 {
    WebElement SingleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	SingleInputField.sendKeys("hello");
	WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	showmessage.click();
	WebElement YourMessage=driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
	String yourmessagetext=YourMessage.getText();
	String classnameshowmsgbotton=showmessage.getAttribute("class");
	String showmsgid=showmessage.getAttribute("id");
	String showmsgtag=showmessage.getTagName();
	SingleInputField.clear();
	
	String backcolorshowmsgbtn=showmessage.getCssValue("background-color");
	String backcolor=showmessage.getCssValue("color");
	String fonttweight=showmessage.getCssValue("font-weight");
 }
	

	public void verifyTwoInputField()
	{
		WebElement TwoInputFields=driver.findElement(By.xpath("//div[@class=\"card-header\"]"));
	    WebElement EnterValueA=driver.findElement(By.xpath("//input[@id=\"value-a\"]"));
	    EnterValueA.sendKeys("10");
	    WebElement EnterValueB=driver.findElement(By.xpath("//input[@id=\"value-b\"]"));
	    EnterValueB.sendKeys("20");
	    WebElement GetTotal=driver.findElement(By.xpath("//button[@id=\"button-two\"]"));
	    GetTotal.click();
	    
	    String backgroundcolorgettoral=GetTotal.getCssValue("background-color");
	    String fontcolorgettotal=GetTotal.getCssValue("color");
	    String fontsizegettotal=GetTotal.getCssValue("font-size");
	    String borderradiusgettotal=GetTotal.getCssValue("border-radius");
	    String textalignmentgettotal=GetTotal.getCssValue("text-align");   
	 }

	public static void main(String[] args) 
	{
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.intializeBrowser();
		webelementcommands.webElementCommands();
		webelementcommands.verifyTwoInputField();
		webelementcommands.driverCloseOrQuit();
	}

}
