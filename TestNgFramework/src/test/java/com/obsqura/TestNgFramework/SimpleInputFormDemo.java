package com.obsqura.TestNgFramework;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class SimpleInputFormDemo extends Base 
{
	@Test
 public void verifyTwoInputField()
  {
		int EntervalueAinput=10;
		int EntervalueBinput=20;
		int gettotalinput=EntervalueAinput+EntervalueBinput;
		String expectedvalue="Total A + B : "+gettotalinput;
		WebElement textFieldOfEntervalueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		textFieldOfEntervalueA.sendKeys(String.valueOf(EntervalueAinput));
		WebElement textFieldOfEntervalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		textFieldOfEntervalueB.sendKeys(String.valueOf(EntervalueBinput));
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotalbutton.click();
		WebElement totalmsg=driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalmsgtext=totalmsg.getText();
		assertEquals(expectedvalue,totalmsgtext,"Expected message not"+expectedvalue);
}
	@Test
  public void verifyTheColorOfShowMsgButton()
  {
	String expectedcolor="rgba(255, 255, 255, 1)";
	WebElement showmsgbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
	String colorofshowmsgbutton=showmsgbutton.getCssValue("color");
	assertEquals(expectedcolor,colorofshowmsgbutton,"Expected message not"+expectedcolor);
  }
	@Test
 public void verifyTheFontSizeOfShowMsgButton()
	{
		String expectedvalue="16px";
		WebElement showmsgbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontsizeofshowmsgbutton=showmsgbutton.getCssValue("font-size");
		assertEquals(expectedvalue,fontsizeofshowmsgbutton,"Expected message not"+expectedvalue);
	}
	@Test
  public void verifyTheFontWeightOfGetTotalButton()
	{
		String expectedvalue="400";
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		String fontweightofgettotalbutton=gettotalbutton.getCssValue("font-weight");
		assertEquals(expectedvalue,fontweightofgettotalbutton,"Expected message not"+expectedvalue);
	}	
	
}
	


