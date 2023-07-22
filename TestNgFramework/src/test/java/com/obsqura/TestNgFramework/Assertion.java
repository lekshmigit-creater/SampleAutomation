package com.obsqura.TestNgFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void assertEqualSample()
	{
		String input="hello";
		String expectedvalue="Your Message : "+input;
		WebElement SingleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		SingleInputField.sendKeys(input);
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-two']"));
		String yourmessagetext=yourMessage.getText();
		assertEquals(expectedvalue,yourmessagetext,"Expected message not"+expectedvalue);
	}
	@Test
	public void asserNotEqualsSample()
	{
	String expectedvalue="abc";
	String actualvalue="def";
	assertNotEquals(expectedvalue,actualvalue,"expected and actual values are same");
	}
	@Test
	public void assertTrueSample()
	{
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.isDisplayed();
		boolean isdisplayedshowmessagebutton=showmessagebutton.isDisplayed();
		boolean isenabledshowmessagebutton=showmessagebutton.isEnabled();
		assertTrue(isdisplayedshowmessagebutton,"showmessage not displayed");
}
	@Test
	public void assertFalseSample()
	{
	boolean value=false;
	assertFalse(value,"value is true");
	}
	@Test
	public void assertNullSample()
	{
		String value="null";
		assertNull(value,"value is notnull");
	}
	@Test
	public void assertNotNullSample()
	{
		String value="abc";
		assertNotNull(value,"value is null");
	}
}
